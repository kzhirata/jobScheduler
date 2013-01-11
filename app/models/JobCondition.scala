package models

class JobCondition {
  var id : Long = _
  var jobName : String = _
  var parentJobName : String = _
}

object JobCondition {

  def apply(id: Option[Long], jobName: String, parentJobName: String) = {
    val c = new JobCondition
    c.id = id.getOrElse(0)
    c.jobName = jobName
    c.parentJobName = parentJobName
    c
  }

  def unapply(c : JobCondition) = Some((Option(c.id), c.jobName, c.parentJobName))

}
