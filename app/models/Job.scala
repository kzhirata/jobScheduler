package models

class Job {
  var id : Long = _
  var jobName : String = _
  var jobClass : String = _
  var status : Int = _
  var groupId : Long = _
  var cron : String = _
}

object Job {

  def apply(id: Option[Long], jobName: String, jobClass: String, status: Int, groupId: Long, cron: String) = {
      
    val c = new Job
    c.id = id.getOrElse(0)
    c.jobName = jobName
    c.jobClass = jobClass
    c.status = status
    c.groupId = groupId
    c.cron = cron
    c
    
  }

  def unapply(c : Job) = Some((Option(c.id), c.jobName, c.jobClass, c.status, c.groupId, c.cron))

}
