
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
object home extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,List[JobCondition],Form[String],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String, jobconditions : List[JobCondition], searchForm: Form[String]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Welcome to Play 2.0")/*5.29*/ {_display_(Seq[Any](format.raw/*5.31*/("""
    
    <h1>"""),_display_(Seq[Any](/*7.10*/message)),format.raw/*7.17*/("""</h1>

    <form action=""""),_display_(Seq[Any](/*9.20*/routes/*9.26*/.JobConditions.search)),format.raw/*9.47*/("""" method="GET">
        <input type="text" name="filter" id="filter" />
        <input type="submit" value="Search"/>
    </form>

    <table class="datatable">
        <tr>
            <th>Id</th>
            <th>jobName</th>
            <th>parentJobName</th>
        </tr>
        """),_display_(Seq[Any](/*20.10*/jobconditions/*20.23*/.map/*20.27*/ { c =>_display_(Seq[Any](format.raw/*20.34*/("""
            <tr>
                <td>
                    """),_display_(Seq[Any](/*23.22*/helper/*23.28*/.form(routes.JobConditions.edit(c.id), 'style -> "float: left;")/*23.92*/ {_display_(Seq[Any](format.raw/*23.94*/("""
                        <input type="submit" value="Edit"/>
                    """)))})),format.raw/*25.22*/("""
                    """),_display_(Seq[Any](/*26.22*/helper/*26.28*/.form(routes.JobConditions.delete(c.id), 'style -> "float: left;")/*26.94*/ {_display_(Seq[Any](format.raw/*26.96*/("""
                        <input type="submit" value="Delete"/>
                    """)))})),format.raw/*28.22*/("""
                </td>
                <td>"""),_display_(Seq[Any](/*30.22*/c/*30.23*/.jobName)),format.raw/*30.31*/("""</td>
                <td>"""),_display_(Seq[Any](/*31.22*/c/*31.23*/.parentJobName)),format.raw/*31.37*/("""</td>
            </tr>
        """)))})),format.raw/*33.10*/("""
    </table>

    <a href=""""),_display_(Seq[Any](/*36.15*/routes/*36.21*/.JobConditions.create)),format.raw/*36.42*/("""" style="margin-top: 10px; display: block;">Create new Job</a>
""")))})),format.raw/*37.2*/("""
"""))}
    }
    
    def render(message:String,jobconditions:List[JobCondition],searchForm:Form[String]): play.api.templates.Html = apply(message,jobconditions,searchForm)
    
    def f:((String,List[JobCondition],Form[String]) => play.api.templates.Html) = (message,jobconditions,searchForm) => apply(message,jobconditions,searchForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 23 19:58:41 JST 2013
                    SOURCE: /Users/hiratak_work/Desktop/a/eclipse/Eclipse.app/Contents/MacOS/workspace/jobScheduler/app/views/jobconditions/home.scala.html
                    HASH: 741fd3bbc6b63c9aa162b0af4ab0e0961e6da5db
                    MATRIX: 550->1|722->80|750->99|786->101|821->128|860->130|910->145|938->152|999->178|1013->184|1055->205|1376->490|1398->503|1411->507|1456->514|1552->574|1567->580|1640->644|1680->646|1794->728|1852->750|1867->756|1942->822|1982->824|2098->908|2178->952|2188->953|2218->961|2281->988|2291->989|2327->1003|2392->1036|2457->1065|2472->1071|2515->1092|2610->1156
                    LINES: 19->1|23->1|25->4|26->5|26->5|26->5|28->7|28->7|30->9|30->9|30->9|41->20|41->20|41->20|41->20|44->23|44->23|44->23|44->23|46->25|47->26|47->26|47->26|47->26|49->28|51->30|51->30|51->30|52->31|52->31|52->31|54->33|57->36|57->36|57->36|58->37
                    -- GENERATED --
                */
            