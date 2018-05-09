
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*4.80*/("""
"""),format.raw/*5.1*/("""<h3 class="text-center">"""),_display_(/*5.26*/Messages("signin.signin")),format.raw/*5.51*/("""</h3>

"""),_display_(/*7.2*/form(routes.Application.authenticate(), 'class -> "form")/*7.59*/ {_display_(Seq[Any](format.raw/*7.61*/("""

    """),_display_(/*9.6*/if(loginForm.hasGlobalErrors)/*9.35*/ {_display_(Seq[Any](format.raw/*9.37*/("""
        """),format.raw/*10.9*/("""<p class="error">
            <span class="label label-danger">"""),_display_(/*11.47*/loginForm/*11.56*/.globalError.message),format.raw/*11.76*/("""</span>
        </p>
    """)))}),format.raw/*13.6*/("""

    """),format.raw/*15.5*/("""<fieldset>
        """),_display_(/*16.10*/inputText(
            loginForm("email"),
            'placeholder -> Messages("email"),
            '_label -> null,
            '_help -> Messages("null"),
            'class -> "form-control"
        )),format.raw/*22.10*/("""
        """),_display_(/*23.10*/inputPassword(
            loginForm("password"),
            '_label -> null,
            'placeholder -> Messages("password"),
            '_help -> Messages("null"),
            'class -> "form-control"
        )),format.raw/*29.10*/("""
    """),format.raw/*30.5*/("""</fieldset>

    <div class="form-actions">
        <input type="submit" class="btn btn-primary" value=""""),_display_(/*33.62*/Messages("signin.signin")),format.raw/*33.87*/("""" style="margin-bottom: 20px;">
        <small style="margin-left: 90px;"><a href=""""),_display_(/*34.53*/controllers/*34.64*/.account.routes.Signup.create()),format.raw/*34.95*/("""">Registruotis</a></small>
    </div>
""")))}),format.raw/*36.2*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Wed May 09 21:14:29 EEST 2018
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/login.scala.html
                  HASH: 05b07557f31d2e2aa20336a247e2a5112f310017
                  MATRIX: 762->1|900->57|932->81|1016->37|1045->135|1072->136|1123->161|1168->186|1201->194|1266->251|1305->253|1337->260|1374->289|1413->291|1449->300|1540->364|1558->373|1599->393|1655->419|1688->425|1735->445|1961->650|1998->660|2234->875|2266->880|2398->985|2444->1010|2555->1094|2575->1105|2627->1136|2696->1175
                  LINES: 27->1|31->4|31->4|32->1|34->4|35->5|35->5|35->5|37->7|37->7|37->7|39->9|39->9|39->9|40->10|41->11|41->11|41->11|43->13|45->15|46->16|52->22|53->23|59->29|60->30|63->33|63->33|64->34|64->34|64->34|66->36
                  -- GENERATED --
              */
          