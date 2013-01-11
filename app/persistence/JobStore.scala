package persistence

import org.mybatis.scala.mapping._
import models._
import play.Logger

//これ後で消す
import controllers.ParamJob

object JobStore {

  val findAll = new SelectList[Job] {
    def xsql = <xsql>SELECT * FROM job ORDER BY id</xsql>
  }
  
  val search = new SelectListBy[String,Job] {
    def xsql = <xsql>
      SELECT * 
      FROM job
      WHERE 
        lower(jobName) LIKE lower(#{{value}})
      ORDER BY id
    </xsql>
  }

  val search2 = new SelectListBy[ParamJob, Job] {
    def xsql = <xsql>
      SELECT * 
      FROM job
      WHERE 
        lower(jobName) LIKE lower(#{{jobName}})
      ORDER BY id
    </xsql>
  }
  
  val findById = new SelectOneBy[Long,Job] {
    def xsql = <xsql>
      SELECT *
      FROM job
      WHERE id = #{{id}}
    </xsql>
  }

  val findByJobName = new SelectOneBy[String,Job] {
    def xsql = <xsql>
      SELECT *
      FROM job
      WHERE jobName = #{{jobName}}
      ORDER BY ID 
      LIMIT 1 
    </xsql>
  }

  val notFinishedCountByGroupId = new SelectOneBy[Long,Long] {
    def xsql = <xsql>
      SELECT count(1)
      FROM job
      WHERE groupid = #{{groupid}} and status != 2
    </xsql>
  }
  
  
  val update = new Update[Job] {
    def xsql = <xsql>
      UPDATE job 
      SET jobName = #{{jobName}}, jobClass = #{{jobClass}}, status = #{{status}}, groupId = #{{groupId}}, cron = #{{cron}}
      WHERE id = #{{id}}
    </xsql>
  }

  val updateStatus = new Update[Job] {
    def xsql = <xsql>
      UPDATE job 
      SET status = #{{status}}
      WHERE id = #{{id}}
    </xsql>
  }

  val updateStatusByGroupId = new Update[java.util.Map[String, Object]] {
    def xsql = <xsql>UPDATE job 
      SET status = #{{status}}
      WHERE groupid = #{{groupid}}
     </xsql>
  }

  val insert = new Insert[Job] {
    def xsql = <xsql>
      INSERT INTO job (jobName, jobClass, status, groupId, cron)
      VALUES (#{{jobName}}, #{{jobClass}}, #{{status}}, #{{groupId}}, #{{cron}})
    </xsql>
  }

  val delete = new Delete[Long] {
    def xsql = <xsql>DELETE FROM job WHERE id = #{{id}}</xsql>
  }

  //ここにmyBatis対象とする関数を定義する。
  def bind = Seq(findAll, search, search2, findById, findByJobName ,notFinishedCountByGroupId , update, updateStatus, updateStatusByGroupId, insert, delete)

}
