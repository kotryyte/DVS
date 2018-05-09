
package views.html.documents

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object view_Scope0 {
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

     object view_Scope1 {
import forms.CreateDocumentCommentForm
import org.joda._
import java.util.Date

class view extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[User,Document,List[DocumentComment],Form[CreateDocumentCommentForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(user: User, document: Document, comments: List[DocumentComment], commentForm: Form[CreateDocumentCommentForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*4.113*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main(user)/*7.12*/{_display_(Seq[Any](format.raw/*7.13*/("""

    """),format.raw/*9.5*/("""<div class="col-sm-12">
        <div class="title-container">
            <div class="title-h2">
                <h2><a href=""""),_display_(/*12.31*/routes/*12.37*/.DocumentsController.blank(document.category.document_category_id)),format.raw/*12.103*/(""""> <i class="fa fa-arrow-circle-left fa-lg" aria-hidden="true"></i></a>
                """),_display_(/*13.18*/document/*13.26*/.title),format.raw/*13.32*/("""
                """),format.raw/*14.17*/("""</h2>
            </div>
        </div>
        <div class="col-sm-6" style="margin-top: 30px;">
            <table cellpadding="0" cellspacing="0" width="80%" class="table">
                <tbody>
                    <tr>
                        <th>Failo pavadinimas</th>
                        <td>"""),_display_(/*22.30*/document/*22.38*/.file_name),format.raw/*22.48*/("""</td>
                    </tr>
                    <tr>
                        <th>Sukūrimo data</th>
                        <td>"""),_display_(/*26.30*/document/*26.38*/.date_created),format.raw/*26.51*/("""</td>
                    </tr>
                    <tr>
                        <th>Kategorija</th>
                        <td>"""),_display_(/*30.30*/document/*30.38*/.category.name),format.raw/*30.52*/("""</td>
                    </tr>
                    <tr>
                    </tr>
                    <tr>
                    </tr>
                    """),_display_(/*36.22*/if(user.user_level >= 3)/*36.46*/ {_display_(Seq[Any](format.raw/*36.48*/("""
                        """),format.raw/*37.25*/("""<tr>
                            <th>Redaguoti</th>
                            <td><a href=""""),_display_(/*39.43*/routes/*39.49*/.DocumentsController.edit(document.document_id)),format.raw/*39.96*/(""""> <i class="fa fa-edit fa-lg" aria-hidden="true"></i></a></td>
                        </tr>
                    """)))}),format.raw/*41.22*/("""
                """),format.raw/*42.17*/("""</tbody>
            </table>
        </div>
    </div>
        <div class="col-sm-6">
        """),_display_(/*47.10*/form(routes.DocumentsController.createComment(document.document_id), 'class -> "form", 'enctype -> "multipart/form-data")/*47.131*/ {_display_(Seq[Any](format.raw/*47.133*/("""
            """),format.raw/*48.13*/("""<div class="form-actions margin-t-10">
            <fieldset>
                """),_display_(/*50.18*/textarea(
                commentForm("content"),
                '_label -> "Komentaras",
                'rows -> "4",
                'placeholder -> "Komentaras",
                '_help -> Messages("null"),
                'class -> "form-control"
                )),format.raw/*57.18*/("""
                """),format.raw/*58.17*/("""<input type="submit" class="btn btn-primary" value=""""),_display_(/*58.70*/Messages("submit.button")),format.raw/*58.95*/("""">
            </fieldset>
            </div>
        """)))}),format.raw/*61.10*/("""
        """),format.raw/*62.9*/("""<div class="col-sm-12">
            <table cellpadding="0" cellspacing="0" width="80%" class="table">
                <thead>
                    <tr>
                        <th>Autorius</th>
                        <th>Komentaras</th>
                        <th>Data</th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*72.18*/for(com <- comments) yield /*72.38*/{_display_(Seq[Any](format.raw/*72.39*/("""
                    """),format.raw/*73.21*/("""<tr>
                        <td>"""),_display_(/*74.30*/com/*74.33*/.user.email),format.raw/*74.44*/("""</td>
                        <td>"""),_display_(/*75.30*/com/*75.33*/.content),format.raw/*75.41*/("""</td>
                        <td>"""),_display_(/*76.30*/com/*76.33*/.date_created.toDateTime),format.raw/*76.57*/("""</td>
                    </tr>
                """)))}),format.raw/*78.18*/("""
                """),format.raw/*79.17*/("""</tbody>
            </table>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(user:User,document:Document,comments:List[DocumentComment],commentForm:Form[CreateDocumentCommentForm]): play.twirl.api.HtmlFormat.Appendable = apply(user,document,comments,commentForm)

  def f:((User,Document,List[DocumentComment],Form[CreateDocumentCommentForm]) => play.twirl.api.HtmlFormat.Appendable) = (user,document,comments,commentForm) => apply(user,document,comments,commentForm)

  def ref: this.type = this

}


}
}

/**/
object view extends view_Scope0.view_Scope1.view
              /*
                  -- GENERATED --
                  DATE: Sun May 06 19:16:21 EEST 2018
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/documents/view.scala.html
                  HASH: 6c1c6dd4795c22246b49ebc643839e592910d8dc
                  MATRIX: 920->86|1142->197|1170->217|1198->220|1216->230|1254->231|1288->239|1445->369|1460->375|1548->441|1665->531|1682->539|1709->545|1755->563|2094->875|2111->883|2142->893|2306->1030|2323->1038|2357->1051|2518->1185|2535->1193|2570->1207|2758->1368|2791->1392|2831->1394|2885->1420|3008->1516|3023->1522|3091->1569|3239->1686|3285->1704|3413->1805|3544->1926|3585->1928|3627->1942|3735->2023|4032->2299|4078->2317|4158->2370|4204->2395|4293->2453|4330->2463|4734->2840|4770->2860|4809->2861|4859->2883|4921->2918|4933->2921|4965->2932|5028->2968|5040->2971|5069->2979|5132->3015|5144->3018|5189->3042|5271->3093|5317->3111
                  LINES: 32->4|37->4|38->6|39->7|39->7|39->7|41->9|44->12|44->12|44->12|45->13|45->13|45->13|46->14|54->22|54->22|54->22|58->26|58->26|58->26|62->30|62->30|62->30|68->36|68->36|68->36|69->37|71->39|71->39|71->39|73->41|74->42|79->47|79->47|79->47|80->48|82->50|89->57|90->58|90->58|90->58|93->61|94->62|104->72|104->72|104->72|105->73|106->74|106->74|106->74|107->75|107->75|107->75|108->76|108->76|108->76|110->78|111->79
                  -- GENERATED --
              */
          