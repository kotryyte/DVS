
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object create_Scope0 {
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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Register],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[Application.Register]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.2*/scripts/*2.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.13*/("""
    """),format.raw/*3.5*/("""<script src=""""),_display_(/*3.19*/routes/*3.25*/.Assets.at("javascripts/password.js")),format.raw/*3.62*/("""" type="text/javascript"></script>
""")))};
Seq[Any](format.raw/*1.42*/("""
"""),format.raw/*4.2*/("""
"""),format.raw/*5.1*/("""<head>
    <title>"""),_display_(/*6.13*/Messages("title")),format.raw/*6.30*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*7.50*/routes/*7.56*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*7.95*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.at("stylesheets/main.css")),format.raw/*8.90*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.at("images/favicon.png")),format.raw/*9.93*/("""">
    <script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.at("javascripts/jquery/jquery-2.1.0.min.js")),format.raw/*10.77*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*11.19*/routes/*11.25*/.Assets.at("javascripts/bootstrap.js")),format.raw/*11.63*/("""" type="text/javascript"></script>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*12.50*/routes/*12.56*/.Assets.at("stylesheets/font-awesome.min.css")),format.raw/*12.102*/("""">

    """),_display_(/*14.6*/scripts),format.raw/*14.13*/("""
"""),format.raw/*15.1*/("""</head>
    <div class="flex-cont max-height">
        <div class="flex-item">
            <div class="well">
            """),_display_(/*19.14*/createFormOnly(signupForm)),format.raw/*19.40*/("""
            """),format.raw/*20.13*/("""</div>
        </div>
    </div>
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
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Wed May 09 21:09:12 EEST 2018
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/account/signup/create.scala.html
                  HASH: 3bc2fa413eb5912d6839e92d1d2ad163fc54cc37
                  MATRIX: 782->1|900->43|914->50|994->54|1025->59|1065->73|1079->79|1136->116|1211->41|1238->152|1265->153|1310->172|1347->189|1431->247|1445->253|1504->292|1582->344|1596->350|1650->384|1733->441|1747->447|1799->479|1847->500|1862->506|1935->558|2015->611|2030->617|2089->655|2200->739|2215->745|2283->791|2318->800|2346->807|2374->808|2524->931|2571->957|2612->970
                  LINES: 27->1|31->2|31->2|33->2|34->3|34->3|34->3|34->3|36->1|37->4|38->5|39->6|39->6|40->7|40->7|40->7|41->8|41->8|41->8|42->9|42->9|42->9|43->10|43->10|43->10|44->11|44->11|44->11|45->12|45->12|45->12|47->14|47->14|48->15|52->19|52->19|53->20
                  -- GENERATED --
              */
          