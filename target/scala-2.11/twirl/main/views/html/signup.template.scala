
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
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

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/scripts/*3.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
    """),format.raw/*4.5*/("""<script src=""""),_display_(/*4.19*/routes/*4.25*/.Assets.at("javascripts/password.js")),format.raw/*4.62*/("""" type="text/javascript"></script>
""")))};
Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*5.2*/("""
"""),format.raw/*6.1*/("""<head>
    <title>"""),_display_(/*7.13*/Messages("title")),format.raw/*7.30*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*8.95*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.at("stylesheets/main.css")),format.raw/*9.90*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.at("images/favicon.png")),format.raw/*10.93*/("""">
    <script src=""""),_display_(/*11.19*/routes/*11.25*/.Assets.at("javascripts/jquery/jquery-2.1.0.min.js")),format.raw/*11.77*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*12.19*/routes/*12.25*/.Assets.at("javascripts/bootstrap.js")),format.raw/*12.63*/("""" type="text/javascript"></script>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*13.50*/routes/*13.56*/.Assets.at("stylesheets/font-awesome.min.css")),format.raw/*13.102*/("""">

    """),_display_(/*15.6*/scripts),format.raw/*15.13*/("""
"""),format.raw/*16.1*/("""</head>
<div class="flex-cont max-height">
    <div class="flex-item">
        <div class="well">
        """),_display_(/*20.10*/login(loginForm)),format.raw/*20.26*/("""
        """),format.raw/*21.9*/("""</div>
    </div>
</div>

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
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Sun Oct 01 01:14:56 EEST 2017
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/signup.scala.html
                  HASH: e1b867f95c347e3022545b0d23dd52f51eab519e
                  MATRIX: 764->1|878->42|892->49|972->53|1004->59|1044->73|1058->79|1115->116|1191->37|1221->153|1249->155|1295->175|1332->192|1417->251|1431->257|1490->296|1569->349|1583->355|1637->389|1722->447|1737->453|1790->485|1839->507|1854->513|1927->565|2008->619|2023->625|2082->663|2194->748|2209->754|2277->800|2314->811|2342->818|2371->820|2509->931|2546->947|2583->957
                  LINES: 27->1|31->3|31->3|33->3|34->4|34->4|34->4|34->4|36->1|38->5|39->6|40->7|40->7|41->8|41->8|41->8|42->9|42->9|42->9|43->10|43->10|43->10|44->11|44->11|44->11|45->12|45->12|45->12|46->13|46->13|46->13|48->15|48->15|49->16|53->20|53->20|54->21
                  -- GENERATED --
              */
          