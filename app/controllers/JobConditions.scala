package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import persistence.PersistenceContext._
import persistence._
import models._
import play.api.data.format.Formats._
import scala.collection.JavaConversions._

object JobConditions extends Controller {

  val searchForm = Form[String] (
    "filter" -> text
  )

  val editForm = Form[JobCondition] (
    mapping(
      "id" -> optional(of[Long]),
      "jobName" -> nonEmptyText,
      "parentJobName" -> nonEmptyText
    )(JobCondition.apply)(JobCondition.unapply)
  )

  def home(filter : String = "")  = Action {
    withConnection { implicit s =>
      val jobconditions = JobConditionStore search "%" + filter + "%"

      Ok(views.html.jobconditions.home("JobConditions", jobconditions.toList, searchForm))
    }
  }
 
  def search = Action { implicit req =>
    searchForm.bindFromRequest.fold(
      formWithErrors => Redirect(routes.JobConditions.home("")),
      filter => Redirect(routes.JobConditions.home(filter))
    )
  }

  def create = Action {
    Ok(views.html.jobconditions.form("New JobCondition", editForm))
  }

  def edit(id : Long) = Action {
    withConnection { implicit s =>
      JobConditionStore.findById(id) match {
        case None => BadRequest(<h1>JobCondition {id} does not extists!</h1>)
        case Some(job) => 
          val f = editForm.fill(job)
          Ok(views.html.jobconditions.form("Edit JobCondition", f))
      }
    }
  }

  def delete(id : Long) = Action {
    withTransaction { implicit s =>
      JobConditionStore delete id
      Redirect(routes.JobConditions.home(""))
    }
  }

  def save = Action { implicit req =>
    withConnection { implicit s =>
      editForm.bindFromRequest.fold(
        formWithErrors => BadRequest(views.html.jobconditions.form("Edit JobCondition", formWithErrors)),
        job  => {
          if (job.id == 0) JobConditionStore.insert(job) else JobConditionStore.update(job)
          Redirect(routes.JobConditions.home(""))
        }
      )
    }
  }
      

}
