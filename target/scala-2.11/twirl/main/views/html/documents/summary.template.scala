
package views.html.documents

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object summary_Scope0 {
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

class summary extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User,List[Document],DocumentCategory,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User, documents: List[Document], category: DocumentCategory):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""

"""),_display_(/*3.2*/main(user)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
"""),format.raw/*4.1*/("""<div class="col-sm-12 content">
    <div class="title-container">
        <div class="title-h2">
            <h2>
                <a href=""""),_display_(/*8.27*/routes/*8.33*/.DocumentsController.categories()),format.raw/*8.66*/(""""> <i class="fa fa-arrow-circle-left fa-lg" aria-hidden="true"></i></a>
                Dokumentai ("""),_display_(/*9.30*/category/*9.38*/.name),format.raw/*9.43*/(""")
                <div class="pull-right">
                    <a href=""""),_display_(/*11.31*/routes/*11.37*/.DocumentsController.createBlank()),format.raw/*11.71*/(""""> <i class="fa fa-plus-square fa-lg" aria-hidden="true"></i> Pridėti</a>
                </div>
            </h2>
        </div>
    </div>
    <div class="row">
<!-- Gal bus filtrai -->
    </div>
    <div class="row">
        <div class="col-sm-12">
            <table cellpadding="0" cellspacing="0" width="80%" class="table">
                <thead>
                    <tr>
                        <th></th>
                        <th>Failas</th>
                        <th>Aprašymas</th>
                        <th>Kategorija</th>
                        <th>Atsisiųsti</th>
                        <th>Ištrinti</th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*33.18*/for(doc <- documents) yield /*33.39*/{_display_(Seq[Any](format.raw/*33.40*/("""
                         """),format.raw/*34.26*/("""<tr>
                             <td><a href=""""),_display_(/*35.44*/routes/*35.50*/.DocumentsController.viewDoc(doc.document_id)),format.raw/*35.95*/(""""> <i class="fa fa-search fa-lg" aria-hidden="true"></i></a></td>
                             <td>"""),_display_(/*36.35*/doc/*36.38*/.file_name),format.raw/*36.48*/("""</td>
                             <td>"""),_display_(/*37.35*/doc/*37.38*/.title),format.raw/*37.44*/("""</td>
                             <td>"""),_display_(/*38.35*/doc/*38.38*/.category.name),format.raw/*38.52*/("""</td>
                             <td><a href=""""),_display_(/*39.44*/routes/*39.50*/.DocumentsController.downloadFile(doc.document_id)),format.raw/*39.100*/(""""> <i class="fa fa-download fa-lg" aria-hidden="true"></i></a></td>
                             """),_display_(/*40.31*/if(user.user_level >= 3)/*40.55*/{_display_(Seq[Any](format.raw/*40.56*/("""<td><a href=""""),_display_(/*40.70*/routes/*40.76*/.DocumentsController.deleteDoc(doc.document_id)),format.raw/*40.123*/("""" onclick="return confirm('Ar tikrai norte ištrinti dokumentą?');"> <i class="fa fa-remove fa-lg" aria-hidden="true"></i></a></td>""")))}),format.raw/*40.254*/("""
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

  def render(user:User,documents:List[Document],category:DocumentCategory): play.twirl.api.HtmlFormat.Appendable = apply(user,documents,category)

  def f:((User,List[Document],DocumentCategory) => play.twirl.api.HtmlFormat.Appendable) = (user,documents,category) => apply(user,documents,category)

  def ref: this.type = this

}


}

/**/
object summary extends summary_Scope0.summary
              /*
                  -- GENERATED --
                  DATE: Sun May 06 19:16:21 EEST 2018
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/documents/summary.scala.html
                  HASH: 1606bea26d24c524eed0b6cf3b9063176543efe7
                  MATRIX: 789->1|951->68|981->73|999->83|1038->85|1066->87|1236->231|1250->237|1303->270|1431->372|1447->380|1472->385|1574->460|1589->466|1644->500|2412->1241|2449->1262|2488->1263|2543->1290|2619->1339|2634->1345|2700->1390|2828->1491|2840->1494|2871->1504|2939->1545|2951->1548|2978->1554|3046->1595|3058->1598|3093->1612|3170->1662|3185->1668|3257->1718|3383->1817|3416->1841|3455->1842|3496->1856|3511->1862|3580->1909|3743->2040|3798->2067|3853->2091|3899->2109
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|39->8|39->8|39->8|40->9|40->9|40->9|42->11|42->11|42->11|64->33|64->33|64->33|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|71->40|71->40|71->40|71->40|72->41|73->42|74->43
                  -- GENERATED --
              */
          