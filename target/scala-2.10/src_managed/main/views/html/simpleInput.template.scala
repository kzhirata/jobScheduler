
package views.html

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
object simpleInput extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[helper.FieldElements,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(elements: helper.FieldElements):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""

<div class="simple-input """),_display_(Seq[Any](/*3.27*/elements/*3.35*/.args.get('_class))),format.raw/*3.53*/(""" """),_display_(Seq[Any](/*3.55*/if(elements.hasErrors)/*3.77*/ {_display_(Seq[Any](format.raw/*3.79*/("""error""")))})),format.raw/*3.85*/("""" id=""""),_display_(Seq[Any](/*3.92*/elements/*3.100*/.args.get('_id).getOrElse(elements.id + "_field"))),format.raw/*3.149*/("""">
    <label for=""""),_display_(Seq[Any](/*4.18*/elements/*4.26*/.id)),format.raw/*4.29*/("""">
	"""),_display_(Seq[Any](/*5.3*/elements/*5.11*/.label(elements.lang))),format.raw/*5.32*/("""
	"""),_display_(Seq[Any](/*6.3*/elements/*6.11*/.infos(elements.lang).map/*6.36*/ { info =>_display_(Seq[Any](format.raw/*6.46*/("""
	    <span class="info">"""),_display_(Seq[Any](/*7.26*/info)),format.raw/*7.30*/("""</span>
	""")))})),format.raw/*8.3*/("""
    </label>
    <div class="control">
	"""),_display_(Seq[Any](/*11.3*/elements/*11.11*/.input)),format.raw/*11.17*/("""
    </div>
    """),_display_(Seq[Any](/*13.6*/elements/*13.14*/.errors(elements.lang).map/*13.40*/ { error =>_display_(Seq[Any](format.raw/*13.51*/("""
        <div class="error">"""),_display_(Seq[Any](/*14.29*/error)),format.raw/*14.34*/("""</div>
    """)))})),format.raw/*15.6*/("""
</div>"""))}
    }
    
    def render(elements:helper.FieldElements): play.api.templates.Html = apply(elements)
    
    def f:((helper.FieldElements) => play.api.templates.Html) = (elements) => apply(elements)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 23 19:58:41 JST 2013
                    SOURCE: /Users/hiratak_work/Desktop/a/eclipse/Eclipse.app/Contents/MacOS/workspace/jobScheduler/app/views/simpleInput.scala.html
                    HASH: 22fec10673858eff548636c6876e6045541f2f10
                    MATRIX: 525->1|634->33|697->61|713->69|752->87|789->89|819->111|858->113|895->119|937->126|954->134|1025->183|1080->203|1096->211|1120->214|1159->219|1175->227|1217->248|1254->251|1270->259|1303->284|1350->294|1411->320|1436->324|1476->334|1553->376|1570->384|1598->390|1650->407|1667->415|1702->441|1751->452|1816->481|1843->486|1886->498
                    LINES: 19->1|22->1|24->3|24->3|24->3|24->3|24->3|24->3|24->3|24->3|24->3|24->3|25->4|25->4|25->4|26->5|26->5|26->5|27->6|27->6|27->6|27->6|28->7|28->7|29->8|32->11|32->11|32->11|34->13|34->13|34->13|34->13|35->14|35->14|36->15
                    -- GENERATED --
                */
            