
package views.html.user

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object userList_Scope0 {
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

     object userList_Scope1 {
import java.text.SimpleDateFormat
import org.joda.time.format.DateTimeFormat

class userList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User,List[User],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: User, allUsers: List[User], message: String = null):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import org.joda._

Seq[Any](format.raw/*3.60*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main(user)/*6.12*/ {_display_(Seq[Any](format.raw/*6.14*/("""
"""),format.raw/*7.1*/("""<div class="col-sm-12 content">
    <div class="title-container">
        <div class="title-h2">
            <h2>User List</h2>
        </div>
    </div>
    <div class="row">
    """),_display_(/*14.6*/if(message != null)/*14.25*/ {_display_(Seq[Any](format.raw/*14.27*/("""
        """),format.raw/*15.9*/("""<div class="col-sm-12 margin-t-10">
            <div class="alert alert-warning">
                <strong>"""),_display_(/*17.26*/message),format.raw/*17.33*/("""</strong>
            </div>
        </div>
    """)))}),format.raw/*20.6*/("""
    """),format.raw/*21.5*/("""</div>
    <div class="row">
        <div class="col-sm-12">
            <table cellpadding="0" cellspacing="0" width="80%" class="table">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>El. paštas</th>
                        <th>Registracijos data</th>
                        <th>Vartotojo lygmuo</th>
                        <th>Blokuoti</th>
                        <th>Suteikti prieigą</th>
                        <th>Suteikti lygmenį</th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*37.18*/for(user <- allUsers) yield /*37.39*/{_display_(Seq[Any](format.raw/*37.40*/("""
                         """),format.raw/*38.26*/("""<tr>
                             <td>"""),_display_(/*39.35*/user/*39.39*/.userId),format.raw/*39.46*/("""</td>
                             <td>"""),_display_(/*40.35*/user/*40.39*/.email),format.raw/*40.45*/("""</td>
                             <td>"""),_display_(/*41.35*/user/*41.39*/.dateCreation),format.raw/*41.52*/("""</td>
                             <td>"""),_display_(/*42.35*/user/*42.39*/.user_level),format.raw/*42.50*/("""</td>
                             <td><a href=""""),_display_(/*43.44*/routes/*43.50*/.UserController.banUser(user.userId)),format.raw/*43.86*/("""" onclick="return confirm('Ar tikrai norte blokuoti vartotoją?');"> <i class="fa fa-ban fa-lg" aria-hidden="true"></i> Blokuoti</a></td>
                             <td><a href=""""),_display_(/*44.44*/routes/*44.50*/.UserController.setPermissionBlank(user.userId)),format.raw/*44.97*/(""""> <i class="fa fa-plus fa-lg" aria-hidden="true"></i> Prieiga</a></td>
                             <td><a href=""""),_display_(/*45.44*/routes/*45.50*/.UserController.setLevelBlank(user.userId)),format.raw/*45.92*/(""""> <i class="fa fa-plus fa-lg" aria-hidden="true"></i> Lygmuo</a></td>
                         </tr>
                """)))}),format.raw/*47.18*/("""
                """),format.raw/*48.17*/("""</tbody>
            </table>
        </div>
    </div>
</div>

    <div id="modal-dialog" class="modal">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <a href="#" data-dismiss="modal" aria-hidden="true" class="close">×</a>
                    <h3>Patvirtinimas</h3>
                </div>
                <div class="modal-body">
                    <p>Ar norite užblokuoti vartotoją?</p>
                </div>
                <div class="modal-footer">
                    <a href="#" id="btnYes" class="btn confirm">Yes</a>
                    <a href="#" data-dismiss="modal" aria-hidden="true" class="btn secondary">No</a>
                </div>
            </div>
        </div>
    </div>


""")))}))
      }
    }
  }

  def render(user:User,allUsers:List[User],message:String): play.twirl.api.HtmlFormat.Appendable = apply(user,allUsers,message)

  def f:((User,List[User],String) => play.twirl.api.HtmlFormat.Appendable) = (user,allUsers,message) => apply(user,allUsers,message)

  def ref: this.type = this

}


}
}

/**/
object userList extends userList_Scope0.userList_Scope1.userList
              /*
                  -- GENERATED --
                  DATE: Wed May 09 22:16:59 EEST 2018
                  SOURCE: /home/mindaugas/Documents/PlayApplication/app/views/user/userList.scala.html
                  HASH: 6c4b6007d3cea37eb59f75dd3b966c272daa646b
                  MATRIX: 880->82|1050->140|1078->162|1106->165|1124->175|1163->177|1191->179|1405->367|1433->386|1473->388|1510->398|1646->507|1674->514|1756->566|1789->572|2436->1192|2473->1213|2512->1214|2567->1241|2634->1281|2647->1285|2675->1292|2743->1333|2756->1337|2783->1343|2851->1384|2864->1388|2898->1401|2966->1442|2979->1446|3011->1457|3088->1507|3103->1513|3160->1549|3368->1730|3383->1736|3451->1783|3594->1899|3609->1905|3672->1947|3824->2068|3870->2086
                  LINES: 31->3|36->3|37->5|38->6|38->6|38->6|39->7|46->14|46->14|46->14|47->15|49->17|49->17|52->20|53->21|69->37|69->37|69->37|70->38|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|79->47|80->48
                  -- GENERATED --
              */
          