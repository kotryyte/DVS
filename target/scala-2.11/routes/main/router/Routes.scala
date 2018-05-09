
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mindaugas/Documents/PlayApplication/conf/routes
// @DATE:Wed May 09 20:27:51 EEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_5: controllers.Application,
  // @LINE:7
  UserController_0: controllers.UserController,
  // @LINE:23
  DocumentsController_1: controllers.DocumentsController,
  // @LINE:32
  DocumentsCategoryController_2: controllers.DocumentsCategoryController,
  // @LINE:42
  Signup_4: controllers.account.Signup,
  // @LINE:46
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_5: controllers.Application,
    // @LINE:7
    UserController_0: controllers.UserController,
    // @LINE:23
    DocumentsController_1: controllers.DocumentsController,
    // @LINE:32
    DocumentsCategoryController_2: controllers.DocumentsCategoryController,
    // @LINE:42
    Signup_4: controllers.account.Signup,
    // @LINE:46
    Assets_3: controllers.Assets
  ) = this(errorHandler, Application_5, UserController_0, DocumentsController_1, DocumentsCategoryController_2, Signup_4, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_5, UserController_0, DocumentsController_1, DocumentsCategoryController_2, Signup_4, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.signUp()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/profile.html""", """controllers.UserController.blank()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/user/admin/userList.html""", """controllers.UserController.viewAllUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/user/admin/userList/ban/$userId<[^/]+>.html""", """controllers.UserController.banUser(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/user/setPermission/$userId<[^/]+>.html""", """controllers.UserController.setPermissionBlank(userId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/user/setPermission/$userId<[^/]+>.html""", """controllers.UserController.setPermissionCreate(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/user/setLevel/$userId<[^/]+>.html""", """controllers.UserController.setLevelBlank(userId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/user/setLevel/$userId<[^/]+>.html""", """controllers.UserController.setLevelCreate(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/reports.html""", """controllers.UserController.viewDocsReport()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/reports/dateReport.html""", """controllers.UserController.viewDateReport()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/reports/userReport.html""", """controllers.UserController.viewUserReport()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/reports/userReport.html""", """controllers.UserController.viewUserReportInfo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/reports/dateReport.html""", """controllers.UserController.viewDateReportInfo()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/user/setPermission/delete/$permId<[^/]+>-$userId<[^/]+>.html""", """controllers.UserController.deletePerm(permId:Long, userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/reports/loginStatsReport.html""", """controllers.UserController.viewLoginStatsReport()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/reports/loginStatsReport.html""", """controllers.UserController.viewLoginStatsReportInfo()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/documents.html""", """controllers.DocumentsController.categories()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/$categoryId<[^/]+>/documents.html""", """controllers.DocumentsController.blank(categoryId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/documents/create.html""", """controllers.DocumentsController.createBlank()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/documents/create.html""", """controllers.DocumentsController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/documents/download/$documentId<[^/]+>.html""", """controllers.DocumentsController.downloadFile(documentId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/documents/edit/$documentId<[^/]+>.html""", """controllers.DocumentsController.edit(documentId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/documents/delete/$documentId<[^/]+>.html""", """controllers.DocumentsController.deleteDoc(documentId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/documents/view/$documentId<[^/]+>.html""", """controllers.DocumentsController.viewDoc(documentId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/documents/view/$documentId<[^/]+>.html""", """controllers.DocumentsController.createComment(documentId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/documents/category/delete/$catId<[^/]+>.html""", """controllers.DocumentsCategoryController.delete(catId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/documentCategories/create.html""", """controllers.DocumentsCategoryController.createBlank()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/documentCategories/create.html""", """controllers.DocumentsCategoryController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login.html""", """controllers.Application.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Application.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup.html""", """controllers.account.Signup.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup.html""", """controllers.account.Signup.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """public/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_signUp0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_signUp0_invoker = createInvoker(
    Application_5.signUp(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "signUp",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_UserController_blank1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/profile.html")))
  )
  private[this] lazy val controllers_UserController_blank1_invoker = createInvoker(
    UserController_0.blank(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "blank",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard/profile.html"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UserController_viewAllUsers2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/user/admin/userList.html")))
  )
  private[this] lazy val controllers_UserController_viewAllUsers2_invoker = createInvoker(
    UserController_0.viewAllUsers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "viewAllUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard/user/admin/userList.html"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_banUser3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/user/admin/userList/ban/"), DynamicPart("userId", """[^/]+""",true), StaticPart(".html")))
  )
  private[this] lazy val controllers_UserController_banUser3_invoker = createInvoker(
    UserController_0.banUser(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "banUser",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """dashboard/user/admin/userList/ban/$userId<[^/]+>.html"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UserController_setPermissionBlank4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/user/setPermission/"), DynamicPart("userId", """[^/]+""",true), StaticPart(".html")))
  )
  private[this] lazy val controllers_UserController_setPermissionBlank4_invoker = createInvoker(
    UserController_0.setPermissionBlank(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "setPermissionBlank",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """dashboard/user/setPermission/$userId<[^/]+>.html"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UserController_setPermissionCreate5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/user/setPermission/"), DynamicPart("userId", """[^/]+""",true), StaticPart(".html")))
  )
  private[this] lazy val controllers_UserController_setPermissionCreate5_invoker = createInvoker(
    UserController_0.setPermissionCreate(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "setPermissionCreate",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """dashboard/user/setPermission/$userId<[^/]+>.html"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserController_setLevelBlank6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/user/setLevel/"), DynamicPart("userId", """[^/]+""",true), StaticPart(".html")))
  )
  private[this] lazy val controllers_UserController_setLevelBlank6_invoker = createInvoker(
    UserController_0.setLevelBlank(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "setLevelBlank",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """dashboard/user/setLevel/$userId<[^/]+>.html"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_setLevelCreate7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/user/setLevel/"), DynamicPart("userId", """[^/]+""",true), StaticPart(".html")))
  )
  private[this] lazy val controllers_UserController_setLevelCreate7_invoker = createInvoker(
    UserController_0.setLevelCreate(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "setLevelCreate",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """dashboard/user/setLevel/$userId<[^/]+>.html"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UserController_viewDocsReport8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/reports.html")))
  )
  private[this] lazy val controllers_UserController_viewDocsReport8_invoker = createInvoker(
    UserController_0.viewDocsReport(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "viewDocsReport",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard/reports.html"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UserController_viewDateReport9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/reports/dateReport.html")))
  )
  private[this] lazy val controllers_UserController_viewDateReport9_invoker = createInvoker(
    UserController_0.viewDateReport(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "viewDateReport",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard/reports/dateReport.html"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_viewUserReport10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/reports/userReport.html")))
  )
  private[this] lazy val controllers_UserController_viewUserReport10_invoker = createInvoker(
    UserController_0.viewUserReport(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "viewUserReport",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard/reports/userReport.html"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UserController_viewUserReportInfo11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/reports/userReport.html")))
  )
  private[this] lazy val controllers_UserController_viewUserReportInfo11_invoker = createInvoker(
    UserController_0.viewUserReportInfo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "viewUserReportInfo",
      Nil,
      "POST",
      """""",
      this.prefix + """dashboard/reports/userReport.html"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UserController_viewDateReportInfo12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/reports/dateReport.html")))
  )
  private[this] lazy val controllers_UserController_viewDateReportInfo12_invoker = createInvoker(
    UserController_0.viewDateReportInfo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "viewDateReportInfo",
      Nil,
      "POST",
      """""",
      this.prefix + """dashboard/reports/dateReport.html"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UserController_deletePerm13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/user/setPermission/delete/"), DynamicPart("permId", """[^/]+""",true), StaticPart("-"), DynamicPart("userId", """[^/]+""",true), StaticPart(".html")))
  )
  private[this] lazy val controllers_UserController_deletePerm13_invoker = createInvoker(
    UserController_0.deletePerm(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "deletePerm",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """dashboard/user/setPermission/delete/$permId<[^/]+>-$userId<[^/]+>.html"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UserController_viewLoginStatsReport14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/reports/loginStatsReport.html")))
  )
  private[this] lazy val controllers_UserController_viewLoginStatsReport14_invoker = createInvoker(
    UserController_0.viewLoginStatsReport(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "viewLoginStatsReport",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard/reports/loginStatsReport.html"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_UserController_viewLoginStatsReportInfo15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/reports/loginStatsReport.html")))
  )
  private[this] lazy val controllers_UserController_viewLoginStatsReportInfo15_invoker = createInvoker(
    UserController_0.viewLoginStatsReportInfo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "viewLoginStatsReportInfo",
      Nil,
      "POST",
      """""",
      this.prefix + """dashboard/reports/loginStatsReport.html"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_DocumentsController_categories16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/documents.html")))
  )
  private[this] lazy val controllers_DocumentsController_categories16_invoker = createInvoker(
    DocumentsController_1.categories(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentsController",
      "categories",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard/documents.html"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_DocumentsController_blank17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/"), DynamicPart("categoryId", """[^/]+""",true), StaticPart("/documents.html")))
  )
  private[this] lazy val controllers_DocumentsController_blank17_invoker = createInvoker(
    DocumentsController_1.blank(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentsController",
      "blank",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """dashboard/$categoryId<[^/]+>/documents.html"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_DocumentsController_createBlank18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/documents/create.html")))
  )
  private[this] lazy val controllers_DocumentsController_createBlank18_invoker = createInvoker(
    DocumentsController_1.createBlank(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentsController",
      "createBlank",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard/documents/create.html"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_DocumentsController_create19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/documents/create.html")))
  )
  private[this] lazy val controllers_DocumentsController_create19_invoker = createInvoker(
    DocumentsController_1.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentsController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """dashboard/documents/create.html"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_DocumentsController_downloadFile20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/documents/download/"), DynamicPart("documentId", """[^/]+""",true), StaticPart(".html")))
  )
  private[this] lazy val controllers_DocumentsController_downloadFile20_invoker = createInvoker(
    DocumentsController_1.downloadFile(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentsController",
      "downloadFile",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """dashboard/documents/download/$documentId<[^/]+>.html"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_DocumentsController_edit21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/documents/edit/"), DynamicPart("documentId", """[^/]+""",true), StaticPart(".html")))
  )
  private[this] lazy val controllers_DocumentsController_edit21_invoker = createInvoker(
    DocumentsController_1.edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentsController",
      "edit",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """dashboard/documents/edit/$documentId<[^/]+>.html"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_DocumentsController_deleteDoc22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/documents/delete/"), DynamicPart("documentId", """[^/]+""",true), StaticPart(".html")))
  )
  private[this] lazy val controllers_DocumentsController_deleteDoc22_invoker = createInvoker(
    DocumentsController_1.deleteDoc(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentsController",
      "deleteDoc",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """dashboard/documents/delete/$documentId<[^/]+>.html"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_DocumentsController_viewDoc23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/documents/view/"), DynamicPart("documentId", """[^/]+""",true), StaticPart(".html")))
  )
  private[this] lazy val controllers_DocumentsController_viewDoc23_invoker = createInvoker(
    DocumentsController_1.viewDoc(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentsController",
      "viewDoc",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """dashboard/documents/view/$documentId<[^/]+>.html"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_DocumentsController_createComment24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/documents/view/"), DynamicPart("documentId", """[^/]+""",true), StaticPart(".html")))
  )
  private[this] lazy val controllers_DocumentsController_createComment24_invoker = createInvoker(
    DocumentsController_1.createComment(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentsController",
      "createComment",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """dashboard/documents/view/$documentId<[^/]+>.html"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_DocumentsCategoryController_delete25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/documents/category/delete/"), DynamicPart("catId", """[^/]+""",true), StaticPart(".html")))
  )
  private[this] lazy val controllers_DocumentsCategoryController_delete25_invoker = createInvoker(
    DocumentsCategoryController_2.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentsCategoryController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """dashboard/documents/category/delete/$catId<[^/]+>.html"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_DocumentsCategoryController_createBlank26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/documentCategories/create.html")))
  )
  private[this] lazy val controllers_DocumentsCategoryController_createBlank26_invoker = createInvoker(
    DocumentsCategoryController_2.createBlank(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentsCategoryController",
      "createBlank",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard/documentCategories/create.html"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_DocumentsCategoryController_create27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/documentCategories/create.html")))
  )
  private[this] lazy val controllers_DocumentsCategoryController_create27_invoker = createInvoker(
    DocumentsCategoryController_2.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentsCategoryController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """dashboard/documentCategories/create.html"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Application_authenticate28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login.html")))
  )
  private[this] lazy val controllers_Application_authenticate28_invoker = createInvoker(
    Application_5.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """login.html"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Application_logout29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout29_invoker = createInvoker(
    Application_5.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_account_Signup_create30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup.html")))
  )
  private[this] lazy val controllers_account_Signup_create30_invoker = createInvoker(
    Signup_4.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "create",
      Nil,
      "GET",
      """ Registers the user, sending an email to confirm the account.""",
      this.prefix + """signup.html"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_account_Signup_save31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup.html")))
  )
  private[this] lazy val controllers_account_Signup_save31_invoker = createInvoker(
    Signup_4.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """signup.html"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Assets_at32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at32_invoker = createInvoker(
    Assets_3.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """public/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_signUp0_route(params) =>
      call { 
        controllers_Application_signUp0_invoker.call(Application_5.signUp())
      }
  
    // @LINE:7
    case controllers_UserController_blank1_route(params) =>
      call { 
        controllers_UserController_blank1_invoker.call(UserController_0.blank())
      }
  
    // @LINE:8
    case controllers_UserController_viewAllUsers2_route(params) =>
      call { 
        controllers_UserController_viewAllUsers2_invoker.call(UserController_0.viewAllUsers())
      }
  
    // @LINE:9
    case controllers_UserController_banUser3_route(params) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_UserController_banUser3_invoker.call(UserController_0.banUser(userId))
      }
  
    // @LINE:10
    case controllers_UserController_setPermissionBlank4_route(params) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_UserController_setPermissionBlank4_invoker.call(UserController_0.setPermissionBlank(userId))
      }
  
    // @LINE:11
    case controllers_UserController_setPermissionCreate5_route(params) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_UserController_setPermissionCreate5_invoker.call(UserController_0.setPermissionCreate(userId))
      }
  
    // @LINE:12
    case controllers_UserController_setLevelBlank6_route(params) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_UserController_setLevelBlank6_invoker.call(UserController_0.setLevelBlank(userId))
      }
  
    // @LINE:13
    case controllers_UserController_setLevelCreate7_route(params) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_UserController_setLevelCreate7_invoker.call(UserController_0.setLevelCreate(userId))
      }
  
    // @LINE:14
    case controllers_UserController_viewDocsReport8_route(params) =>
      call { 
        controllers_UserController_viewDocsReport8_invoker.call(UserController_0.viewDocsReport())
      }
  
    // @LINE:15
    case controllers_UserController_viewDateReport9_route(params) =>
      call { 
        controllers_UserController_viewDateReport9_invoker.call(UserController_0.viewDateReport())
      }
  
    // @LINE:16
    case controllers_UserController_viewUserReport10_route(params) =>
      call { 
        controllers_UserController_viewUserReport10_invoker.call(UserController_0.viewUserReport())
      }
  
    // @LINE:17
    case controllers_UserController_viewUserReportInfo11_route(params) =>
      call { 
        controllers_UserController_viewUserReportInfo11_invoker.call(UserController_0.viewUserReportInfo())
      }
  
    // @LINE:18
    case controllers_UserController_viewDateReportInfo12_route(params) =>
      call { 
        controllers_UserController_viewDateReportInfo12_invoker.call(UserController_0.viewDateReportInfo())
      }
  
    // @LINE:19
    case controllers_UserController_deletePerm13_route(params) =>
      call(params.fromPath[Long]("permId", None), params.fromPath[Long]("userId", None)) { (permId, userId) =>
        controllers_UserController_deletePerm13_invoker.call(UserController_0.deletePerm(permId, userId))
      }
  
    // @LINE:20
    case controllers_UserController_viewLoginStatsReport14_route(params) =>
      call { 
        controllers_UserController_viewLoginStatsReport14_invoker.call(UserController_0.viewLoginStatsReport())
      }
  
    // @LINE:21
    case controllers_UserController_viewLoginStatsReportInfo15_route(params) =>
      call { 
        controllers_UserController_viewLoginStatsReportInfo15_invoker.call(UserController_0.viewLoginStatsReportInfo())
      }
  
    // @LINE:23
    case controllers_DocumentsController_categories16_route(params) =>
      call { 
        controllers_DocumentsController_categories16_invoker.call(DocumentsController_1.categories())
      }
  
    // @LINE:24
    case controllers_DocumentsController_blank17_route(params) =>
      call(params.fromPath[Long]("categoryId", None)) { (categoryId) =>
        controllers_DocumentsController_blank17_invoker.call(DocumentsController_1.blank(categoryId))
      }
  
    // @LINE:25
    case controllers_DocumentsController_createBlank18_route(params) =>
      call { 
        controllers_DocumentsController_createBlank18_invoker.call(DocumentsController_1.createBlank())
      }
  
    // @LINE:26
    case controllers_DocumentsController_create19_route(params) =>
      call { 
        controllers_DocumentsController_create19_invoker.call(DocumentsController_1.create())
      }
  
    // @LINE:27
    case controllers_DocumentsController_downloadFile20_route(params) =>
      call(params.fromPath[Long]("documentId", None)) { (documentId) =>
        controllers_DocumentsController_downloadFile20_invoker.call(DocumentsController_1.downloadFile(documentId))
      }
  
    // @LINE:28
    case controllers_DocumentsController_edit21_route(params) =>
      call(params.fromPath[Long]("documentId", None)) { (documentId) =>
        controllers_DocumentsController_edit21_invoker.call(DocumentsController_1.edit(documentId))
      }
  
    // @LINE:29
    case controllers_DocumentsController_deleteDoc22_route(params) =>
      call(params.fromPath[Long]("documentId", None)) { (documentId) =>
        controllers_DocumentsController_deleteDoc22_invoker.call(DocumentsController_1.deleteDoc(documentId))
      }
  
    // @LINE:30
    case controllers_DocumentsController_viewDoc23_route(params) =>
      call(params.fromPath[Long]("documentId", None)) { (documentId) =>
        controllers_DocumentsController_viewDoc23_invoker.call(DocumentsController_1.viewDoc(documentId))
      }
  
    // @LINE:31
    case controllers_DocumentsController_createComment24_route(params) =>
      call(params.fromPath[Long]("documentId", None)) { (documentId) =>
        controllers_DocumentsController_createComment24_invoker.call(DocumentsController_1.createComment(documentId))
      }
  
    // @LINE:32
    case controllers_DocumentsCategoryController_delete25_route(params) =>
      call(params.fromPath[Long]("catId", None)) { (catId) =>
        controllers_DocumentsCategoryController_delete25_invoker.call(DocumentsCategoryController_2.delete(catId))
      }
  
    // @LINE:34
    case controllers_DocumentsCategoryController_createBlank26_route(params) =>
      call { 
        controllers_DocumentsCategoryController_createBlank26_invoker.call(DocumentsCategoryController_2.createBlank())
      }
  
    // @LINE:35
    case controllers_DocumentsCategoryController_create27_route(params) =>
      call { 
        controllers_DocumentsCategoryController_create27_invoker.call(DocumentsCategoryController_2.create())
      }
  
    // @LINE:38
    case controllers_Application_authenticate28_route(params) =>
      call { 
        controllers_Application_authenticate28_invoker.call(Application_5.authenticate())
      }
  
    // @LINE:39
    case controllers_Application_logout29_route(params) =>
      call { 
        controllers_Application_logout29_invoker.call(Application_5.logout())
      }
  
    // @LINE:42
    case controllers_account_Signup_create30_route(params) =>
      call { 
        controllers_account_Signup_create30_invoker.call(Signup_4.create())
      }
  
    // @LINE:43
    case controllers_account_Signup_save31_route(params) =>
      call { 
        controllers_account_Signup_save31_invoker.call(Signup_4.save())
      }
  
    // @LINE:46
    case controllers_Assets_at32_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at32_invoker.call(Assets_3.at(path, file))
      }
  }
}