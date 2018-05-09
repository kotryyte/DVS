
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object created_Scope0 {
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

class created extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*1.2*/scripts/*1.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*1.13*/("""
    """),format.raw/*2.5*/("""<script src=""""),_display_(/*2.19*/routes/*2.25*/.Assets.at("javascripts/password.js")),format.raw/*2.62*/("""" type="text/javascript"></script>
""")))};
Seq[Any](format.raw/*3.2*/("""
"""),format.raw/*4.1*/("""<head>
    <title>"""),_display_(/*5.13*/Messages("title")),format.raw/*5.30*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*6.50*/routes/*6.56*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*6.95*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*7.50*/routes/*7.56*/.Assets.at("stylesheets/main.css")),format.raw/*7.90*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.at("images/favicon.png")),format.raw/*8.93*/("""">
    <script src=""""),_display_(/*9.19*/routes/*9.25*/.Assets.at("javascripts/jquery/jquery-2.1.0.min.js")),format.raw/*9.77*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.at("javascripts/bootstrap.js")),format.raw/*10.63*/("""" type="text/javascript"></script>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*11.50*/routes/*11.56*/.Assets.at("stylesheets/font-awesome.min.css")),format.raw/*11.102*/("""">

    """),_display_(/*13.6*/scripts),format.raw/*13.13*/("""
"""),format.raw/*14.1*/("""</head>
<div class="flex-cont max-height">
    <div class="flex-item">
        <div class="well">
            <h3>"""),_display_(/*18.18*/Messages("signup.successfull")),format.raw/*18.48*/("""</h3>
            """),_display_(/*19.14*/Messages("signup.msg.created")),format.raw/*19.44*/("""

            """),format.raw/*21.13*/("""<div class="form-actions">
                <a href=""""),_display_(/*22.27*/routes/*22.33*/.Application.signUp),format.raw/*22.52*/("""" class="btn btn-default">"""),_display_(/*22.79*/Messages("goback")),format.raw/*22.97*/("""</a>
            </div>
        </div>
    </div>
</div>

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object created extends created_Scope0.created
              /*
                  -- GENERATED --
                  DATE: Sat May 05 14:17:04 EEST 2018
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/account/signup/created.scala.html
                  HASH: 6d33f22cab051e453bc1fc4e235a78180ae3babd
                  MATRIX: 830->1|844->8|924->12|955->17|995->31|1009->37|1066->74|1140->110|1167->111|1212->130|1249->147|1333->205|1347->211|1406->250|1484->302|1498->308|1552->342|1635->399|1649->405|1701->437|1748->458|1762->464|1834->516|1914->569|1929->575|1988->613|2099->697|2114->703|2182->749|2217->758|2245->765|2273->766|2415->881|2466->911|2512->930|2563->960|2605->974|2685->1027|2700->1033|2740->1052|2794->1079|2833->1097
                  LINES: 31->1|31->1|33->1|34->2|34->2|34->2|34->2|36->3|37->4|38->5|38->5|39->6|39->6|39->6|40->7|40->7|40->7|41->8|41->8|41->8|42->9|42->9|42->9|43->10|43->10|43->10|44->11|44->11|44->11|46->13|46->13|47->14|51->18|51->18|52->19|52->19|54->21|55->22|55->22|55->22|55->22|55->22
                  -- GENERATED --
              */
          