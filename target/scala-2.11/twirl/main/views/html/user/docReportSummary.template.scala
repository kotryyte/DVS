
package views.html.user

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object docReportSummary_Scope0 {
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

class docReportSummary extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),_display_(/*3.2*/main(user)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
    """),format.raw/*4.5*/("""<div class="col-sm-12 content">
        <div class="title-container">
            <div class="title-h2">
                <h2>
                    <a href=""""),_display_(/*8.31*/routes/*8.37*/.UserController.viewUserReport()),format.raw/*8.69*/("""">Vartotojų ataskaita</a><br>
                    <a href=""""),_display_(/*9.31*/routes/*9.37*/.UserController.viewDateReport()),format.raw/*9.69*/("""">Ataskaita pagal datą</a><br>
                    <a href=""""),_display_(/*10.31*/routes/*10.37*/.UserController.viewLoginStatsReport()),format.raw/*10.75*/("""">Prisijungimų ataskaita</a>
                </h2>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object docReportSummary extends docReportSummary_Scope0.docReportSummary
              /*
                  -- GENERATED --
                  DATE: Sun May 06 15:00:24 EEST 2018
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/user/docReportSummary.scala.html
                  HASH: 320bb05b288cd6ba977362ce20b7bbc020363e87
                  MATRIX: 770->1|877->13|907->18|925->28|964->30|996->36|1182->196|1196->202|1248->234|1335->295|1349->301|1401->333|1490->395|1505->401|1564->439
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10
                  -- GENERATED --
              */
          