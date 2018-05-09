
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object logged_Scope0 {
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

class logged extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),_display_(/*3.2*/if(user != null)/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
   """),format.raw/*16.12*/("""
""")))}),format.raw/*17.2*/("""
"""))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object logged extends logged_Scope0.logged
              /*
                  -- GENERATED --
                  DATE: Sun Jan 07 17:46:27 EET 2018
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/logged.scala.html
                  HASH: 8d759e3f3e90ecfc3d206d5291ff704e8e3feb5e
                  MATRIX: 745->1|852->13|880->16|904->32|943->34|975->737|1007->739
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->16|36->17
                  -- GENERATED --
              */
          