package controllers;

import forms.CreateDocumentCategoryForm;
import models.*;
import org.apache.commons.lang3.StringUtils;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import java.util.List;

import static play.data.Form.form;


@Security.Authenticated(Secured.class)
public class DocumentsCategoryController extends Controller {

    public Result createBlank(){
        Form<CreateDocumentCategoryForm> documentCategoryForm = form(CreateDocumentCategoryForm.class);
        String message = null;
        if(StringUtils.isNotBlank(flash("catCreated"))) {
            message = flash("catCreated");
        }
        return ok(views.html.documentCategory.create.render(User.findByEmail(request().username()), documentCategoryForm,message));
    }
    public Result create(){
        Form<CreateDocumentCategoryForm> documentForm = form(CreateDocumentCategoryForm.class).bindFromRequest();
        User user = User.findByEmail(request().username());

        DocumentCategory documentCategory = new DocumentCategory();

        documentCategory.user = user;
        documentCategory.name = documentForm.get().categoryName;
        documentCategory.is_permission_required = documentForm.get().isPermissionRequired;
        if(documentForm.get().documentCategoryId!= null) {
            documentCategory.document_category_id= documentForm.get().documentCategoryId;
        }


        if(documentCategory != null){
            if(documentCategory.document_category_id != null) {
                DocumentCategory existingDocCat = DocumentCategory.getCatById(documentCategory.document_category_id);
                if(existingDocCat != null) {
                    Long existingId = existingDocCat.document_category_id;
                    existingDocCat = documentCategory;
                    existingDocCat.document_category_id = existingId;
                    DocumentCategory.update(existingDocCat);
                }
            } else {
                DocumentCategory.save(documentCategory);
            }
        }
        flash("catCreated", "Kategorija sėkmingai sukurta");
        return createBlank();
    }

    public Result delete(Long catId) {
        User user = User.findByEmail(request().username());
        if(user.user_level >= 3) {
            DocumentCategory cat = DocumentCategory.getCatById(catId);
            List<Document> docList = Document.findByCategory(catId);
            if(docList.size() > 0) {
                flash("cannot_delete","Kategorija turi dokumentų");
                return redirect(routes.DocumentsController.categories());
            }
            List<CategoryPermission> categoryPermissions = CategoryPermission.getPermByCatId(catId);
            if (categoryPermissions.size() > 0) {
                categoryPermissions.forEach(category -> category.delete());
            }
            cat.delete();
            flash("deletedCat", "Kategorija panaikinta");
        }
        return redirect(routes.DocumentsController.categories());
    }
}
