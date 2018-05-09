
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mindaugas/Documents/PlayApplication/conf/routes
// @DATE:Wed May 09 20:27:51 EEST 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:46
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def viewUserReport: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.viewUserReport",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/reports/userReport.html"})
        }
      """
    )
  
    // @LINE:10
    def setPermissionBlank: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.setPermissionBlank",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/user/setPermission/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + ".html"})
        }
      """
    )
  
    // @LINE:17
    def viewUserReportInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.viewUserReportInfo",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/reports/userReport.html"})
        }
      """
    )
  
    // @LINE:12
    def setLevelBlank: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.setLevelBlank",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/user/setLevel/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + ".html"})
        }
      """
    )
  
    // @LINE:13
    def setLevelCreate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.setLevelCreate",
      """
        function(userId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/user/setLevel/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + ".html"})
        }
      """
    )
  
    // @LINE:11
    def setPermissionCreate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.setPermissionCreate",
      """
        function(userId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/user/setPermission/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + ".html"})
        }
      """
    )
  
    // @LINE:8
    def viewAllUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.viewAllUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/user/admin/userList.html"})
        }
      """
    )
  
    // @LINE:21
    def viewLoginStatsReportInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.viewLoginStatsReportInfo",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/reports/loginStatsReport.html"})
        }
      """
    )
  
    // @LINE:9
    def banUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.banUser",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/user/admin/userList/ban/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + ".html"})
        }
      """
    )
  
    // @LINE:14
    def viewDocsReport: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.viewDocsReport",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/reports.html"})
        }
      """
    )
  
    // @LINE:20
    def viewLoginStatsReport: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.viewLoginStatsReport",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/reports/loginStatsReport.html"})
        }
      """
    )
  
    // @LINE:19
    def deletePerm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.deletePerm",
      """
        function(permId,userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/user/setPermission/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("permId", permId) + "-" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + ".html"})
        }
      """
    )
  
    // @LINE:18
    def viewDateReportInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.viewDateReportInfo",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/reports/dateReport.html"})
        }
      """
    )
  
    // @LINE:7
    def blank: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.blank",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/profile.html"})
        }
      """
    )
  
    // @LINE:15
    def viewDateReport: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.viewDateReport",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/reports/dateReport.html"})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseDocumentsCategoryController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentsCategoryController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/documentCategories/create.html"})
        }
      """
    )
  
    // @LINE:32
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentsCategoryController.delete",
      """
        function(catId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/documents/category/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("catId", catId) + ".html"})
        }
      """
    )
  
    // @LINE:34
    def createBlank: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentsCategoryController.createBlank",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/documentCategories/create.html"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.signUp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:39
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:38
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login.html"})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseDocumentsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def downloadFile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentsController.downloadFile",
      """
        function(documentId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/documents/download/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("documentId", documentId) + ".html"})
        }
      """
    )
  
    // @LINE:25
    def createBlank: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentsController.createBlank",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/documents/create.html"})
        }
      """
    )
  
    // @LINE:29
    def deleteDoc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentsController.deleteDoc",
      """
        function(documentId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/documents/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("documentId", documentId) + ".html"})
        }
      """
    )
  
    // @LINE:26
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentsController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/documents/create.html"})
        }
      """
    )
  
    // @LINE:28
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentsController.edit",
      """
        function(documentId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/documents/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("documentId", documentId) + ".html"})
        }
      """
    )
  
    // @LINE:23
    def categories: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentsController.categories",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/documents.html"})
        }
      """
    )
  
    // @LINE:31
    def createComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentsController.createComment",
      """
        function(documentId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/documents/view/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("documentId", documentId) + ".html"})
        }
      """
    )
  
    // @LINE:24
    def blank: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentsController.blank",
      """
        function(categoryId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("categoryId", categoryId) + "/documents.html"})
        }
      """
    )
  
    // @LINE:30
    def viewDoc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentsController.viewDoc",
      """
        function(documentId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/documents/view/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("documentId", documentId) + ".html"})
        }
      """
    )
  
  }


}