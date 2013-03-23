package context

import scala.collection.mutable._
import scala.concurrent.Future
import play.Logger

object JobExecutionContext {

  private val map = new HashMap[String,Future[Any]] 
  
  def put(key:String,value:Future[Any]) = {
    map.put(key, value)
  }
  
  def get(key:String) = {
    map.get(key)
  }
}