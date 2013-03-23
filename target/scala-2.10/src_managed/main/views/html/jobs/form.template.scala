
package views.html.jobs

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object form extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[Job],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String, f : Form[Job]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(simpleInput.f) }};
Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.65*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(message)/*7.15*/ {_display_(Seq[Any](format.raw/*7.17*/("""

  <h1>"""),_display_(Seq[Any](/*9.8*/message)),format.raw/*9.15*/("""</h1>
  <fieldset style="width: 500px;">
    """),_display_(Seq[Any](/*11.6*/helper/*11.12*/.form(routes.Jobs.save)/*11.35*/ {_display_(Seq[Any](format.raw/*11.37*/("""
      """),_display_(Seq[Any](/*12.8*/inputText(f("id"), '_label -> "Id", 'readonly -> "readonly"))),format.raw/*12.68*/("""
      """),_display_(Seq[Any](/*13.8*/inputText(f("jobName"), '_label -> "jobName"))),format.raw/*13.53*/("""
      """),_display_(Seq[Any](/*14.8*/inputText(f("jobClass"), '_label -> "jobClass"))),format.raw/*14.55*/("""
      """),_display_(Seq[Any](/*15.8*/inputText(f("status"), '_label -> "status"))),format.raw/*15.51*/("""
      """),_display_(Seq[Any](/*16.8*/inputText(f("groupId"), '_label -> "groupId"))),format.raw/*16.53*/("""
      """),_display_(Seq[Any](/*17.8*/inputText(f("cron"), '_label -> "cron"))),format.raw/*17.47*/("""
      <fieldset style="margin-top: 10px;">
          <input type="submit" value="Save" />
          <a href=""""),_display_(Seq[Any](/*20.21*/routes/*20.27*/.Jobs.home(""))),format.raw/*20.41*/("""">Cancel and go home</a>
      </fieldset>
    """)))})),format.raw/*22.6*/("""        
  </fieldset>
  
""")))})),format.raw/*25.2*/("""

"""))}
    }
    
    def render(message:String,f:Form[Job]): play.api.templates.Html = apply(message,f)
    
    def f:((String,Form[Job]) => play.api.templates.Html) = (message,f) => apply(message,f)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 23 19:58:41 JST 2013
                    SOURCE: /Users/hiratak_work/Desktop/a/eclipse/Eclipse.app/Contents/MacOS/workspace/jobScheduler/app/views/jobs/form.scala.html
                    HASH: a4bbab24d4bb4ea33b62e7fb81380cbb7d3293c9
                    MATRIX: 519->1|636->54|668->78|737->33|765->52|793->117|831->121|852->134|891->136|934->145|962->152|1043->198|1058->204|1090->227|1130->229|1173->237|1255->297|1298->305|1365->350|1408->358|1477->405|1520->413|1585->456|1628->464|1695->509|1738->517|1799->556|1946->667|1961->673|1997->687|2076->735|2134->762
                    LINES: 19->1|22->5|22->5|23->1|25->4|26->5|28->7|28->7|28->7|30->9|30->9|32->11|32->11|32->11|32->11|33->12|33->12|34->13|34->13|35->14|35->14|36->15|36->15|37->16|37->16|38->17|38->17|41->20|41->20|41->20|43->22|46->25
                    -- GENERATED --
                */
            