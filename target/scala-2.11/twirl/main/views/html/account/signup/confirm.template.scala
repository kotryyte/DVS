
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object confirm_Scope0 {
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

class confirm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main()/*1.8*/ {_display_(Seq[Any](format.raw/*1.10*/("""

    """),format.raw/*3.5*/("""<h3>"""),_display_(/*3.10*/Messages("signup.signup")),format.raw/*3.35*/(""" """),format.raw/*3.36*/("""- """),_display_(/*3.39*/Messages("confirmation")),format.raw/*3.63*/("""</h3>

    """),_display_(/*5.6*/wflash()),format.raw/*5.14*/("""

    """),format.raw/*7.5*/("""<div class="form-actions">
        <a href=""""),_display_(/*8.19*/routes/*8.25*/.Application.signUp),format.raw/*8.44*/("""" class="btn btn-default">"""),_display_(/*8.71*/Messages("goback")),format.raw/*8.89*/("""</a>
    </div>
""")))}),format.raw/*10.2*/("""
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
object confirm extends confirm_Scope0.confirm
              /*
                  -- GENERATED --
                  DATE: Sun Oct 01 01:14:56 EEST 2017
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/account/signup/confirm.scala.html
                  HASH: e34556eddc9f0d9746b7539020fe15ae417d9046
                  MATRIX: 846->1|859->7|898->9|930->15|961->20|1006->45|1034->46|1063->49|1107->73|1144->85|1172->93|1204->99|1275->144|1289->150|1328->169|1381->196|1419->214|1466->231
                  LINES: 32->1|32->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|36->5|36->5|38->7|39->8|39->8|39->8|39->8|39->8|41->10
                  -- GENERATED --
              */
          