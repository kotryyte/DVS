
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mindaugas/Documents/PlayApplication/conf/routes
// @DATE:Wed May 09 20:27:51 EEST 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:42
package controllers.account.javascript {
  import ReverseRouteContext.empty

  // @LINE:42
  class ReverseSignup(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup.html"})
        }
      """
    )
  
    // @LINE:42
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup.html"})
        }
      """
    )
  
  }


}