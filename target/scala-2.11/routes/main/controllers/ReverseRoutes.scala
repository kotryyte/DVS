
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mindaugas/Documents/PlayApplication/conf/routes
// @DATE:Wed May 09 20:27:51 EEST 2018

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:46
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "public/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:7
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def viewUserReport(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/reports/userReport.html")
    }
  
    // @LINE:10
    def setPermissionBlank(userId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/user/setPermission/" + implicitly[PathBindable[Long]].unbind("userId", userId) + ".html")
    }
  
    // @LINE:17
    def viewUserReportInfo(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "dashboard/reports/userReport.html")
    }
  
    // @LINE:12
    def setLevelBlank(userId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/user/setLevel/" + implicitly[PathBindable[Long]].unbind("userId", userId) + ".html")
    }
  
    // @LINE:13
    def setLevelCreate(userId:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "dashboard/user/setLevel/" + implicitly[PathBindable[Long]].unbind("userId", userId) + ".html")
    }
  
    // @LINE:11
    def setPermissionCreate(userId:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "dashboard/user/setPermission/" + implicitly[PathBindable[Long]].unbind("userId", userId) + ".html")
    }
  
    // @LINE:8
    def viewAllUsers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/user/admin/userList.html")
    }
  
    // @LINE:21
    def viewLoginStatsReportInfo(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "dashboard/reports/loginStatsReport.html")
    }
  
    // @LINE:9
    def banUser(userId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/user/admin/userList/ban/" + implicitly[PathBindable[Long]].unbind("userId", userId) + ".html")
    }
  
    // @LINE:14
    def viewDocsReport(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/reports.html")
    }
  
    // @LINE:20
    def viewLoginStatsReport(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/reports/loginStatsReport.html")
    }
  
    // @LINE:19
    def deletePerm(permId:Long, userId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/user/setPermission/delete/" + implicitly[PathBindable[Long]].unbind("permId", permId) + "-" + implicitly[PathBindable[Long]].unbind("userId", userId) + ".html")
    }
  
    // @LINE:18
    def viewDateReportInfo(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "dashboard/reports/dateReport.html")
    }
  
    // @LINE:7
    def blank(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/profile.html")
    }
  
    // @LINE:15
    def viewDateReport(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/reports/dateReport.html")
    }
  
  }

  // @LINE:32
  class ReverseDocumentsCategoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "dashboard/documentCategories/create.html")
    }
  
    // @LINE:32
    def delete(catId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/documents/category/delete/" + implicitly[PathBindable[Long]].unbind("catId", catId) + ".html")
    }
  
    // @LINE:34
    def createBlank(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/documentCategories/create.html")
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def signUp(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:39
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:38
    def authenticate(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login.html")
    }
  
  }

  // @LINE:23
  class ReverseDocumentsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def downloadFile(documentId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/documents/download/" + implicitly[PathBindable[Long]].unbind("documentId", documentId) + ".html")
    }
  
    // @LINE:25
    def createBlank(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/documents/create.html")
    }
  
    // @LINE:29
    def deleteDoc(documentId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/documents/delete/" + implicitly[PathBindable[Long]].unbind("documentId", documentId) + ".html")
    }
  
    // @LINE:26
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "dashboard/documents/create.html")
    }
  
    // @LINE:28
    def edit(documentId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/documents/edit/" + implicitly[PathBindable[Long]].unbind("documentId", documentId) + ".html")
    }
  
    // @LINE:23
    def categories(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/documents.html")
    }
  
    // @LINE:31
    def createComment(documentId:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "dashboard/documents/view/" + implicitly[PathBindable[Long]].unbind("documentId", documentId) + ".html")
    }
  
    // @LINE:24
    def blank(categoryId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/" + implicitly[PathBindable[Long]].unbind("categoryId", categoryId) + "/documents.html")
    }
  
    // @LINE:30
    def viewDoc(documentId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/documents/view/" + implicitly[PathBindable[Long]].unbind("documentId", documentId) + ".html")
    }
  
  }


}