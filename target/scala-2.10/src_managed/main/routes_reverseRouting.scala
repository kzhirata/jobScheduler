// @SOURCE:/Users/hiratak_work/Desktop/a/eclipse/Eclipse.app/Contents/MacOS/workspace/jobScheduler/conf/routes
// @HASH:e0a9c7745dc6499fd4a6c433c687b41424ca59ff
// @DATE:Sat Mar 23 19:58:40 JST 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
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
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
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
def home(filter:String = "%"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "jobcondition/" + queryString(List(if(filter == "%") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
}
                                                

// @LINE:22
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "jobcondition/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:20
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "jobcondition/create")
}
                                                

// @LINE:21
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "jobcondition/save")
}
                                                

// @LINE:18
def search(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "jobcondition/search")
}
                                                

// @LINE:19
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "jobcondition/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
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
def home(filter:String = "%"): Call = {
   (filter: @unchecked) match {
// @LINE:7
case (filter) if true => Call("GET", _prefix + queryString(List(if(filter == "%") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
                                                        
// @LINE:8
case (filter) if true => Call("GET", _prefix + { _defaultPrefix } + "job/" + queryString(List(if(filter == "%") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
                                                        
   }
}
                                                

// @LINE:15
def reset(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "job/reset/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:13
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "job/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:14
def start(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "job/start/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:11
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "job/create")
}
                                                

// @LINE:12
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "job/save")
}
                                                

// @LINE:9
def search(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "job/search")
}
                                                

// @LINE:10
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "job/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
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
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
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
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JobConditions.home",
   """
      function(filter) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jobcondition/" + _qS([(filter == null ? """ +  implicitly[JavascriptLitteral[String]].to("%") + """ : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter))])})
      }
   """
)
                        

// @LINE:22
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JobConditions.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "jobcondition/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:20
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JobConditions.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jobcondition/create"})
      }
   """
)
                        

// @LINE:21
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JobConditions.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "jobcondition/save"})
      }
   """
)
                        

// @LINE:18
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JobConditions.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jobcondition/search"})
      }
   """
)
                        

// @LINE:19
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JobConditions.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jobcondition/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
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
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Jobs.home",
   """
      function(filter) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(filter == null ? """ +  implicitly[JavascriptLitteral[String]].to("%") + """ : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter))])})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/" + _qS([(filter == null ? """ +  implicitly[JavascriptLitteral[String]].to("%") + """ : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter))])})
      }
      }
   """
)
                        

// @LINE:15
def reset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Jobs.reset",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/reset/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:13
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Jobs.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "job/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:14
def start : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Jobs.start",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/start/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:11
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Jobs.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/create"})
      }
   """
)
                        

// @LINE:12
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Jobs.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "job/save"})
      }
   """
)
                        

// @LINE:9
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Jobs.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/search"})
      }
   """
)
                        

// @LINE:10
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Jobs.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
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
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
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
def home(filter:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.JobConditions.home(filter), HandlerDef(this, "controllers.JobConditions", "home", Seq(classOf[String]), "GET", """""", _prefix + """jobcondition/""")
)
                      

// @LINE:22
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.JobConditions.delete(id), HandlerDef(this, "controllers.JobConditions", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """jobcondition/delete/$id<[^/]+>""")
)
                      

// @LINE:20
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.JobConditions.create(), HandlerDef(this, "controllers.JobConditions", "create", Seq(), "GET", """""", _prefix + """jobcondition/create""")
)
                      

// @LINE:21
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.JobConditions.save(), HandlerDef(this, "controllers.JobConditions", "save", Seq(), "POST", """""", _prefix + """jobcondition/save""")
)
                      

// @LINE:18
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.JobConditions.search(), HandlerDef(this, "controllers.JobConditions", "search", Seq(), "GET", """""", _prefix + """jobcondition/search""")
)
                      

// @LINE:19
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.JobConditions.edit(id), HandlerDef(this, "controllers.JobConditions", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """jobcondition/edit/$id<[^/]+>""")
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
def home(filter:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Jobs.home(filter), HandlerDef(this, "controllers.Jobs", "home", Seq(classOf[String]), "GET", """""", _prefix + """""")
)
                      

// @LINE:15
def reset(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Jobs.reset(id), HandlerDef(this, "controllers.Jobs", "reset", Seq(classOf[Long]), "GET", """""", _prefix + """job/reset/$id<[^/]+>""")
)
                      

// @LINE:13
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Jobs.delete(id), HandlerDef(this, "controllers.Jobs", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """job/delete/$id<[^/]+>""")
)
                      

// @LINE:14
def start(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Jobs.start(id), HandlerDef(this, "controllers.Jobs", "start", Seq(classOf[Long]), "GET", """""", _prefix + """job/start/$id<[^/]+>""")
)
                      

// @LINE:11
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Jobs.create(), HandlerDef(this, "controllers.Jobs", "create", Seq(), "GET", """""", _prefix + """job/create""")
)
                      

// @LINE:12
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Jobs.save(), HandlerDef(this, "controllers.Jobs", "save", Seq(), "POST", """""", _prefix + """job/save""")
)
                      

// @LINE:9
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Jobs.search(), HandlerDef(this, "controllers.Jobs", "search", Seq(), "GET", """""", _prefix + """job/search""")
)
                      

// @LINE:10
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Jobs.edit(id), HandlerDef(this, "controllers.Jobs", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """job/edit/$id<[^/]+>""")
)
                      
    
}
                          
}
                  
      