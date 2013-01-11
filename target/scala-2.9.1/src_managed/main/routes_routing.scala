// @SOURCE:/Users/hiratak_work/Documents/workspace/jobScheduler/conf/routes
// @HASH:e0a9c7745dc6499fd4a6c433c687b41424ca59ff
// @DATE:Tue Dec 25 02:36:37 JST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:7
val controllers_Jobs_home0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:8
val controllers_Jobs_home1 = Route("GET", PathPattern(List(StaticPart("/job/"))))
                    

// @LINE:9
val controllers_Jobs_search2 = Route("GET", PathPattern(List(StaticPart("/job/search"))))
                    

// @LINE:10
val controllers_Jobs_edit3 = Route("GET", PathPattern(List(StaticPart("/job/edit/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:11
val controllers_Jobs_create4 = Route("GET", PathPattern(List(StaticPart("/job/create"))))
                    

// @LINE:12
val controllers_Jobs_save5 = Route("POST", PathPattern(List(StaticPart("/job/save"))))
                    

// @LINE:13
val controllers_Jobs_delete6 = Route("POST", PathPattern(List(StaticPart("/job/delete/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:14
val controllers_Jobs_start7 = Route("GET", PathPattern(List(StaticPart("/job/start/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:15
val controllers_Jobs_reset8 = Route("GET", PathPattern(List(StaticPart("/job/reset/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:17
val controllers_JobConditions_home9 = Route("GET", PathPattern(List(StaticPart("/jobcondition/"))))
                    

// @LINE:18
val controllers_JobConditions_search10 = Route("GET", PathPattern(List(StaticPart("/jobcondition/search"))))
                    

// @LINE:19
val controllers_JobConditions_edit11 = Route("GET", PathPattern(List(StaticPart("/jobcondition/edit/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:20
val controllers_JobConditions_create12 = Route("GET", PathPattern(List(StaticPart("/jobcondition/create"))))
                    

// @LINE:21
val controllers_JobConditions_save13 = Route("POST", PathPattern(List(StaticPart("/jobcondition/save"))))
                    

// @LINE:22
val controllers_JobConditions_delete14 = Route("POST", PathPattern(List(StaticPart("/jobcondition/delete/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:25
val controllers_Assets_at15 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Jobs.home(filter:String ?= "%")"""),("""GET""","""/job/""","""controllers.Jobs.home(filter:String ?= "%")"""),("""GET""","""/job/search""","""controllers.Jobs.search"""),("""GET""","""/job/edit/$id<[^/]+>""","""controllers.Jobs.edit(id:Long)"""),("""GET""","""/job/create""","""controllers.Jobs.create"""),("""POST""","""/job/save""","""controllers.Jobs.save"""),("""POST""","""/job/delete/$id<[^/]+>""","""controllers.Jobs.delete(id:Long)"""),("""GET""","""/job/start/$id<[^/]+>""","""controllers.Jobs.start(id:Long)"""),("""GET""","""/job/reset/$id<[^/]+>""","""controllers.Jobs.reset(id:Long)"""),("""GET""","""/jobcondition/""","""controllers.JobConditions.home(filter:String ?= "%")"""),("""GET""","""/jobcondition/search""","""controllers.JobConditions.search"""),("""GET""","""/jobcondition/edit/$id<[^/]+>""","""controllers.JobConditions.edit(id:Long)"""),("""GET""","""/jobcondition/create""","""controllers.JobConditions.create"""),("""POST""","""/jobcondition/save""","""controllers.JobConditions.save"""),("""POST""","""/jobcondition/delete/$id<[^/]+>""","""controllers.JobConditions.delete(id:Long)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:7
case controllers_Jobs_home0(params) => {
   call(params.fromQuery[String]("filter", Some("%"))) { (filter) =>
        invokeHandler(_root_.controllers.Jobs.home(filter), HandlerDef(this, "controllers.Jobs", "home", Seq(classOf[String])))
   }
}
                    

// @LINE:8
case controllers_Jobs_home1(params) => {
   call(params.fromQuery[String]("filter", Some("%"))) { (filter) =>
        invokeHandler(_root_.controllers.Jobs.home(filter), HandlerDef(this, "controllers.Jobs", "home", Seq(classOf[String])))
   }
}
                    

// @LINE:9
case controllers_Jobs_search2(params) => {
   call { 
        invokeHandler(_root_.controllers.Jobs.search, HandlerDef(this, "controllers.Jobs", "search", Nil))
   }
}
                    

// @LINE:10
case controllers_Jobs_edit3(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Jobs.edit(id), HandlerDef(this, "controllers.Jobs", "edit", Seq(classOf[Long])))
   }
}
                    

// @LINE:11
case controllers_Jobs_create4(params) => {
   call { 
        invokeHandler(_root_.controllers.Jobs.create, HandlerDef(this, "controllers.Jobs", "create", Nil))
   }
}
                    

// @LINE:12
case controllers_Jobs_save5(params) => {
   call { 
        invokeHandler(_root_.controllers.Jobs.save, HandlerDef(this, "controllers.Jobs", "save", Nil))
   }
}
                    

// @LINE:13
case controllers_Jobs_delete6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Jobs.delete(id), HandlerDef(this, "controllers.Jobs", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:14
case controllers_Jobs_start7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Jobs.start(id), HandlerDef(this, "controllers.Jobs", "start", Seq(classOf[Long])))
   }
}
                    

// @LINE:15
case controllers_Jobs_reset8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Jobs.reset(id), HandlerDef(this, "controllers.Jobs", "reset", Seq(classOf[Long])))
   }
}
                    

// @LINE:17
case controllers_JobConditions_home9(params) => {
   call(params.fromQuery[String]("filter", Some("%"))) { (filter) =>
        invokeHandler(_root_.controllers.JobConditions.home(filter), HandlerDef(this, "controllers.JobConditions", "home", Seq(classOf[String])))
   }
}
                    

// @LINE:18
case controllers_JobConditions_search10(params) => {
   call { 
        invokeHandler(_root_.controllers.JobConditions.search, HandlerDef(this, "controllers.JobConditions", "search", Nil))
   }
}
                    

// @LINE:19
case controllers_JobConditions_edit11(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.JobConditions.edit(id), HandlerDef(this, "controllers.JobConditions", "edit", Seq(classOf[Long])))
   }
}
                    

// @LINE:20
case controllers_JobConditions_create12(params) => {
   call { 
        invokeHandler(_root_.controllers.JobConditions.create, HandlerDef(this, "controllers.JobConditions", "create", Nil))
   }
}
                    

// @LINE:21
case controllers_JobConditions_save13(params) => {
   call { 
        invokeHandler(_root_.controllers.JobConditions.save, HandlerDef(this, "controllers.JobConditions", "save", Nil))
   }
}
                    

// @LINE:22
case controllers_JobConditions_delete14(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.JobConditions.delete(id), HandlerDef(this, "controllers.JobConditions", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:25
case controllers_Assets_at15(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                