package controllers

import models._
import actors._
import context._
import persistence._
import persistence.PersistenceContext._

import akka.util.Timeout
import akka.pattern.ask
import akka.actor._

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.data.format.Formats._
import play.api.libs.json._
import play.api.libs.iteratee._
import play.api.libs.concurrent._
import play.api.libs.concurrent.Execution.Implicits._
import play.api.Play.current
import scala.concurrent.duration._

import us.theatr.akka.quartz._

object Jobs extends Controller {

  val searchForm = Form[String](
    "filter" -> text)

  val editForm = Form[Job](
    mapping(
      "id" -> optional(of[Long]),
      "jobName" -> nonEmptyText,
      "jobClass" -> nonEmptyText,
      "status" -> number,
      "groupId" -> of[Long],
      "cron" -> nonEmptyText)(Job.apply)(Job.unapply))

  def home(filter: String = "") = Action {
    withConnection { implicit s =>
      val jobs = JobStore search "%" + filter + "%"
      Ok(views.html.jobs.home("Jobs", jobs.toList, searchForm))

      //複数のパラメータの場合、このようにPOJOを定義する。
      //      val job = new ParamJob(filter)      
      //      val jobs2 = JobStore search2 job
      //      Ok(views.html.jobs.home("Jobs", jobs2, searchForm))
    }
  }

  def search = Action { implicit req =>
    searchForm.bindFromRequest.fold(
      formWithErrors => Redirect(routes.Jobs.home("")),
      filter => Redirect(routes.Jobs.home(filter)))
  }

  def create = Action {
    Ok(views.html.jobs.form("New Job", editForm))
  }

  def edit(id: Long) = Action {
    withConnection { implicit s =>
      JobStore.findById(id) match {
        case None => BadRequest(<h1>Job { id } does not extists!</h1>)
        case Some(job) =>
          val form = editForm.fill(job)
          Ok(views.html.jobs.form("Edit Job", form))
      }
    }
  }

  def delete(id: Long) = Action {
    withTransaction { implicit s =>
      JobStore delete id
      Redirect(routes.Jobs.home(""))
    }
  }

  def start(id: Long) = Action {

    //ジョブステータス 0 => 1
    withConnection { implicit s =>
      Logger.info("start !")
      val job = JobStore findById id
      val jobActor = Akka.system.actorOf(Props(new SpecActors.RecvActor))

      Akka.system.scheduler.scheduleOnce(
        0 seconds,
        jobActor,
        SpecActors.Execute(job))
    }

    //ページ遷移
    Redirect(routes.Jobs.home(""))
  }

  def reset(id: Long) = Action {

    //ジョブステータス  => 0
    withTransaction { implicit s =>
      val j = new Job
      j.id = id
      j.status = 0
      JobStore updateStatus j
    }

    //ページ遷移
    Redirect(routes.Jobs.home(""))

  }

  def save = Action { implicit req =>
    withTransaction { implicit s =>
      editForm.bindFromRequest.fold(
        formWithErrors => BadRequest(views.html.jobs.form("Edit Job", formWithErrors)),
        job => {
          if (job.id == 0) {
            JobStore.insert(job)
            val sJob = JobStore findByJobName job.jobName
            job.id = sJob.get.id
          } else {
            JobStore.update(job)
            cancel(job)
          }
          execute(job)

          Redirect(routes.Jobs.home(""))
        })
    }
  }

  def cancel(job: Job) {
    //メインジョブキャンセル
    val future = JobExecutionContext.get(job.jobName)
    val cancel = future.get.value.getOrElse("0") match {
      case Right(AddCronScheduleSuccess(cancel)) => cancel
    }
    cancel.cancel()
  }

  def execute(job: Job) {
    //メインジョブ起動
    val jobActor = Akka.system.actorOf(Props(new QuartzActor))
    val recv = Akka.system.actorOf(Props(new SpecActors.RecvActor))
    implicit val timeout = Timeout(5)
    val future = (jobActor ? AddCronSchedule(recv, job.cron, SpecActors.Execute(Option(job)), true))
    JobExecutionContext.put(job.jobName, future)
  }
  
}

//これも試しなので後で消す。
class ParamJob(filter :String){
    val jobName = "%" + filter + "%"
}
