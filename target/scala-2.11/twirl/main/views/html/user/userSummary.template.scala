
package views.html.user

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object userSummary_Scope0 {
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

class userSummary extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User,List[Document],List[CategoryPermission],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User, documents: List[Document], permissions: List[CategoryPermission]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.80*/("""

"""),_display_(/*3.2*/main(user)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
    """),format.raw/*4.5*/("""<div class="col-sm-12 content">
        <div class="title-container">
            <div class="title-h2">
                <h2>Vartotojo informacija</h2>
            </div>
        </div>
        <div class="row">
            <a class="created-url" href=""""),_display_(/*11.43*/routes/*11.49*/.DocumentsController.createBlank()),format.raw/*11.83*/(""""><input type="button" class="btn" value="Įkelti dokumentą"></a>
        </div>
            <div class="row">
                <div class="col-sm-12">
                    <table cellpadding="0" cellspacing="0" width="80%" class="table">
                        <tr>
                            <th>Vartotojas</th>
                            <td>"""),_display_(/*18.34*/user/*18.38*/.email),format.raw/*18.44*/("""</td>
                        </tr>
                        <tr>
                            <th>Registracijos data</th>
                            <td>"""),_display_(/*22.34*/user/*22.38*/.dateCreation),format.raw/*22.51*/("""</td>
                        </tr>
                        <tr>
                            <th>Įkeltų dokumentų skaičius</th>
                            <td>"""),_display_(/*26.34*/documents/*26.43*/.size()),format.raw/*26.50*/("""</td>
                        </tr>
                    </table>
                </div>
            </div>
        <div class="title-container">
            <div class="title-h2">
                <h2>Mano dokumentai</h2>
            </div>
        </div>
        <div class="col-sm-12">
            <table cellpadding="0" cellspacing="0" width="80%" class="table">
                <thead>
                    <tr>
                        <th></th>
                        <th>Aprašymas</th>
                        <th>Failo pavadinimas</th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*46.18*/for(docs <- documents) yield /*46.40*/{_display_(Seq[Any](format.raw/*46.41*/("""
                    """),format.raw/*47.21*/("""<tr>
                        <th><a href=""""),_display_(/*48.39*/routes/*48.45*/.DocumentsController.viewDoc(docs.document_id)),format.raw/*48.91*/(""""> <i class="fa fa-search fa-lg" aria-hidden="true"></i></a></th>
                        <th>"""),_display_(/*49.30*/docs/*49.34*/.title),format.raw/*49.40*/("""</th>
                        <th>"""),_display_(/*50.30*/docs/*50.34*/.file_name),format.raw/*50.44*/("""</th>
                    </tr>
                """)))}),format.raw/*52.18*/("""
                """),format.raw/*53.17*/("""</tbody>
            </table>
        </div>
        <div class="title-container">
            <div class="title-h2">
                <h2>Kategorijų prieigos</h2>
            </div>
        </div>
        <div class="col-sm-12">
            <table cellpadding="0" cellspacing="0" width="80%" class="table">
                <thead>
                    <tr>
                        <th>Pavadinimas</th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*69.18*/for(perm <- permissions) yield /*69.42*/{_display_(Seq[Any](format.raw/*69.43*/("""
                    """),format.raw/*70.21*/("""<tr>
                        <th><a href=""""),_display_(/*71.39*/routes/*71.45*/.DocumentsController.blank(perm.category.document_category_id)),format.raw/*71.107*/("""">"""),_display_(/*71.110*/perm/*71.114*/.category.name),format.raw/*71.128*/("""</a></th>
                    </tr>
                """)))}),format.raw/*73.18*/("""
                """),format.raw/*74.17*/("""</tbody>
            </table>
        </div>
    </div>


""")))}))
      }
    }
  }

  def render(user:User,documents:List[Document],permissions:List[CategoryPermission]): play.twirl.api.HtmlFormat.Appendable = apply(user,documents,permissions)

  def f:((User,List[Document],List[CategoryPermission]) => play.twirl.api.HtmlFormat.Appendable) = (user,documents,permissions) => apply(user,documents,permissions)

  def ref: this.type = this

}


}

/**/
object userSummary extends userSummary_Scope0.userSummary
              /*
                  -- GENERATED --
                  DATE: Sat May 05 14:38:46 EEST 2018
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/user/userSummary.scala.html
                  HASH: 7ef6a41208e9fc2b4b5af97a8e14ceaa96819388
                  MATRIX: 800->1|973->79|1003->84|1021->94|1060->96|1092->102|1380->363|1395->369|1450->403|1830->756|1843->760|1870->766|2055->924|2068->928|2102->941|2294->1106|2312->1115|2340->1122|3021->1776|3059->1798|3098->1799|3148->1821|3219->1865|3234->1871|3301->1917|3424->2013|3437->2017|3464->2023|3527->2059|3540->2063|3571->2073|3653->2124|3699->2142|4235->2651|4275->2675|4314->2676|4364->2698|4435->2742|4450->2748|4534->2810|4565->2813|4579->2817|4615->2831|4701->2886|4747->2904
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|42->11|42->11|42->11|49->18|49->18|49->18|53->22|53->22|53->22|57->26|57->26|57->26|77->46|77->46|77->46|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|83->52|84->53|100->69|100->69|100->69|101->70|102->71|102->71|102->71|102->71|102->71|102->71|104->73|105->74
                  -- GENERATED --
              */
          