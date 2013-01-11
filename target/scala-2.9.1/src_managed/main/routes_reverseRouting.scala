// @SOURCE:/Users/hiratak_work/Documents/workspace/jobScheduler/conf/routes
// @HASH:e0a9c7745dc6499fd4a6c433c687b41424ca59ff
// @DATE:Tue Dec 25 02:36:37 JST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers {

// @LINE:25
class ReverseAssets {
    


 
// @LINE:25
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseJobConditions {
    


 
// @LINE:17
def home(filter:String = "%") = {
   Call("GET", "/jobcondition/" + queryString(List(if(filter == "%") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
}
                                                        
 
// @LINE:22
def delete(id:Long) = {
   Call("POST", "/jobcondition/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:20
def create() = {
   Call("GET", "/jobcondition/create")
}
                                                        
 
// @LINE:21
def save() = {
   Call("POST", "/jobcondition/save")
}
                                                        
 
// @LINE:18
def search() = {
   Call("GET", "/jobcondition/search")
}
                                                        
 
// @LINE:19
def edit(id:Long) = {
   Call("GET", "/jobcondition/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        

                      
    
}
                            

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseJobs {
    


 
// @LINE:8
// @LINE:7
def home(filter:String = "%") = {
   (filter) match {
// @LINE:7
case (filter) if true => Call("GET", "/" + queryString(List(if(filter == "%") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
                                                                
// @LINE:8
case (filter) if true => Call("GET", "/job/" + queryString(List(if(filter == "%") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
                                                                    
   }
}
                                                        
 
// @LINE:15
def reset(id:Long) = {
   Call("GET", "/job/reset/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:13
def delete(id:Long) = {
   Call("POST", "/job/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:14
def start(id:Long) = {
   Call("GET", "/job/start/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:11
def create() = {
   Call("GET", "/job/create")
}
                                                        
 
// @LINE:12
def save() = {
   Call("POST", "/job/save")
}
                                                        
 
// @LINE:9
def search() = {
   Call("GET", "/job/search")
}
                                                        
 
// @LINE:10
def edit(id:Long) = {
   Call("GET", "/job/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers.javascript {

// @LINE:25
class ReverseAssets {
    


 
// @LINE:25
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseJobConditions {
    


 
// @LINE:17
def home = JavascriptReverseRoute(
   "controllers.JobConditions.home",
   """
      function(filter) {
      return _wA({method:"GET", url:"/jobcondition/" + _qS([(filter == null ? """ +  implicitly[JavascriptLitteral[String]].to("%") + """ : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter))])})
      }
   """
)
                                                        
 
// @LINE:22
def delete = JavascriptReverseRoute(
   "controllers.JobConditions.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"/jobcondition/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:20
def create = JavascriptReverseRoute(
   "controllers.JobConditions.create",
   """
      function() {
      return _wA({method:"GET", url:"/jobcondition/create"})
      }
   """
)
                                                        
 
// @LINE:21
def save = JavascriptReverseRoute(
   "controllers.JobConditions.save",
   """
      function() {
      return _wA({method:"POST", url:"/jobcondition/save"})
      }
   """
)
                                                        
 
// @LINE:18
def search = JavascriptReverseRoute(
   "controllers.JobConditions.search",
   """
      function() {
      return _wA({method:"GET", url:"/jobcondition/search"})
      }
   """
)
                                                        
 
// @LINE:19
def edit = JavascriptReverseRoute(
   "controllers.JobConditions.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"/jobcondition/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseJobs {
    


 
// @LINE:8
// @LINE:7
def home = JavascriptReverseRoute(
   "controllers.Jobs.home",
   """
      function(filter) {
      if (true) {
      return _wA({method:"GET", url:"/" + _qS([(filter == null ? """ +  implicitly[JavascriptLitteral[String]].to("%") + """ : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter))])})
      }
      if (true) {
      return _wA({method:"GET", url:"/job/" + _qS([(filter == null ? """ +  implicitly[JavascriptLitteral[String]].to("%") + """ : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter))])})
      }
      }
   """
)
                                                        
 
// @LINE:15
def reset = JavascriptReverseRoute(
   "controllers.Jobs.reset",
   """
      function(id) {
      return _wA({method:"GET", url:"/job/reset/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:13
def delete = JavascriptReverseRoute(
   "controllers.Jobs.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"/job/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:14
def start = JavascriptReverseRoute(
   "controllers.Jobs.start",
   """
      function(id) {
      return _wA({method:"GET", url:"/job/start/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:11
def create = JavascriptReverseRoute(
   "controllers.Jobs.create",
   """
      function() {
      return _wA({method:"GET", url:"/job/create"})
      }
   """
)
                                                        
 
// @LINE:12
def save = JavascriptReverseRoute(
   "controllers.Jobs.save",
   """
      function() {
      return _wA({method:"POST", url:"/job/save"})
      }
   """
)
                                                        
 
// @LINE:9
def search = JavascriptReverseRoute(
   "controllers.Jobs.search",
   """
      function() {
      return _wA({method:"GET", url:"/job/search"})
      }
   """
)
                                                        
 
// @LINE:10
def edit = JavascriptReverseRoute(
   "controllers.Jobs.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"/job/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers.ref {

// @LINE:25
class ReverseAssets {
    


 
// @LINE:25
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseJobConditions {
    


 
// @LINE:17
def home(filter:String) = new play.api.mvc.HandlerRef(
   controllers.JobConditions.home(filter), HandlerDef(this, "controllers.JobConditions", "home", Seq(classOf[String]))
)
                              
 
// @LINE:22
def delete(id:Long) = new play.api.mvc.HandlerRef(
   controllers.JobConditions.delete(id), HandlerDef(this, "controllers.JobConditions", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:20
def create() = new play.api.mvc.HandlerRef(
   controllers.JobConditions.create(), HandlerDef(this, "controllers.JobConditions", "create", Seq())
)
                              
 
// @LINE:21
def save() = new play.api.mvc.HandlerRef(
   controllers.JobConditions.save(), HandlerDef(this, "controllers.JobConditions", "save", Seq())
)
                              
 
// @LINE:18
def search() = new play.api.mvc.HandlerRef(
   controllers.JobConditions.search(), HandlerDef(this, "controllers.JobConditions", "search", Seq())
)
                              
 
// @LINE:19
def edit(id:Long) = new play.api.mvc.HandlerRef(
   controllers.JobConditions.edit(id), HandlerDef(this, "controllers.JobConditions", "edit", Seq(classOf[Long]))
)
                              

                      
    
}
                            

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseJobs {
    


 
// @LINE:7
def home(filter:String) = new play.api.mvc.HandlerRef(
   controllers.Jobs.home(filter), HandlerDef(this, "controllers.Jobs", "home", Seq(classOf[String]))
)
                              
 
// @LINE:15
def reset(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Jobs.reset(id), HandlerDef(this, "controllers.Jobs", "reset", Seq(classOf[Long]))
)
                              
 
// @LINE:13
def delete(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Jobs.delete(id), HandlerDef(this, "controllers.Jobs", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:14
def start(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Jobs.start(id), HandlerDef(this, "controllers.Jobs", "start", Seq(classOf[Long]))
)
                              
 
// @LINE:11
def create() = new play.api.mvc.HandlerRef(
   controllers.Jobs.create(), HandlerDef(this, "controllers.Jobs", "create", Seq())
)
                              
 
// @LINE:12
def save() = new play.api.mvc.HandlerRef(
   controllers.Jobs.save(), HandlerDef(this, "controllers.Jobs", "save", Seq())
)
                              
 
// @LINE:9
def search() = new play.api.mvc.HandlerRef(
   controllers.Jobs.search(), HandlerDef(this, "controllers.Jobs", "search", Seq())
)
                              
 
// @LINE:10
def edit(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Jobs.edit(id), HandlerDef(this, "controllers.Jobs", "edit", Seq(classOf[Long]))
)
                              

                      
    
}
                            
}
                    
                