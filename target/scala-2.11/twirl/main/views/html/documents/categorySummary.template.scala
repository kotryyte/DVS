
package views.html.documents

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object categorySummary_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class categorySummary extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User,List[DocumentCategory],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User, categories: List[DocumentCategory], message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.67*/("""

"""),_display_(/*3.2*/main(user)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
"""),format.raw/*4.1*/("""<div class="col-sm-12 content">
    <div class="title-container">
        <div class="title-h2">
            <h2>Kategorijos
                <div class="pull-right">
                    <a href=""""),_display_(/*9.31*/routes/*9.37*/.DocumentsCategoryController.createBlank()),format.raw/*9.79*/(""""> <i class="fa fa-plus-square fa-lg" aria-hidden="true"></i> Pridėti</a>
                </div>
            </h2>
        </div>
    </div>
    <div class="row">
    """),_display_(/*15.6*/if(message != null)/*15.25*/ {_display_(Seq[Any](format.raw/*15.27*/("""
        """),format.raw/*16.9*/("""<div class="col-sm-12 margin-t-10">
            <div class="alert alert-warning">
                <strong>"""),_display_(/*18.26*/message),format.raw/*18.33*/("""</strong>
            </div>
        </div>
    """)))}),format.raw/*21.6*/("""
    """),format.raw/*22.5*/("""</div>
    <div class="row">
        <div class="col-sm-12">
            <table cellpadding="0" cellspacing="0" width="80%" class="table">
                <thead>
                    <tr>
                        <th>Pavadinimas</th>
                        <th>Trinti</th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*33.18*/for(cat <- categories) yield /*33.40*/{_display_(Seq[Any](format.raw/*33.41*/("""
                         """),format.raw/*34.26*/("""<tr>
                             """),_display_(/*35.31*/if(cat.is_permission_required)/*35.61*/{_display_(Seq[Any](format.raw/*35.62*/("""
                                 """),format.raw/*36.34*/("""<td style="color: #9a9999"><a href=""""),_display_(/*36.71*/routes/*36.77*/.DocumentsController.blank(cat.document_category_id)),format.raw/*36.129*/("""">"""),_display_(/*36.132*/cat/*36.135*/.name),format.raw/*36.140*/("""</a></td>
                             """)))}/*37.32*/else/*37.37*/{_display_(Seq[Any](format.raw/*37.38*/("""
                                 """),format.raw/*38.34*/("""<td><a href=""""),_display_(/*38.48*/routes/*38.54*/.DocumentsController.blank(cat.document_category_id)),format.raw/*38.106*/("""">"""),_display_(/*38.109*/cat/*38.112*/.name),format.raw/*38.117*/("""</a></td>
                             """)))}),format.raw/*39.31*/("""
                             """),_display_(/*40.31*/if(user.user_level >= 3)/*40.55*/{_display_(Seq[Any](format.raw/*40.56*/("""<td><a href=""""),_display_(/*40.70*/routes/*40.76*/.DocumentsCategoryController.delete(cat.document_category_id)),format.raw/*40.137*/("""" onclick="return confirm('Ar tikrai norite ištrinti kategoriją?');"><i class="fa fa-remove fa-lg" aria-hidden="true"></i>Trinti</a></td>""")))}),format.raw/*40.275*/("""
                         """),format.raw/*41.26*/("""</tr>
                """)))}),format.raw/*42.18*/("""
                """),format.raw/*43.17*/("""</tbody>
            </table>
        </div>
    </div>
</div>


""")))}))
      }
    }
  }

  def render(user:User,categories:List[DocumentCategory],message:String): play.twirl.api.HtmlFormat.Appendable = apply(user,categories,message)

  def f:((User,List[DocumentCategory],String) => play.twirl.api.HtmlFormat.Appendable) = (user,categories,message) => apply(user,categories,message)

  def ref: this.type = this

}


}

/**/
object categorySummary extends categorySummary_Scope0.categorySummary
              /*
                  -- GENERATED --
                  DATE: Wed May 09 21:55:51 EEST 2018
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/documents/categorySummary.scala.html
                  HASH: 43c3ea1ce5fc9954aaf22647c64647fc58f28e6a
                  MATRIX: 803->1|963->66|993->71|1011->81|1050->83|1078->85|1305->286|1319->292|1381->334|1581->508|1609->527|1649->529|1686->539|1822->648|1850->655|1932->707|1965->713|2368->1089|2406->1111|2445->1112|2500->1139|2563->1175|2602->1205|2641->1206|2704->1241|2768->1278|2783->1284|2857->1336|2888->1339|2901->1342|2928->1347|2988->1389|3001->1394|3040->1395|3103->1430|3144->1444|3159->1450|3233->1502|3264->1505|3277->1508|3304->1513|3376->1554|3435->1586|3468->1610|3507->1611|3548->1625|3563->1631|3646->1692|3816->1830|3871->1857|3926->1881|3972->1899
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|40->9|40->9|40->9|46->15|46->15|46->15|47->16|49->18|49->18|52->21|53->22|64->33|64->33|64->33|65->34|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|69->38|69->38|69->38|69->38|70->39|71->40|71->40|71->40|71->40|71->40|71->40|71->40|72->41|73->42|74->43
                  -- GENERATED --
              */
          