
package views.html.jobconditions

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
object form extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[JobCondition],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String, f : Form[JobCondition]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(simpleInput.f) }};
Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.65*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(message)/*7.15*/ {_display_(Seq[Any](format.raw/*7.17*/("""

  <h1>"""),_display_(Seq[Any](/*9.8*/message)),format.raw/*9.15*/("""</h1>
  <fieldset style="width: 500px;">
    """),_display_(Seq[Any](/*11.6*/helper/*11.12*/.form(routes.JobConditions.save)/*11.44*/ {_display_(Seq[Any](format.raw/*11.46*/("""
      """),_display_(Seq[Any](/*12.8*/inputText(f("id"), '_label -> "Id", 'readonly -> "readonly"))),format.raw/*12.68*/("""
      """),_display_(Seq[Any](/*13.8*/inputText(f("jobName"), '_label -> "jobName"))),format.raw/*13.53*/("""
      """),_display_(Seq[Any](/*14.8*/inputText(f("parentJobName"), '_label -> "parentJobName"))),format.raw/*14.65*/("""
      <fieldset style="margin-top: 10px;">
          <input type="submit" value="Save" />
          <a href=""""),_display_(Seq[Any](/*17.21*/routes/*17.27*/.JobConditions.home(""))),format.raw/*17.50*/("""">Cancel and go home</a>
      </fieldset>
    """)))})),format.raw/*19.6*/("""        
  </fieldset>
  
""")))})),format.raw/*22.2*/("""

"""))}
    }
    
    def render(message:String,f:Form[JobCondition]) = apply(message,f)
    
    def f:((String,Form[JobCondition]) => play.api.templates.Html) = (message,f) => apply(message,f)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Dec 25 02:36:39 JST 2012
                    SOURCE: /Users/hiratak_work/Documents/workspace/jobScheduler/app/views/jobconditions/form.scala.html
                    HASH: 0e361f1525eccc55552dc66185d38c37548b8d38
                    MATRIX: 537->1|663->63|695->87|764->42|792->61|820->126|858->130|879->143|918->145|961->154|989->161|1070->207|1085->213|1126->245|1166->247|1209->255|1291->315|1334->323|1401->368|1444->376|1523->433|1670->544|1685->550|1730->573|1809->621|1867->648
                    LINES: 19->1|22->5|22->5|23->1|25->4|26->5|28->7|28->7|28->7|30->9|30->9|32->11|32->11|32->11|32->11|33->12|33->12|34->13|34->13|35->14|35->14|38->17|38->17|38->17|40->19|43->22
                    -- GENERATED --
                */
            