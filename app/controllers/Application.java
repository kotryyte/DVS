package controllers;

import models.LoginStats;
import models.User;
import models.utils.AppException;
import org.h2.store.fs.FileUtils;
import org.joda.time.DateTime;
import play.Logger;
import play.Play;
import play.mvc.Http;
import play.data.Form;
import play.data.validation.Constraints;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.signup;


import static play.data.Form.form;


public class Application extends Controller {


    public static Result GO_DASHBOARD = redirect(
            routes.DocumentsController.categories()
    );
    /*generating login view */
    public Result signUp(){
        return ok(views.html.signup.render(form(Login.class)));
    }

    /**
     * Display the login page or dashboard if connected
     *
     * @return login page or dashboard
     */
    public Result index() {
        // Check that the email matches a confirmed user before we redirect
        String email = ctx().session().get("email");
        if (email != null) {
            User user = User.findByEmail(email);
            if (user != null && user.user_level > 1) {
                return GO_DASHBOARD;
            } else {
                Logger.debug("Clearing invalid session credentials");
                session().clear();
            }
        }

        return ok(index.render(form(Register.class), form(Login.class)));
    }

    /**
     * Login class used by Login Form.
     */
    public static class Login {

        @Constraints.Required
        public String email;
        @Constraints.Required
        public String password;

        /* Validate login form user data*/
        public String validate() {

            User user = null;
            try {
                user = User.authenticate(email, password);
            } catch (AppException e) {
                return Messages.get("error.technical");
            }
            if (user == null) {
                return Messages.get("invalid.user.or.password");
            } else if (user.user_level <= 1 ) {
                return Messages.get("account.not.validated.check.mail");
            }
            return null;
        }

    }

    public static class Register {

        @Constraints.Required
        public String email;

        @Constraints.Required
        public String name;

        @Constraints.Required
        public String surname;

        @Constraints.Required
        public String inputPassword;

        @Constraints.Required
        public String repeatPassword;

        /**
         * Validate the authentication.
         *
         * @return null if validation ok, string with details otherwise
         */
        public String validate() {
            if (isBlank(email)) {
                return "El. paštas yra privalomas";
            }

            if (isBlank(name)) {
                return "Vardas yra privalomas";
            }

            if (isBlank(surname)) {
                return "Pavardė yra privaloma";
            }

            if (isBlank(inputPassword)) {
                return "Slaptažodis yra privalomas";
            }

            if (isBlank(repeatPassword)) {
                return "Reikia pakartoti slaptažodį";
            }

            if(inputPassword.compareTo(repeatPassword) != 0) {
                return "Slaptažodžiai nesutampa";
            }

            return null;
        }

        private boolean isBlank(String input) {
            return input == null || input.isEmpty() || input.trim().isEmpty();
        }
    }

    /* Login submit*/
    public Result authenticate() {
        Form<Login> loginForm = form(Login.class).bindFromRequest();
        User user = User.findByEmail(loginForm.get().email);
        if(user.user_ban) {
            return badRequest(signup.render(loginForm));
        }
        if (loginForm.hasErrors()) {
            return badRequest(signup.render(loginForm));
        } else {
            session("email", loginForm.get().email);
            LoginStats stats = new LoginStats();
            stats.agent = request().getHeader("User-Agent");
            stats.ip = request().remoteAddress();
            stats.date = DateTime.now();
            stats.user = user;
            stats.save();
            return GO_DASHBOARD;
        }
    }

    /**
     * Logout and clean the session.
     *
     * @return Index page
     */
    public Result logout() {
        session().clear();
        flash("success", Messages.get("youve.been.logged.out"));
        return ok(views.html.signup.render(form(Login.class)));
    }

}