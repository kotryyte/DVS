
package views.html.user

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dateReport_Scope0 {
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

     object dateReport_Scope1 {
import forms.DateReportForm
import java.text.SimpleDateFormat

class dateReport extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User,Form[DateReportForm],List[Document],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: User, myForm: Form[DateReportForm], docs: List[Document]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*3.66*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main(user)/*6.12*/ {_display_(Seq[Any](format.raw/*6.14*/("""
    """),format.raw/*7.5*/("""<div class="col-sm-12 content">
        <div class="title-container">
            <div class="title-h2">
                <h2>
                    <a href=""""),_display_(/*11.31*/routes/*11.37*/.UserController.viewDocsReport()),format.raw/*11.69*/(""""> <i class="fa fa-arrow-circle-left fa-lg" aria-hidden="true"></i> Ataskaitos</a>
                </h2>
            </div>
        </div>
        <div class="col-sm-6" style="margin-top: 30px;">
        """),_display_(/*16.10*/form(routes.UserController.viewDateReportInfo(), 'class -> "form", 'enctype -> "multipart/form-data")/*16.111*/{_display_(Seq[Any](format.raw/*16.112*/("""
            """),format.raw/*17.13*/("""<div class="col-sm-12">
                <fieldset>
                """),_display_(/*19.18*/inputDate(
                    myForm("from"),
                    'placeholder -> "Nuo",
                    '_label -> "Nuo",
                    'class -> "form-control"
                )),format.raw/*24.18*/("""
                """),_display_(/*25.18*/inputDate(
                    myForm("to"),
                    'placeholder -> "Iki",
                    '_label -> "Iki",
                    'class -> "form-control"
                )),format.raw/*30.18*/("""
                """),format.raw/*31.17*/("""</fieldset>

                <div class="form-actions margin-t-10">
                    <input type="submit" class="btn btn-primary" value=""""),_display_(/*34.74*/Messages("submit.button")),format.raw/*34.99*/("""">
                </div>

            </div>
        </div>
        """)))}),format.raw/*39.10*/("""
        """),_display_(/*40.10*/if(docs != null)/*40.26*/ {_display_(Seq[Any](format.raw/*40.28*/("""
            """),format.raw/*41.13*/("""<div class="row">
                <div class="col-sm-12">
                    <table cellpadding="0" cellspacing="0" width="80%" class="table">
                        <thead>
                            <tr>
                                <th>Failo pavadinimas</th>
                                <th>Aprašymas</th>
                                <th>Sukūrimo data</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*52.26*/for(doc <- docs) yield /*52.42*/ {_display_(Seq[Any](format.raw/*52.44*/("""
                            """),format.raw/*53.29*/("""<tr>
                                <td>"""),_display_(/*54.38*/doc/*54.41*/.file_name),format.raw/*54.51*/("""</td>
                                <td>"""),_display_(/*55.38*/doc/*55.41*/.title),format.raw/*55.47*/("""</td>
                                <td>"""),_display_(/*56.38*/doc/*56.41*/.date_created),format.raw/*56.54*/("""</td>
                            </tr>
                        """)))}),format.raw/*58.26*/("""
                        """),format.raw/*59.25*/("""</tbody>
                    </table>
                </div>
            </div>
        """)))}),format.raw/*63.10*/("""
    """),format.raw/*64.5*/("""</div>
""")))}))
      }
    }
  }

  def render(user:User,myForm:Form[DateReportForm],docs:List[Document]): play.twirl.api.HtmlFormat.Appendable = apply(user,myForm,docs)

  def f:((User,Form[DateReportForm],List[Document]) => play.twirl.api.HtmlFormat.Appendable) = (user,myForm,docs) => apply(user,myForm,docs)

  def ref: this.type = this

}


}
}

/**/
object dateReport extends dateReport_Scope0.dateReport_Scope1.dateReport
              /*
                  -- GENERATED --
                  DATE: Sat May 05 15:52:41 EEST 2018
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/user/dateReport.scala.html
                  HASH: 2a33d4932bdc3e139673f2fba7840d10a9378700
                  MATRIX: 889->67|1063->131|1091->151|1119->154|1137->164|1176->166|1208->172|1395->332|1410->338|1463->370|1700->580|1811->681|1851->682|1893->696|1990->766|2206->961|2252->980|2466->1173|2512->1191|2683->1335|2729->1360|2835->1435|2873->1446|2898->1462|2938->1464|2980->1478|3516->1987|3548->2003|3588->2005|3646->2035|3716->2078|3728->2081|3759->2091|3830->2135|3842->2138|3869->2144|3940->2188|3952->2191|3986->2204|4084->2271|4138->2297|4262->2390|4295->2396
                  LINES: 31->3|36->3|37->5|38->6|38->6|38->6|39->7|43->11|43->11|43->11|48->16|48->16|48->16|49->17|51->19|56->24|57->25|62->30|63->31|66->34|66->34|71->39|72->40|72->40|72->40|73->41|84->52|84->52|84->52|85->53|86->54|86->54|86->54|87->55|87->55|87->55|88->56|88->56|88->56|90->58|91->59|95->63|96->64
                  -- GENERATED --
              */
          