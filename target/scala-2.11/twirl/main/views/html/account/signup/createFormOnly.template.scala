
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createFormOnly_Scope0 {
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

class createFormOnly extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Register],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[Application.Register]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*4.6*/implicitFieldConstructor/*4.30*/ = {{
        FieldConstructor(twitterBootstrapInput.render)
    }};
Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*4.1*/("""    """),format.raw/*6.6*/("""
"""),format.raw/*9.9*/("""
"""),format.raw/*10.1*/("""<h3>"""),_display_(/*10.6*/Messages("signup.new")),format.raw/*10.28*/("""</h3>

"""),_display_(/*12.2*/form(controllers.account.routes.Signup.save())/*12.48*/ {_display_(Seq[Any](format.raw/*12.50*/("""

    """),format.raw/*14.5*/("""<fieldset>
        """),_display_(/*15.10*/inputText(
            signupForm("email"),
            'placeholder -> Messages("email"),
            '_label -> null,
            'required ->true,
            'class -> "form-control"
        )),format.raw/*21.10*/("""
        """),_display_(/*22.10*/inputText(
            signupForm("name"),
            'placeholder -> "Vardas",
            '_label -> null,
            'required ->true,
            'class -> "form-control"
        )),format.raw/*28.10*/("""
        """),_display_(/*29.10*/inputText(
            signupForm("surname"),
            'placeholder -> "Pavardė",
            '_label -> null,
            'required ->true,
            'class -> "form-control"
        )),format.raw/*35.10*/("""
        """),_display_(/*36.10*/inputPassword(
            signupForm("inputPassword"),
            '_label -> null,
            'placeholder -> Messages("password"),
            'required ->true,
            'class -> "form-control"
        )),format.raw/*42.10*/("""
        """),_display_(/*43.10*/inputPassword(
            signupForm("repeatPassword"),
            '_label -> null,
            'placeholder -> Messages("password"),
            'required ->true,
            'class -> "form-control"
        )),format.raw/*49.10*/("""
    """),format.raw/*50.5*/("""</fieldset>

    <div class="form-actions">
        <input type="submit" class="btn btn-primary" value=""""),_display_(/*53.62*/Messages("signup.signup")),format.raw/*53.87*/("""">
        <br><br></br><small><a href=""""),_display_(/*54.39*/controllers/*54.50*/.routes.Application.signUp()),format.raw/*54.78*/("""">Grįžti į prisijungimo langą</a></small>
    </div>
""")))}),format.raw/*56.2*/("""

"""))
      }
    }
  }

  def render(signupForm:Form[Application.Register]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm)

  def f:((Form[Application.Register]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)

  def ref: this.type = this

}


}

/**/
object createFormOnly extends createFormOnly_Scope0.createFormOnly
              /*
                  -- GENERATED --
                  DATE: Wed May 09 22:52:20 EEST 2018
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/account/signup/createFormOnly.scala.html
                  HASH: 109593fad89c57aab526acaac0a8f025a939288d
                  MATRIX: 798->1|940->65|972->89|1068->41|1096->60|1126->155|1153->276|1181->277|1212->282|1255->304|1289->312|1344->358|1384->360|1417->366|1464->386|1681->582|1718->592|1925->778|1962->788|2173->978|2210->988|2442->1199|2479->1209|2712->1421|2744->1426|2876->1531|2922->1556|2990->1597|3010->1608|3059->1636|3143->1690
                  LINES: 27->1|31->4|31->4|34->1|36->4|36->6|37->9|38->10|38->10|38->10|40->12|40->12|40->12|42->14|43->15|49->21|50->22|56->28|57->29|63->35|64->36|70->42|71->43|77->49|78->50|81->53|81->53|82->54|82->54|82->54|84->56
                  -- GENERATED --
              */
          