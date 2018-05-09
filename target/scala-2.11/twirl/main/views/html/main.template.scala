
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User = null, scripts: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.62*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/Messages("title")),format.raw/*7.34*/("""</title>
        <meta charset="UTF-8">
        <meta http-equiv="content-type" content="text/html; charset=utf-8">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*11.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.at("stylesheets/main.css")),format.raw/*12.94*/("""">
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.at("javascripts/jquery/jquery-2.1.0.min.js")),format.raw/*13.81*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.at("javascripts/bootstrap.js")),format.raw/*14.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.at("javascripts/main.js")),format.raw/*15.62*/("""" type="text/javascript"></script>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.at("stylesheets/font-awesome.min.css")),format.raw/*16.106*/("""">

        """),_display_(/*18.10*/scripts),format.raw/*18.17*/("""
    """),format.raw/*19.5*/("""</head>
    <body>

        <div ng-controller="MenuCtrl" class="row nav-container" role="navigation">
            <div class="col-sm-2 navi">
                <div class="navbar-header">
                    <a class="navbar-brand" href=""""),_display_(/*25.52*/routes/*25.58*/.DocumentsController.categories()),format.raw/*25.91*/("""">
                    </a>
                </div>
            </div>
            <div class="col-sm-10 navi-left">
                """),_display_(/*30.18*/logged(user)),format.raw/*30.30*/("""
            """),format.raw/*31.13*/("""</div>
        </div>

        <div class="row">
            <div class="col-sm-2 navigation">
                <ul class="main-navigation">
                    <li><a href=""""),_display_(/*37.35*/routes/*37.41*/.DocumentsController.categories()),format.raw/*37.74*/(""""><i class="fa fa-home navigation-fa"></i>Pagrindinis</a></li>
                    <li></li>
                    <li><a href=""""),_display_(/*39.35*/routes/*39.41*/.UserController.blank()),format.raw/*39.64*/(""""><i class="fa fa fa-user-circle navigation-fa"></i>Profilis</a></li>
                    """),_display_(/*40.22*/if(user.user_level >= 5)/*40.46*/ {_display_(Seq[Any](format.raw/*40.48*/("""
                        """),format.raw/*41.25*/("""<li><a href=""""),_display_(/*41.39*/routes/*41.45*/.UserController.viewAllUsers()),format.raw/*41.75*/(""""><i class="fa fa fa-list navigation-fa"></i>Vartotojai</a></li>
                        <li><a href=""""),_display_(/*42.39*/routes/*42.45*/.UserController.viewDocsReport()),format.raw/*42.77*/(""""><i class="fa fa fa-paper-plane navigation-fa"></i>Ataskaita</a></li>
                    """)))}),format.raw/*43.22*/("""
                    """),format.raw/*44.21*/("""<li><a href=""""),_display_(/*44.35*/routes/*44.41*/.Application.logout()),format.raw/*44.62*/(""""><i class="fa fa fa-power-off navigation-fa"></i>Atsijungti</a></li>
                </ul>
            </div>
            <div class="container col-sm-10">
                <div class="row main-bg">
                """),_display_(/*49.18*/content),format.raw/*49.25*/("""
                """),format.raw/*50.17*/("""</div>
            </div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(user:User,scripts:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(user,scripts)(content)

  def f:((User,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (user,scripts) => (content) => apply(user,scripts)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sat May 05 15:00:15 EEST 2018
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/main.scala.html
                  HASH: 69e2eb872103bc21764c45137093dfbc246a7b46
                  MATRIX: 751->1|906->61|934->63|1011->114|1048->131|1458->514|1473->520|1533->559|1616->615|1631->621|1686->655|1738->680|1753->686|1826->738|1910->795|1925->801|1984->839|2068->896|2083->902|2137->935|2252->1023|2267->1029|2335->1075|2375->1088|2403->1095|2435->1100|2700->1338|2715->1344|2769->1377|2929->1510|2962->1522|3003->1535|3204->1709|3219->1715|3273->1748|3427->1875|3442->1881|3486->1904|3604->1995|3637->2019|3677->2021|3730->2046|3771->2060|3786->2066|3837->2096|3967->2199|3982->2205|4035->2237|4158->2329|4207->2350|4248->2364|4263->2370|4305->2391|4548->2607|4576->2614|4621->2631
                  LINES: 27->1|32->1|34->3|38->7|38->7|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|49->18|49->18|50->19|56->25|56->25|56->25|61->30|61->30|62->31|68->37|68->37|68->37|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|72->41|73->42|73->42|73->42|74->43|75->44|75->44|75->44|75->44|80->49|80->49|81->50
                  -- GENERATED --
              */
          