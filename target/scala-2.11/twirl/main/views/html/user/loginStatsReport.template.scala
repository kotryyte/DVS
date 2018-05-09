
package views.html.user

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object loginStatsReport_Scope0 {
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

     object loginStatsReport_Scope1 {
import forms.UserReportForm

class loginStatsReport extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[User,List[User],Form[UserReportForm],List[LoginStats],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User, users: List[User], myForm: Form[UserReportForm], stats: List[LoginStats]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*2.88*/("""
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
        """),_display_(/*15.10*/form(routes.UserController.viewLoginStatsReportInfo(), 'class -> "form", 'enctype -> "multipart/form-data")/*15.117*/{_display_(Seq[Any](format.raw/*15.118*/("""
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
        """),_display_(/*34.10*/if(stats != null)/*34.27*/ {_display_(Seq[Any](format.raw/*34.29*/("""
            """),format.raw/*35.13*/("""<h3 style="padding: 30px;">Prisijungimo duomenys</h3>
            <div class="row">
                <div class="col-sm-12">
                    <table cellpadding="0" cellspacing="0" width="80%" class="table">
                        <thead>
                            <tr>
                                <th>Vartotojas</th>
                                <th>Naršyklė</th>
                                <th>IP adresas</th>
                                <th>Data</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*48.26*/for(stat <- stats) yield /*48.44*/ {_display_(Seq[Any](format.raw/*48.46*/("""
                            """),format.raw/*49.29*/("""<tr>
                                <td>"""),_display_(/*50.38*/stat/*50.42*/.user.email),format.raw/*50.53*/("""</td>
                                <td>"""),_display_(/*51.38*/stat/*51.42*/.agent),format.raw/*51.48*/("""</td>
                                <td>"""),_display_(/*52.38*/stat/*52.42*/.ip),format.raw/*52.45*/("""</td>
                                <td>"""),_display_(/*53.38*/stat/*53.42*/.date),format.raw/*53.47*/("""</td>
                            </tr>
                        """)))}),format.raw/*55.26*/("""
                        """),format.raw/*56.25*/("""</tbody>
                    </table>
                </div>
            </div>
        """)))}),format.raw/*60.10*/("""
    """),format.raw/*61.5*/("""</div>
""")))}))
      }
    }
  }

  def render(user:User,users:List[User],myForm:Form[UserReportForm],stats:List[LoginStats]): play.twirl.api.HtmlFormat.Appendable = apply(user,users,myForm,stats)

  def f:((User,List[User],Form[UserReportForm],List[LoginStats]) => play.twirl.api.HtmlFormat.Appendable) = (user,users,myForm,stats) => apply(user,users,myForm,stats)

  def ref: this.type = this

}


}
}

/**/
object loginStatsReport extends loginStatsReport_Scope0.loginStatsReport_Scope1.loginStatsReport
              /*
                  -- GENERATED --
                  DATE: Wed May 09 22:00:28 EEST 2018
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/user/loginStatsReport.scala.html
                  HASH: 877993bfa099b710858da2aa7d6b986522a5ea8f
                  MATRIX: 886->31|1082->117|1110->137|1138->140|1156->150|1195->152|1227->158|1414->318|1429->324|1482->356|1719->566|1836->673|1876->674|1918->688|2019->762|2349->1071|2395->1089|2566->1233|2612->1258|2718->1333|2756->1344|2782->1361|2822->1363|2864->1377|3503->1989|3537->2007|3577->2009|3635->2039|3705->2082|3718->2086|3750->2097|3821->2141|3834->2145|3861->2151|3932->2195|3945->2199|3969->2202|4040->2246|4053->2250|4079->2255|4177->2322|4231->2348|4355->2441|4388->2447
                  LINES: 30->2|35->2|36->4|37->5|37->5|37->5|38->6|42->10|42->10|42->10|47->15|47->15|47->15|48->16|50->18|56->24|57->25|60->28|60->28|65->33|66->34|66->34|66->34|67->35|80->48|80->48|80->48|81->49|82->50|82->50|82->50|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|85->53|87->55|88->56|92->60|93->61
                  -- GENERATED --
              */
          