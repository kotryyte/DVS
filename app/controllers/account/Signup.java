package controllers.account;

import controllers.Application;
import models.User;
import models.utils.Hash;
import org.joda.time.DateTime;
import play.Logger;
import play.data.Form;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.Result;


import views.html.account.signup.create;
import views.html.account.signup.created;


import static play.data.Form.form;

public class Signup extends Controller {

    /* Registration blank form */
    public Result create() {
        return ok(create.render(form(Application.Register.class)));
    }

    /* Registration submit form*/
    public Result save() {
        Form<Application.Register> registerForm = form(Application.Register.class).bindFromRequest();

        if(registerForm.get().inputPassword.compareTo(registerForm.get().repeatPassword) != 0){
            return badRequest(create.render(registerForm));
        }

        if (registerForm.hasErrors()) {
            return badRequest(create.render(registerForm));
        }

        Application.Register register = registerForm.get();
        Result resultError = checkBeforeSave(registerForm, register.email);

        if (resultError != null) {
            return resultError;
        }

        try {
            // Creating user data //
            User user = new User();
            user.email = register.email;
            user.passwordHash = Hash.createPassword(register.inputPassword);
            user.dateCreation = DateTime.now();

            user.user_level = 1;
            user.user_ban = false;
            user.user_name = register.name;
            user.user_surname = register.surname;
            user = User.save(user);

            return ok(created.render());
        } catch (Exception e) {
            Logger.error("Signup.save error", e);
            flash("error", Messages.get("error.technical"));
        }
        return badRequest(create.render(registerForm));
    }

    /**
     * Check if the email already exists.
     *
     * @param registerForm User Form submitted
     * @param email        email address
     * @return Index if there was a problem, null otherwise
     */
    private Result checkBeforeSave(Form<Application.Register> registerForm, String email) {
        // Check unique email
        if (User.findByEmail(email) != null) {
            flash("error", Messages.get("error.email.already.exist"));
            return badRequest(create.render(registerForm));
        }

        return null;
    }

}
