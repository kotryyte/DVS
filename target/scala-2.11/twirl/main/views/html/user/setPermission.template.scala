
package views.html.user

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object setPermission_Scope0 {
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

     object setPermission_Scope1 {
import forms.CreateDocumentForm
import forms.CreateDocumentCategoryPermissionForm

class setPermission extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[User,Form[CreateDocumentCategoryPermissionForm],Long,String,List[DocumentCategory],List[CategoryPermission],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: User, permissionForm: Form[CreateDocumentCategoryPermissionForm], userId: Long, message: String, categories: List[DocumentCategory], permissions: List[CategoryPermission]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*3.180*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main(user)/*6.12*/{_display_(Seq[Any](format.raw/*6.13*/("""

    """),format.raw/*8.5*/("""<div class="col-sm-12">
        <div class="title-container">
            <div class="title-h2">
                <h2>Suteikti prieigą vartotojui """),_display_(/*11.50*/User/*11.54*/.getUserByUserId(userId).email),format.raw/*11.84*/("""</h2>
            </div>
        </div>
        <div class="col-sm-6" style="margin-top: 30px;">
        """),_display_(/*15.10*/form(routes.UserController.setPermissionCreate(userId), 'class -> "form", 'enctype -> "multipart/form-data")/*15.118*/ {_display_(Seq[Any](format.raw/*15.120*/("""
            """),_display_(/*16.14*/if(message != null)/*16.33*/ {_display_(Seq[Any](format.raw/*16.35*/("""
                """),format.raw/*17.17*/("""<div class="col-sm-12 margin-t-10">
                    <div class="alert alert-success">
                        <strong>"""),_display_(/*19.34*/message),format.raw/*19.41*/("""</strong>
                    </div>
                </div>
            """)))}),format.raw/*22.14*/("""

            """),format.raw/*24.13*/("""<div class="col-sm-12">
                """),_display_(/*25.18*/if(permissionForm.hasGlobalErrors)/*25.52*/ {_display_(Seq[Any](format.raw/*25.54*/("""
                    """),format.raw/*26.21*/("""<p class="error">
                        <span class="label label-danger">"""),_display_(/*27.59*/permissionForm/*27.73*/.globalError.message),format.raw/*27.93*/("""</span>
                    </p>
                """)))}),format.raw/*29.18*/("""

                """),format.raw/*31.17*/("""<fieldset>
                    """),_display_(/*32.22*/select(
                        permissionForm("categoryName"),
                        options(models.DocumentCategory.getPermitedCats().map(f => f.name)),
                        'placeholder -> Messages("file.title"),
                        '_label -> "Kategorijos pavadinimas",
                        'class -> "form-control"
                    )),format.raw/*38.22*/("""

                    """),format.raw/*40.21*/("""<input type="hidden" name="userId" value='"""),_display_(/*40.64*/userId),format.raw/*40.70*/("""'>
                </fieldset>

                <div class="form-actions margin-t-10">
                    <input type="submit" class="btn btn-primary" value=""""),_display_(/*44.74*/Messages("submit.button")),format.raw/*44.99*/("""">
                </div>

            </div>
        </div>
        """)))}),format.raw/*49.10*/("""

        """),format.raw/*51.9*/("""<table cellpadding="0" cellspacing="0" width="80%" class="table">
            <thead>
                <tr>
                    <th>Kategorija</th>
                    <th>Trinti</th>
                </tr>
            </thead>
            <tbody>
            """),_display_(/*59.14*/for(perm <- permissions) yield /*59.38*/{_display_(Seq[Any](format.raw/*59.39*/("""
                """),format.raw/*60.17*/("""<tr>
                    <td>"""),_display_(/*61.26*/perm/*61.30*/.category.name),format.raw/*61.44*/("""</td>
                    <td><a href=""""),_display_(/*62.35*/routes/*62.41*/.UserController.deletePerm(perm.category_permission_id, userId)),format.raw/*62.104*/(""""> <i class="fa fa-remove fa-lg" aria-hidden="true"></i> Trinti</a></td>
                </tr>
            """)))}),format.raw/*64.14*/("""
            """),format.raw/*65.13*/("""</tbody>
        </table>
    </div>



""")))}))
      }
    }
  }

  def render(user:User,permissionForm:Form[CreateDocumentCategoryPermissionForm],userId:Long,message:String,categories:List[DocumentCategory],permissions:List[CategoryPermission]): play.twirl.api.HtmlFormat.Appendable = apply(user,permissionForm,userId,message,categories,permissions)

  def f:((User,Form[CreateDocumentCategoryPermissionForm],Long,String,List[DocumentCategory],List[CategoryPermission]) => play.twirl.api.HtmlFormat.Appendable) = (user,permissionForm,userId,message,categories,permissions) => apply(user,permissionForm,userId,message,categories,permissions)

  def ref: this.type = this

}


}
}

/**/
object setPermission extends setPermission_Scope0.setPermission_Scope1.setPermission
              /*
                  -- GENERATED --
                  DATE: Wed May 09 22:10:46 EEST 2018
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/user/setPermission.scala.html
                  HASH: ceec3a2de93143acc4ab1d97abf832f176ec4946
                  MATRIX: 985->87|1274->265|1302->285|1330->288|1348->298|1386->299|1420->307|1596->456|1609->460|1660->490|1797->600|1915->708|1956->710|1998->725|2026->744|2066->746|2112->764|2264->889|2292->896|2399->972|2443->988|2512->1030|2555->1064|2595->1066|2645->1088|2749->1165|2772->1179|2813->1199|2896->1251|2944->1271|3004->1304|3384->1663|3436->1687|3506->1730|3533->1736|3724->1900|3770->1925|3876->2000|3915->2012|4209->2279|4249->2303|4288->2304|4334->2322|4392->2353|4405->2357|4440->2371|4508->2412|4523->2418|4608->2481|4749->2591|4791->2605
                  LINES: 31->3|36->3|37->5|38->6|38->6|38->6|40->8|43->11|43->11|43->11|47->15|47->15|47->15|48->16|48->16|48->16|49->17|51->19|51->19|54->22|56->24|57->25|57->25|57->25|58->26|59->27|59->27|59->27|61->29|63->31|64->32|70->38|72->40|72->40|72->40|76->44|76->44|81->49|83->51|91->59|91->59|91->59|92->60|93->61|93->61|93->61|94->62|94->62|94->62|96->64|97->65
                  -- GENERATED --
              */
          