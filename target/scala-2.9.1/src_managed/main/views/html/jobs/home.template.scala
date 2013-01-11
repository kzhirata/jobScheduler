
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
object home extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,List[Job],Form[String],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String, jobs : List[Job], searchForm: Form[String]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.63*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Welcome to Play 2.0")/*5.29*/ {_display_(Seq[Any](format.raw/*5.31*/("""
    
    <h1>"""),_display_(Seq[Any](/*7.10*/message)),format.raw/*7.17*/("""</h1>

    <form action=""""),_display_(Seq[Any](/*9.20*/routes/*9.26*/.Jobs.search)),format.raw/*9.38*/("""" method="GET">
        <input type="text" name="filter" id="filter" />
        <input type="submit" value="Search"/>
    </form>

    <table class="datatable">
        <tr>
            <th>Id</th>
            <th>jobName</th>
            <th>jobClass</th>
            <th>status</th>
            <th>groupId</th>
            <th>cron</th>
            <th>command</th>
        </tr>
        """),_display_(Seq[Any](/*24.10*/jobs/*24.14*/.map/*24.18*/ { c =>_display_(Seq[Any](format.raw/*24.25*/("""
            <tr>
                <td>"""),_display_(Seq[Any](/*26.22*/c/*26.23*/.id)),format.raw/*26.26*/("""</td>
                <td>"""),_display_(Seq[Any](/*27.22*/c/*27.23*/.jobName)),format.raw/*27.31*/("""</td>
                <td>"""),_display_(Seq[Any](/*28.22*/c/*28.23*/.jobClass)),format.raw/*28.32*/("""</td>
                <td>"""),_display_(Seq[Any](/*29.22*/c/*29.23*/.status)),format.raw/*29.30*/("""</td>
                <td>"""),_display_(Seq[Any](/*30.22*/c/*30.23*/.groupId)),format.raw/*30.31*/("""</td>
                <td>"""),_display_(Seq[Any](/*31.22*/c/*31.23*/.cron)),format.raw/*31.28*/("""</td>
                <td>
                    """),_display_(Seq[Any](/*33.22*/helper/*33.28*/.form(routes.Jobs.start(c.id), 'style -> "float: left;")/*33.84*/ {_display_(Seq[Any](format.raw/*33.86*/("""
                        <input type="submit" value="Start"/>
                    """)))})),format.raw/*35.22*/("""
                    """),_display_(Seq[Any](/*36.22*/helper/*36.28*/.form(routes.Jobs.reset(c.id), 'style -> "float: left;")/*36.84*/ {_display_(Seq[Any](format.raw/*36.86*/("""
                        <input type="submit" value="Reset"/>
                    """)))})),format.raw/*38.22*/("""
                    """),_display_(Seq[Any](/*39.22*/helper/*39.28*/.form(routes.Jobs.edit(c.id), 'style -> "float: left;")/*39.83*/ {_display_(Seq[Any](format.raw/*39.85*/("""
                        <input type="submit" value="Edit"/>
                    """)))})),format.raw/*41.22*/("""
                    """),_display_(Seq[Any](/*42.22*/helper/*42.28*/.form(routes.Jobs.delete(c.id), 'style -> "float: left;")/*42.85*/ {_display_(Seq[Any](format.raw/*42.87*/("""
                        <input type="submit" value="Delete"/>
                    """)))})),format.raw/*44.22*/("""
                </td>
            </tr>
        """)))})),format.raw/*47.10*/("""
    </table>

    <a href=""""),_display_(Seq[Any](/*50.15*/routes/*50.21*/.Jobs.create)),format.raw/*50.33*/("""" style="margin-top: 10px; display: block;">Create new Job</a>
""")))})),format.raw/*51.2*/("""
"""))}
    }
    
    def render(message:String,jobs:List[Job],searchForm:Form[String]) = apply(message,jobs,searchForm)
    
    def f:((String,List[Job],Form[String]) => play.api.templates.Html) = (message,jobs,searchForm) => apply(message,jobs,searchForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Dec 25 02:36:39 JST 2012
                    SOURCE: /Users/hiratak_work/Documents/workspace/jobScheduler/app/views/jobs/home.scala.html
                    HASH: 275cf4608f562fdd0608d9fb78a4cdede872d299
                    MATRIX: 532->1|686->62|714->81|750->83|785->110|824->112|874->127|902->134|963->160|977->166|1010->178|1438->570|1451->574|1464->578|1509->585|1584->624|1594->625|1619->628|1682->655|1692->656|1722->664|1785->691|1795->692|1826->701|1889->728|1899->729|1928->736|1991->763|2001->764|2031->772|2094->799|2104->800|2131->805|2215->853|2230->859|2295->915|2335->917|2450->1000|2508->1022|2523->1028|2588->1084|2628->1086|2743->1169|2801->1191|2816->1197|2880->1252|2920->1254|3034->1336|3092->1358|3107->1364|3173->1421|3213->1423|3329->1507|3411->1557|3476->1586|3491->1592|3525->1604|3620->1668
                    LINES: 19->1|23->1|25->4|26->5|26->5|26->5|28->7|28->7|30->9|30->9|30->9|45->24|45->24|45->24|45->24|47->26|47->26|47->26|48->27|48->27|48->27|49->28|49->28|49->28|50->29|50->29|50->29|51->30|51->30|51->30|52->31|52->31|52->31|54->33|54->33|54->33|54->33|56->35|57->36|57->36|57->36|57->36|59->38|60->39|60->39|60->39|60->39|62->41|63->42|63->42|63->42|63->42|65->44|68->47|71->50|71->50|71->50|72->51
                    -- GENERATED --
                */
            