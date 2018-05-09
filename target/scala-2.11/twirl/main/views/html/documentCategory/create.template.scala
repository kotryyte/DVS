
package views.html.documentCategory

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
import forms.CreateDocumentCategoryForm

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User,Form[CreateDocumentCategoryForm],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User, categoryForm: Form[CreateDocumentCategoryForm], message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*2.79*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main(user)/*5.12*/{_display_(Seq[Any](format.raw/*5.13*/("""

    """),format.raw/*7.5*/("""<div class="col-sm-12">
        <div class="title-container">
            <div class="title-h2">
                <h2><a href=""""),_display_(/*10.31*/routes/*10.37*/.DocumentsController.categories),format.raw/*10.68*/(""""> <i class="fa fa-arrow-circle-left fa-lg" aria-hidden="true"></i></a>
                    Sukurti naują kategoriją</h2>
            </div>
        </div>
        <div class="col-sm-6" style="margin-top: 30px;">
        """),_display_(/*15.10*/form(routes.DocumentsCategoryController.create(), 'class -> "form", 'enctype -> "multipart/form-data")/*15.112*/ {_display_(Seq[Any](format.raw/*15.114*/("""
            """),_display_(/*16.14*/if(message != null)/*16.33*/ {_display_(Seq[Any](format.raw/*16.35*/("""
                """),format.raw/*17.17*/("""<div class="col-sm-12 margin-t-10">
                    <div class="alert alert-success">
                        <strong>"""),_display_(/*19.34*/message),format.raw/*19.41*/("""</strong>
                    </div>
                </div>
            """)))}),format.raw/*22.14*/("""

            """),format.raw/*24.13*/("""<div class="col-sm-12">
                """),_display_(/*25.18*/if(categoryForm.hasGlobalErrors)/*25.50*/ {_display_(Seq[Any](format.raw/*25.52*/("""
                    """),format.raw/*26.21*/("""<p class="error">
                        <span class="label label-danger">"""),_display_(/*27.59*/categoryForm/*27.71*/.globalError.message),format.raw/*27.91*/("""</span>
                    </p>
                """)))}),format.raw/*29.18*/("""

                """),format.raw/*31.17*/("""<fieldset>
                    """),_display_(/*32.22*/inputText(
                        categoryForm("categoryName"),
                        'placeholder -> "Pavadinimas",
                        '_label -> "Pavadinimas",
                        '_help -> Messages("null"),
                        'class -> "form-control"
                    )),format.raw/*38.22*/("""
                    """),_display_(/*39.22*/checkbox(
                        categoryForm("isPermissionRequired"),
                        '_label -> "Tik su prieiga"
                    )),format.raw/*42.22*/("""

                    """),format.raw/*44.21*/("""<input type="hidden" name="documentId" value='"""),_display_(/*44.68*/categoryForm("documentCategoryId")/*44.102*/.value),format.raw/*44.108*/("""' >
                </fieldset>

                <div class="form-actions margin-t-10">
                    <input type="submit" class="btn btn-primary" value=""""),_display_(/*48.74*/Messages("submit.button")),format.raw/*48.99*/("""">
                </div>

            </div>
        </div>
        """)))}),format.raw/*53.10*/("""
    """),format.raw/*54.5*/("""</div>



""")))}))
      }
    }
  }

  def render(user:User,categoryForm:Form[CreateDocumentCategoryForm],message:String): play.twirl.api.HtmlFormat.Appendable = apply(user,categoryForm,message)

  def f:((User,Form[CreateDocumentCategoryForm],String) => play.twirl.api.HtmlFormat.Appendable) = (user,categoryForm,message) => apply(user,categoryForm,message)

  def ref: this.type = this

}


}
}

/**/
object create extends create_Scope0.create_Scope1.create
              /*
                  -- GENERATED --
                  DATE: Sat May 05 14:44:03 EEST 2018
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/documentCategory/create.scala.html
                  HASH: 8b8e2c47357d99b81b52d192f03b2892395247ee
                  MATRIX: 871->43|1058->120|1086->140|1114->143|1132->153|1170->154|1204->162|1361->292|1376->298|1428->329|1682->556|1794->658|1835->660|1877->675|1905->694|1945->696|1991->714|2143->839|2171->846|2278->922|2322->938|2391->980|2432->1012|2472->1014|2522->1036|2626->1113|2647->1125|2688->1145|2771->1197|2819->1217|2879->1250|3198->1548|3248->1571|3417->1719|3469->1743|3543->1790|3587->1824|3615->1830|3807->1995|3853->2020|3959->2095|3992->2101
                  LINES: 30->2|35->2|36->4|37->5|37->5|37->5|39->7|42->10|42->10|42->10|47->15|47->15|47->15|48->16|48->16|48->16|49->17|51->19|51->19|54->22|56->24|57->25|57->25|57->25|58->26|59->27|59->27|59->27|61->29|63->31|64->32|70->38|71->39|74->42|76->44|76->44|76->44|76->44|80->48|80->48|85->53|86->54
                  -- GENERATED --
              */
          