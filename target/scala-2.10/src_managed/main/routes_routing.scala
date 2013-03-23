// @SOURCE:/Users/hiratak_work/Desktop/a/eclipse/Eclipse.app/Contents/MacOS/workspace/jobScheduler/conf/routes
// @HASH:e0a9c7745dc6499fd4a6c433c687b41424ca59ff
// @DATE:Sat Mar 23 19:58:40 JST 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:7
private[this] lazy val controllers_Jobs_home0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Jobs_home1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("job/"))))
        

// @LINE:9
private[this] lazy val controllers_Jobs_search2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("job/search"))))
        

// @LINE:10
private[this] lazy val controllers_Jobs_edit3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("job/edit/"),DynamicPart("id", """[^/]+"""))))
        

// @LINE:11
private[this] lazy val controllers_Jobs_create4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("job/create"))))
        

// @LINE:12
private[this] lazy val controllers_Jobs_save5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("job/save"))))
        

// @LINE:13
private[this] lazy val controllers_Jobs_delete6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("job/delete/"),DynamicPart("id", """[^/]+"""))))
        

// @LINE:14
private[this] lazy val controllers_Jobs_start7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("job/start/"),DynamicPart("id", """[^/]+"""))))
        

// @LINE:15
private[this] lazy val controllers_Jobs_reset8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("job/reset/"),DynamicPart("id", """[^/]+"""))))
        

// @LINE:17
private[this] lazy val controllers_JobConditions_home9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jobcondition/"))))
        

// @LINE:18
private[this] lazy val controllers_JobConditions_search10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jobcondition/search"))))
        

// @LINE:19
private[this] lazy val controllers_JobConditions_edit11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jobcondition/edit/"),DynamicPart("id", """[^/]+"""))))
        

// @LINE:20
private[this] lazy val controllers_JobConditions_create12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jobcondition/create"))))
        

// @LINE:21
private[this] lazy val controllers_JobConditions_save13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jobcondition/save"))))
        

// @LINE:22
private[this] lazy val controllers_JobConditions_delete14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jobcondition/delete/"),DynamicPart("id", """[^/]+"""))))
        

// @LINE:25
private[this] lazy val controllers_Assets_at15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+"""))))
        
def documentation = List(("""GET""", prefix,"""controllers.Jobs.home(filter:String ?= "%")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """job/""","""controllers.Jobs.home(filter:String ?= "%")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """job/search""","""controllers.Jobs.search"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """job/edit/$id<[^/]+>""","""controllers.Jobs.edit(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """job/create""","""controllers.Jobs.create"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """job/save""","""controllers.Jobs.save"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """job/delete/$id<[^/]+>""","""controllers.Jobs.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """job/start/$id<[^/]+>""","""controllers.Jobs.start(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """job/reset/$id<[^/]+>""","""controllers.Jobs.reset(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jobcondition/""","""controllers.JobConditions.home(filter:String ?= "%")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jobcondition/search""","""controllers.JobConditions.search"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jobcondition/edit/$id<[^/]+>""","""controllers.JobConditions.edit(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jobcondition/create""","""controllers.JobConditions.create"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jobcondition/save""","""controllers.JobConditions.save"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jobcondition/delete/$id<[^/]+>""","""controllers.JobConditions.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:7
case controllers_Jobs_home0(params) => {
   call(params.fromQuery[String]("filter", Some("%"))) { (filter) =>
        invokeHandler(controllers.Jobs.home(filter), HandlerDef(this, "controllers.Jobs", "home", Seq(classOf[String]),"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Jobs_home1(params) => {
   call(params.fromQuery[String]("filter", Some("%"))) { (filter) =>
        invokeHandler(controllers.Jobs.home(filter), HandlerDef(this, "controllers.Jobs", "home", Seq(classOf[String]),"GET", """""", Routes.prefix + """job/"""))
   }
}
        

// @LINE:9
case controllers_Jobs_search2(params) => {
   call { 
        invokeHandler(controllers.Jobs.search, HandlerDef(this, "controllers.Jobs", "search", Nil,"GET", """""", Routes.prefix + """job/search"""))
   }
}
        

// @LINE:10
case controllers_Jobs_edit3(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Jobs.edit(id), HandlerDef(this, "controllers.Jobs", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """job/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:11
case controllers_Jobs_create4(params) => {
   call { 
        invokeHandler(controllers.Jobs.create, HandlerDef(this, "controllers.Jobs", "create", Nil,"GET", """""", Routes.prefix + """job/create"""))
   }
}
        

// @LINE:12
case controllers_Jobs_save5(params) => {
   call { 
        invokeHandler(controllers.Jobs.save, HandlerDef(this, "controllers.Jobs", "save", Nil,"POST", """""", Routes.prefix + """job/save"""))
   }
}
        

// @LINE:13
case controllers_Jobs_delete6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Jobs.delete(id), HandlerDef(this, "controllers.Jobs", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """job/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:14
case controllers_Jobs_start7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Jobs.start(id), HandlerDef(this, "controllers.Jobs", "start", Seq(classOf[Long]),"GET", """""", Routes.prefix + """job/start/$id<[^/]+>"""))
   }
}
        

// @LINE:15
case controllers_Jobs_reset8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Jobs.reset(id), HandlerDef(this, "controllers.Jobs", "reset", Seq(classOf[Long]),"GET", """""", Routes.prefix + """job/reset/$id<[^/]+>"""))
   }
}
        

// @LINE:17
case controllers_JobConditions_home9(params) => {
   call(params.fromQuery[String]("filter", Some("%"))) { (filter) =>
        invokeHandler(controllers.JobConditions.home(filter), HandlerDef(this, "controllers.JobConditions", "home", Seq(classOf[String]),"GET", """""", Routes.prefix + """jobcondition/"""))
   }
}
        

// @LINE:18
case controllers_JobConditions_search10(params) => {
   call { 
        invokeHandler(controllers.JobConditions.search, HandlerDef(this, "controllers.JobConditions", "search", Nil,"GET", """""", Routes.prefix + """jobcondition/search"""))
   }
}
        

// @LINE:19
case controllers_JobConditions_edit11(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.JobConditions.edit(id), HandlerDef(this, "controllers.JobConditions", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """jobcondition/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:20
case controllers_JobConditions_create12(params) => {
   call { 
        invokeHandler(controllers.JobConditions.create, HandlerDef(this, "controllers.JobConditions", "create", Nil,"GET", """""", Routes.prefix + """jobcondition/create"""))
   }
}
        

// @LINE:21
case controllers_JobConditions_save13(params) => {
   call { 
        invokeHandler(controllers.JobConditions.save, HandlerDef(this, "controllers.JobConditions", "save", Nil,"POST", """""", Routes.prefix + """jobcondition/save"""))
   }
}
        

// @LINE:22
case controllers_JobConditions_delete14(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.JobConditions.delete(id), HandlerDef(this, "controllers.JobConditions", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """jobcondition/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:25
case controllers_Assets_at15(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        