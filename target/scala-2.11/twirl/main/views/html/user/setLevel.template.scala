
package views.html.user

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object setLevel_Scope0 {
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

     object setLevel_Scope1 {
import forms.CreateUserLevelForm

class setLevel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[User,Form[CreateUserLevelForm],Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User, levelForm: Form[CreateUserLevelForm], userId: Long, message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*2.83*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main(user)/*5.12*/{_display_(Seq[Any](format.raw/*5.13*/("""

    """),format.raw/*7.5*/("""<div class="col-sm-12">
        <div class="title-container">
            <div class="title-h2">
                <h2>Suteikti lygį vartotojui """),_display_(/*10.47*/User/*10.51*/.getUserByUserId(userId).email),format.raw/*10.81*/("""</h2>
            </div>
        </div>
        <div class="col-sm-6" style="margin-top: 30px;">
        """),_display_(/*14.10*/form(routes.UserController.setLevelCreate(userId), 'class -> "form", 'enctype -> "multipart/form-data")/*14.113*/ {_display_(Seq[Any](format.raw/*14.115*/("""
            """),_display_(/*15.14*/if(message != null)/*15.33*/ {_display_(Seq[Any](format.raw/*15.35*/("""
                """),format.raw/*16.17*/("""<div class="col-sm-12 margin-t-10">
                    <div class="alert alert-success">
                        <strong>"""),_display_(/*18.34*/message),format.raw/*18.41*/("""</strong>
                    </div>
                </div>
            """)))}),format.raw/*21.14*/("""

            """),format.raw/*23.13*/("""<div class="col-sm-12">
                """),_display_(/*24.18*/if(levelForm.hasGlobalErrors)/*24.47*/ {_display_(Seq[Any](format.raw/*24.49*/("""
                    """),format.raw/*25.21*/("""<p class="error">
                        <span class="label label-danger">"""),_display_(/*26.59*/levelForm/*26.68*/.globalError.message),format.raw/*26.88*/("""</span>
                    </p>
                """)))}),format.raw/*28.18*/("""

                """),format.raw/*30.17*/("""<fieldset>
                    """),_display_(/*31.22*/select(
                        levelForm("userLevel"),
                        options = Seq(
                            "1" -> "1 Lygmuo",
                            "2" -> "2 Lygmuo",
                            "3" -> "3 Lygmuo",
                            "4" -> "4 Lygmuo",
                            "5" -> "5 Lygmuo"
                        ),
                        'placeholder -> "Lygmuo",
                        '_label -> "Lygmuo",
                        'class -> "form-control"
                    )),format.raw/*43.22*/("""

                    """),format.raw/*45.21*/("""<input type="hidden" name="userId" value='"""),_display_(/*45.64*/userId),format.raw/*45.70*/("""'>
                </fieldset>

                <div class="form-actions margin-t-10">
                    <input type="submit" class="btn btn-primary" value=""""),_display_(/*49.74*/Messages("submit.button")),format.raw/*49.99*/("""">
                </div>

            </div>
        </div>
        """)))}),format.raw/*54.10*/("""
    """),format.raw/*55.5*/("""</div>



""")))}))
      }
    }
  }

  def render(user:User,levelForm:Form[CreateUserLevelForm],userId:Long,message:String): play.twirl.api.HtmlFormat.Appendable = apply(user,levelForm,userId,message)

  def f:((User,Form[CreateUserLevelForm],Long,String) => play.twirl.api.HtmlFormat.Appendable) = (user,levelForm,userId,message) => apply(user,levelForm,userId,message)

  def ref: this.type = this

}


}
}

/**/
object setLevel extends setLevel_Scope0.setLevel_Scope1.setLevel
              /*
                  -- GENERATED --
                  DATE: Sat May 05 13:46:22 EEST 2018
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/user/setLevel.scala.html
                  HASH: 76966f6cfd4747196f0b8225931571b54d6612c6
                  MATRIX: 856->36|1047->117|1075->137|1103->140|1121->150|1159->151|1193->159|1366->305|1379->309|1430->339|1567->449|1680->552|1721->554|1763->569|1791->588|1831->590|1877->608|2029->733|2057->740|2164->816|2208->832|2277->874|2315->903|2355->905|2405->927|2509->1004|2527->1013|2568->1033|2651->1085|2699->1105|2759->1138|3313->1671|3365->1695|3435->1738|3462->1744|3653->1908|3699->1933|3805->2008|3838->2014
                  LINES: 30->2|35->2|36->4|37->5|37->5|37->5|39->7|42->10|42->10|42->10|46->14|46->14|46->14|47->15|47->15|47->15|48->16|50->18|50->18|53->21|55->23|56->24|56->24|56->24|57->25|58->26|58->26|58->26|60->28|62->30|63->31|75->43|77->45|77->45|77->45|81->49|81->49|86->54|87->55
                  -- GENERATED --
              */
          