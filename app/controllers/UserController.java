package controllers;

import forms.CreateDocumentCategoryPermissionForm;
import forms.CreateUserLevelForm;
import forms.DateReportForm;
import forms.UserReportForm;
import models.*;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import play.data.Form;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import java.util.ArrayList;
import java.util.List;

import static play.data.Form.form;


@Security.Authenticated(Secured.class)
public class UserController extends Controller {
    public Result blank(){
        List<Document> userDocs = Document.findByUserId(User.findByEmail(request().username()).userId);
        List<CategoryPermission> perm = CategoryPermission.getPermByUserId(User.findByEmail(request().username()).userId);
        return ok(views.html.user.userSummary.render(User.findByEmail(request().username()), userDocs, perm));
    }

    public Result viewAllUsers() {
        User user = User.findByEmail(request().username());
        if (user.user_level >= 5) {
            String message = null;
            if(StringUtils.isNotBlank(flash("cantBan"))) {
                message = flash("cantBan");
            }
            List<User> allUsers = User.getAllUsers();
            return ok(views.html.user.userList.render(user, allUsers, message));
        }
        return redirect(routes.DocumentsController.categories());
    }

    public Result viewDocsReport() {
        User user = User.findByEmail(request().username());
        if (user.user_level >= 5) {
            return ok(views.html.user.docReportSummary.render(user));
        }
        return redirect(routes.DocumentsController.categories());
    }

    public Result viewUserReport() {
        User user = User.findByEmail(request().username());
        if (user.user_level >= 5) {
            Form<UserReportForm> form = form(UserReportForm.class);
            List<User> allUsers = User.getAllUsers();
            return ok(views.html.user.userReport.render(user, allUsers, form, null));
        }
        return redirect(routes.DocumentsController.categories());
    }

    public Result viewUserReportInfo() {
        List<User> allUsers = User.getAllUsers();
        User user = User.findByEmail(request().username());
        Form<UserReportForm> form = form(UserReportForm.class).bindFromRequest();
        Long userId = User.findByEmail(form.get().userMail).userId;
        List<Document> docs = null;
        if(userId != null) {
            docs = Document.findByUserId(userId);
        }
        return ok(views.html.user.userReport.render(user, allUsers, form, docs));

    }

    public Result viewDateReport() {
        User user = User.findByEmail(request().username());
        Form<DateReportForm> form = form(DateReportForm.class);
        if (user.user_level >= 5) {
            return ok(views.html.user.dateReport.render(user, form, null));
        }
        return redirect(routes.DocumentsController.categories());
    }

    public Result viewDateReportInfo() {
        User user = User.findByEmail(request().username());
        Form<DateReportForm> form = form(DateReportForm.class).bindFromRequest();

        DateTime from = new DateTime(form.get().from);
        DateTime to = new DateTime(form.get().to);

        List<Document> docs = Document.uploadedBetween(from, to);

        return ok(views.html.user.dateReport.render(user, form, docs));

    }

    public Result viewLoginStatsReport() {
        User user = User.findByEmail(request().username());
        Form<UserReportForm> form = form(UserReportForm.class);
        List<User> allUsers = User.getAllUsers();
        if (user.user_level >= 5) {
            List<LoginStats> stats = LoginStats.getAllStats();
            return ok(views.html.user.loginStatsReport.render(user, allUsers, form, stats));
        }
        return redirect(routes.DocumentsController.categories());
    }

    public Result viewLoginStatsReportInfo() {
        User user = User.findByEmail(request().username());
        Form<UserReportForm> form = form(UserReportForm.class).bindFromRequest();
        List<User> allUsers = User.getAllUsers();

        Long userId = User.findByEmail(form.get().userMail).userId;
        List<LoginStats> stats = null;
        if(userId != null) {
            stats = LoginStats.getStatsByUserId(userId);
        }

        return ok(views.html.user.loginStatsReport.render(user, allUsers, form, stats));
    }

    public Result banUser(Long userId) {
        User user = User.getUserByUserId(userId);
        User myUser = User.findByEmail(request().username());
        if(user != null && !user.userId.equals(myUser.userId)) {
            user.user_ban = true;
            User.update(user);
        } else {
            flash("cantBan", "Negalima užblokuoti vartotojo");
        }
        return viewAllUsers();
    }

    public Result setPermissionBlank(Long userId) {
        User user = User.findByEmail(request().username());
        Form<CreateDocumentCategoryPermissionForm> form = form(CreateDocumentCategoryPermissionForm.class);

        List<DocumentCategory> categories = DocumentCategory.getPermitedCats();
        List<CategoryPermission> permissions = CategoryPermission.getPermByUserId(userId);
        String flash = null;
        if(StringUtils.isNotBlank(flash("permissionSet"))) {
            flash = flash("permissionSet");
        }
        if(user.user_level >= 5) {
            return ok(views.html.user.setPermission.render(user, form, userId, flash, categories, permissions));
        }
        return redirect(routes.DocumentsController.categories());
    }

    public Result setPermissionCreate(Long userId) {
        Form<CreateDocumentCategoryPermissionForm> form = form(CreateDocumentCategoryPermissionForm.class).bindFromRequest();

        CategoryPermission permission = new CategoryPermission();
        DocumentCategory category = DocumentCategory.getCatByName(form.get().categoryName);
        permission.category = DocumentCategory.getCatByName(form.get().categoryName);
        permission.user = User.getUserByUserId(form.get().userId);

        if(!CategoryPermission.getIsAvailableForUser(userId, category.document_category_id)){
            flash("permissionSet", "Leidimas vartotojui sėkmingai sukurtas");
            permission.save();
        } else {
            flash("permissionSet", "Leidimas jau sukurtas");
        }

        return setPermissionBlank(userId);

    }

    public Result setLevelBlank(Long userId) {
        User user = User.findByEmail(request().username());
        Form<CreateUserLevelForm> form = form(CreateUserLevelForm.class);

        String flash = null;
        if(StringUtils.isNotBlank(flash("levelSet"))) {
            flash = flash("levelSet");
        }
        if(user.user_level >= 5) {
            return ok(views.html.user.setLevel.render(user, form, userId, flash));
        }
        return redirect(routes.DocumentsController.categories());
    }

    public Result setLevelCreate(Long userId) {
        Form<CreateUserLevelForm> form = form(CreateUserLevelForm.class).bindFromRequest();

        User user = User.getUserByUserId(userId);

        int level = Integer.parseInt(form.get().userLevel);

        if(user.user_level != level){
            user.user_level = level;
            user.save();
            flash("levelSet", "Vartotojo lygmuo sėkmingai pakeistas");
        } else {
            flash("levelSet", "Vartotojas jau turi šį lygmenį");
        }

        return setLevelBlank(userId);
    }

    public Result deletePerm(Long permId, Long userId) {
        CategoryPermission perm  = CategoryPermission.getPermById(permId);
        User myUser = User.findByEmail(request().username());
        if(myUser.user_level > 3) {
            perm.delete();
        }
        return redirect(routes.UserController.setPermissionBlank(userId));
    }

}
