
package views.html.user

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object userReport_Scope0 {
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

     object userReport_Scope1 {
import forms.UserReportForm

class userReport extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[User,List[User],Form[UserReportForm],List[Document],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User, users: List[User], myForm: Form[UserReportForm], docs: List[Document]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*2.85*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main(user)/*5.12*/ {_display_(Seq[Any](format.raw/*5.14*/("""
    """),format.raw/*6.5*/("""<div class="col-sm-12 content">
        <div class="title-container">
            <div class="title-h2">
                <h2>
                    <a href=""""),_display_(/*10.31*/routes/*10.37*/.UserController.viewDocsReport()),format.raw/*10.69*/(""""> <i class="fa fa-arrow-circle-left fa-lg" aria-hidden="true"></i> Ataskaitos</a>
                </h2>
            </div>
        </div>
        <div class="col-sm-6" style="margin-top: 30px;">
        """),_display_(/*15.10*/form(routes.UserController.viewUserReportInfo(), 'class -> "form", 'enctype -> "multipart/form-data")/*15.111*/{_display_(Seq[Any](format.raw/*15.112*/("""
            """),format.raw/*16.13*/("""<div class="col-sm-12">
                <fieldset>
                    """),_display_(/*18.22*/select(
                        myForm("userMail"),
                        options(models.User.getAllUsers().map(f => f.email)),
                        'placeholder -> "El. paštas",
                        '_label -> "El. paštas",
                        'class -> "form-control"
                    )),format.raw/*24.22*/("""
                """),format.raw/*25.17*/("""</fieldset>

                <div class="form-actions margin-t-10">
                    <input type="submit" class="btn btn-primary" value=""""),_display_(/*28.74*/Messages("submit.button")),format.raw/*28.99*/("""">
                </div>

            </div>
        </div>
        """)))}),format.raw/*33.10*/("""
        """),_display_(/*34.10*/if(docs != null)/*34.26*/ {_display_(Seq[Any](format.raw/*34.28*/("""
            """),format.raw/*35.13*/("""<div class="row">
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
                        """),_display_(/*46.26*/for(doc <- docs) yield /*46.42*/ {_display_(Seq[Any](format.raw/*46.44*/("""
                            """),format.raw/*47.29*/("""<tr>
                                <td>"""),_display_(/*48.38*/doc/*48.41*/.file_name),format.raw/*48.51*/("""</td>
                                <td>"""),_display_(/*49.38*/doc/*49.41*/.title),format.raw/*49.47*/("""</td>
                                <td>"""),_display_(/*50.38*/doc/*50.41*/.date_created),format.raw/*50.54*/("""</td>
                            </tr>
                        """)))}),format.raw/*52.26*/("""
                        """),format.raw/*53.25*/("""</tbody>
                    </table>
                </div>
            </div>
        """)))}),format.raw/*57.10*/("""
    """),format.raw/*58.5*/("""</div>
""")))}))
      }
    }
  }

  def render(user:User,users:List[User],myForm:Form[UserReportForm],docs:List[Document]): play.twirl.api.HtmlFormat.Appendable = apply(user,users,myForm,docs)

  def f:((User,List[User],Form[UserReportForm],List[Document]) => play.twirl.api.HtmlFormat.Appendable) = (user,users,myForm,docs) => apply(user,users,myForm,docs)

  def ref: this.type = this

}


}
}

/**/
object userReport extends userReport_Scope0.userReport_Scope1.userReport
              /*
                  -- GENERATED --
                  DATE: Sat May 05 15:27:48 EEST 2018
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/user/userReport.scala.html
                  HASH: 3ef28781a27bc78293b3234ef611cfa26487a3c6
                  MATRIX: 866->31|1059->114|1087->134|1115->137|1133->147|1172->149|1204->155|1391->315|1406->321|1459->353|1696->563|1807->664|1847->665|1889->679|1990->753|2320->1062|2366->1080|2537->1224|2583->1249|2689->1324|2727->1335|2752->1351|2792->1353|2834->1367|3370->1876|3402->1892|3442->1894|3500->1924|3570->1967|3582->1970|3613->1980|3684->2024|3696->2027|3723->2033|3794->2077|3806->2080|3840->2093|3938->2160|3992->2186|4116->2279|4149->2285
                  LINES: 30->2|35->2|36->4|37->5|37->5|37->5|38->6|42->10|42->10|42->10|47->15|47->15|47->15|48->16|50->18|56->24|57->25|60->28|60->28|65->33|66->34|66->34|66->34|67->35|78->46|78->46|78->46|79->47|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|84->52|85->53|89->57|90->58
                  -- GENERATED --
              */
          