package persistence

import org.mybatis.scala.mapping._
import models._

object JobConditionStore {

  val search = new SelectListBy[String,JobCondition] {
    def xsql = <xsql>
      SELECT * 
      FROM jobcondition
      WHERE lower(jobName) like lower(#{{jobName}})
    </xsql>
  }

  val findById = new SelectOneBy[Long,JobCondition] {
    def xsql = <xsql>
      SELECT *
      FROM jobcondition
      WHERE id = #{{id}}
    </xsql>
  }

  val findByJobName = new SelectListBy[String,JobCondition] {
    def xsql = <xsql>
      SELECT *
      FROM jobcondition
      WHERE jobName = #{{jobName}} 
      ORDER BY id
    </xsql>
  }

  val update = new Update[JobCondition] {
    def xsql = <xsql>
      UPDATE jobcondition 
      SET jobName = #{{jobName}}, status = #{{status}}, groupId = #{{groupId}}, cron = #{{cron}}
      WHERE id = #{{id}}
    </xsql>
  }

  val insert = new Insert[JobCondition] {
    def xsql = <xsql>
      INSERT INTO job (jobName, parentJobName)
      VALUES (#{{jobName}}, #{{parentJobName}})
    </xsql>
  }

  val delete = new Delete[Long] {
    def xsql = <xsql>DELETE FROM jobcondition WHERE id = #{{id}}</xsql>
  }

  def bind = Seq(search, findById, findByJobName ,update, insert, delete)

}
