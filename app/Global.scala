import models._
import actors._
import persistence._
import context._

import play.api._
import play.api.Play.current
import play.api.libs.concurrent._

import akka.util.Timeout
import akka.util.duration._
import akka.pattern.ask
import akka.actor.Props

import persistence.PersistenceContext.withConnection

import org.quartz.{JobKey,TriggerKey}
import org.quartz.utils._

import us.theatr.akka.quartz._

object Global extends GlobalSettings {

  override def onStart(app: Application) {
    Logger.info("Application has started")
    startJobs
  }

  def startJobs {
    withConnection { implicit s =>
      JobStore.findAll().foreach { job =>
        startJob(Option(job))
      }
    }
  }

  def startJob(job: Option[Job]) {
    //メインジョブ起動
    val jobActor = Akka.system.actorOf(Props(new QuartzActor))
    val recv = Akka.system.actorOf(Props(new SpecActors.RecvActor))
    implicit val timeout = Timeout(5 seconds)
    val future = (jobActor ? AddCronSchedule(recv, job.get.cron, SpecActors.Execute(job), true))
    JobExecutionContext.put(job.get.jobName, future)        
  }

  override def onStop(app: Application) {
    Logger.info("Application shutdown...")
  }

}
