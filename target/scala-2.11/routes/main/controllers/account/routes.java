
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mindaugas/Documents/PlayApplication/conf/routes
// @DATE:Wed May 09 20:27:51 EEST 2018

package controllers.account;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.account.ReverseSignup Signup = new controllers.account.ReverseSignup(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.account.javascript.ReverseSignup Signup = new controllers.account.javascript.ReverseSignup(RoutesPrefix.byNamePrefix());
  }

}
