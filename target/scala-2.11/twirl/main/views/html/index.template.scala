
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Application.Register],Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[Application.Register], loginForm: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/scripts/*3.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
    """),format.raw/*4.5*/("""<script src=""""),_display_(/*4.19*/routes/*4.25*/.Assets.at("javascripts/password.js")),format.raw/*4.62*/("""" type="text/javascript"></script>
""")))};
Seq[Any](format.raw/*1.78*/("""

"""),format.raw/*5.2*/("""

"""),_display_(/*7.2*/main(null, scripts)/*7.21*/ {_display_(Seq[Any](format.raw/*7.23*/("""

  """),_display_(/*9.4*/wflash()),format.raw/*9.12*/("""
  """),format.raw/*10.3*/("""<div class="col-lg-6">
    <div class="well">
      """),_display_(/*12.8*/login(loginForm)),format.raw/*12.24*/("""
    """),format.raw/*13.5*/("""</div>

  </div>
""")))}))
      }
    }
  }

  def render(signupForm:Form[Application.Register],loginForm:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm,loginForm)

  def f:((Form[Application.Register],Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm,loginForm) => apply(signupForm,loginForm)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Oct 01 01:14:56 EEST 2017
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/index.scala.html
                  HASH: c27cf88f02f9853417bbaf226f34e69396c3c3b6
                  MATRIX: 789->1|943->80|957->87|1037->91|1068->96|1108->110|1122->116|1179->153|1254->77|1282->189|1310->192|1337->211|1376->213|1406->218|1434->226|1464->229|1543->282|1580->298|1612->303
                  LINES: 27->1|31->3|31->3|33->3|34->4|34->4|34->4|34->4|36->1|38->5|40->7|40->7|40->7|42->9|42->9|43->10|45->12|45->12|46->13
                  -- GENERATED --
              */
          