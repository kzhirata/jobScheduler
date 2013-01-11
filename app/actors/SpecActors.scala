package actors

import java.util._

import play.api._
import akka.actor._
import akka.util.duration._

import persistence._
import persistence.PersistenceContext._

import models._

object SpecActors {

  case class Execute(job: Option[Job])

  class RecvActor extends Actor {
    def receive = {
      case Execute(job) => execute(job)
    }
  }

  def execute(job: Option[Job]) {
    withConnection { implicit s =>
      val jobS = JobStore findById job.get.id
      if (isExecutable(jobS)) {
        doJob(job)
        executeReset(job)
      } else {
        Logger.info(job.get.jobName + " is not executable. ")
      }
    }
  }

  def isExecutable(job: Option[Job]): Boolean = {
    job.get.status == 0 && isExecuteConditions(job)
  }

  def isExecuteConditions(job: Option[Job]): Boolean = {
    withConnection { implicit s =>
      //TODO ここの実装ダサすぎる。forで廻さず、SQL一発で判断できる。
      val jobName = job.get.jobName
      val jobConditionList = JobConditionStore findByJobName jobName
      for (jobCondition <- jobConditionList) {
        val value = jobCondition.parentJobName
        val jobList = JobStore search value
        for (job <- jobList) {
          Logger.debug("conditions jobName : " + job.jobName + ", status : " + job.status)
          if (job.status != 2) {
            return false
          }
        }
      }
    }
    true
  }
  
  def executeReset(job: Option[Job]) {
    withTransaction { implicit s =>
      val groupid = job.get.groupId
      val count = JobStore notFinishedCountByGroupId groupid
      if (count.get == 0) {
        //何か、myBatisは、scalaのMapはパラメータで受け付けないっぽい。
        val param = new HashMap[String, Object]();
        param.put("status", "0")
        param.put("groupid", job.get.groupId.toString())

        JobStore updateStatusByGroupId param
        Logger.debug("reset status.")
      }
      Logger.debug("executeReset ends.")
    }
  }

  def doJob(job: Option[Job]) {
    try {
      //job status 0 => 1
      Logger.debug("job :" + job.get.jobName + " starts !")
      updateJobStatus(job, 1)

      //ジョブ実行の本処理
      val clazz = Class.forName(job.get.jobClass)
      val exJob = clazz.newInstance().asInstanceOf[com.domain.Job]
      exJob.doJob()

      //job status 1 => 2
      updateJobStatus(job, 2)
      Logger.debug("job :" + job.get.jobName + " ends !")
    } catch {
      //job status * => 9
      case e: Throwable =>
        updateJobStatus(job, 9)
        Logger.error("job :" + job.get.jobName + " has errors !", e)
    }
  }
    
  def updateJobStatus(job: Option[Job], status: Int) {
    withTransaction { implicit s =>
      val updateJob = new Job
      updateJob.id = job.get.id
      updateJob.status = status
      JobStore updateStatus updateJob
    }
  }  
}
