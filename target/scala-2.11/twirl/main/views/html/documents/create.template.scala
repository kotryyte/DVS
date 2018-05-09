
package views.html.documents

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

     object create_Scope1 {
import forms.CreateDocumentForm

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[User,Form[CreateDocumentForm],String,List[DocumentCategory],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User, documentForm: Form[CreateDocumentForm], message: String, categories: List[DocumentCategory]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*2.107*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main(user)/*5.12*/{_display_(Seq[Any](format.raw/*5.13*/("""

    """),format.raw/*7.5*/("""<div class="col-sm-12">
        <div class="title-container">
            <div class="title-h2">
                <h2>Upload file</h2>
            </div>
        </div>
        <div class="col-sm-6" style="margin-top: 30px;">
        """),_display_(/*14.10*/form(routes.DocumentsController.create(), 'class -> "form", 'enctype -> "multipart/form-data")/*14.104*/ {_display_(Seq[Any](format.raw/*14.106*/("""
            """),_display_(/*15.14*/if(message != null)/*15.33*/ {_display_(Seq[Any](format.raw/*15.35*/("""
                """),format.raw/*16.17*/("""<div class="col-sm-12 margin-t-10">
                    <div class="alert alert-success">
                        <strong>File uploaded!</strong>"""),_display_(/*18.57*/message),format.raw/*18.64*/("""
                    """),format.raw/*19.21*/("""</div>
                </div>
            """)))}),format.raw/*21.14*/("""

            """),format.raw/*23.13*/("""<div class="col-sm-12">
                """),_display_(/*24.18*/if(documentForm.hasGlobalErrors)/*24.50*/ {_display_(Seq[Any](format.raw/*24.52*/("""
                    """),format.raw/*25.21*/("""<p class="error">
                        <span class="label label-danger">"""),_display_(/*26.59*/documentForm/*26.71*/.globalError.message),format.raw/*26.91*/("""</span>
                    </p>
                """)))}),format.raw/*28.18*/("""

                """),format.raw/*30.17*/("""<fieldset>
                    """),_display_(/*31.22*/inputFile(
                        documentForm("content"),
                        'placeholder -> "Failas",
                        '_label -> "Failas",
                        'required -> false,
                        '_help -> Messages("null"),
                        'class -> "form-control"

                    )),format.raw/*39.22*/("""
                    """),_display_(/*40.22*/inputText(
                        documentForm("title"),
                        'placeholder -> "Aprašymas",
                        '_label -> "Aprašymas",
                        '_help -> Messages("null"),
                        'class -> "form-control"
                    )),format.raw/*46.22*/("""
                    """),_display_(/*47.22*/select(
                        documentForm("category"),
                        options(models.DocumentCategory.getAllCategories().map(f => f.name)),
                        'placeholder -> "Kategorija",
                        '_label -> "Kategorija",
                        'class -> "form-control"
                    )),format.raw/*53.22*/("""

                    """),format.raw/*55.21*/("""<input type="hidden" name="documentId" value='"""),_display_(/*55.68*/documentForm("documentId")/*55.94*/.value),format.raw/*55.100*/("""' >
                </fieldset>

                <div class="form-actions margin-t-10">
                    <input type="submit" class="btn btn-primary" value=""""),_display_(/*59.74*/Messages("submit.button")),format.raw/*59.99*/("""">
                </div>

            </div>
        </div>
        """)))}),format.raw/*64.10*/("""
    """),format.raw/*65.5*/("""</div>



""")))}))
      }
    }
  }

  def render(user:User,documentForm:Form[CreateDocumentForm],message:String,categories:List[DocumentCategory]): play.twirl.api.HtmlFormat.Appendable = apply(user,documentForm,message,categories)

  def f:((User,Form[CreateDocumentForm],String,List[DocumentCategory]) => play.twirl.api.HtmlFormat.Appendable) = (user,documentForm,message,categories) => apply(user,documentForm,message,categories)

  def ref: this.type = this

}


}
}

/**/
object create extends create_Scope0.create_Scope1.create
              /*
                  -- GENERATED --
                  DATE: Sat May 05 14:36:40 EEST 2018
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/documents/create.scala.html
                  HASH: 7b3c4fa749a6b7156996db9c16d77a131c6216a9
                  MATRIX: 871->35|1087->140|1115->160|1143->163|1161->173|1199->174|1233->182|1501->423|1605->517|1646->519|1688->534|1716->553|1756->555|1802->573|1977->721|2005->728|2055->750|2131->795|2175->811|2244->853|2285->885|2325->887|2375->909|2479->986|2500->998|2541->1018|2624->1070|2672->1090|2732->1123|3083->1453|3133->1476|3441->1763|3491->1786|3843->2117|3895->2141|3969->2188|4004->2214|4032->2220|4224->2385|4270->2410|4376->2485|4409->2491
                  LINES: 30->2|35->2|36->4|37->5|37->5|37->5|39->7|46->14|46->14|46->14|47->15|47->15|47->15|48->16|50->18|50->18|51->19|53->21|55->23|56->24|56->24|56->24|57->25|58->26|58->26|58->26|60->28|62->30|63->31|71->39|72->40|78->46|79->47|85->53|87->55|87->55|87->55|87->55|91->59|91->59|96->64|97->65
                  -- GENERATED --
              */
          