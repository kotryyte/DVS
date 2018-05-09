package controllers;

import forms.CreateDocumentCommentForm;
import forms.CreateDocumentForm;
import models.*;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

import java.util.List;

import static play.data.Form.form;


@Security.Authenticated(Secured.class)
public class DocumentsController extends Controller {

    public Result categories() {
        List<DocumentCategory> categories = DocumentCategory.getAllCategories();
        String message = null;
        if(StringUtils.isNotBlank(flash("permissionRequired"))) {
            message = flash("permissionRequired");
        }
        if(StringUtils.isNotBlank(flash("deletedCat"))) {
            message = flash("deletedCat");
        }
        if(StringUtils.isNotBlank(flash("cannot_delete"))) {
            message = flash("cannot_delete");
        }
        return ok(views.html.documents.categorySummary.render(User.findByEmail(request().username()), categories, message));
    }

    public Result blank(Long categoryId){
        DocumentCategory category = DocumentCategory.getCatById(categoryId);
        if(category.is_permission_required){
            if(!CategoryPermission.getIsAvailableForUser(User.findByEmail(request().username()).userId, categoryId)) {
                flash("permissionRequired", "Jūs neturite prieigos prie šios kategorijos");
                return categories();
            }
        }
        List<Document> documents = Document.findByCategory(categoryId);
        return ok(views.html.documents.summary.render(User.findByEmail(request().username()), documents, category));
    }

    public Result createBlank(){
        Form<CreateDocumentForm> documentForm = form(CreateDocumentForm.class);
        List<DocumentCategory> categories = DocumentCategory.getAllCategories();

        return ok(views.html.documents.create.render(User.findByEmail(request().username()), documentForm, null, categories));
    }
    public Result create(){
        Form<CreateDocumentForm> documentForm = form(CreateDocumentForm.class).bindFromRequest();
        User user = User.findByEmail(request().username());

        Http.MultipartFormData body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart resourceFile = body.getFile("content");

        resourceFile.getContentType();

        Document document = new Document();
        DocumentCategory cat = DocumentCategory.getCatByName(documentForm.get().category);

        if(resourceFile.getFile().length() > 25000000) {
            documentForm.reject("content", "Failas per didelis (Max 25MB)");
        }
        if(documentForm.hasErrors()) {
            return badRequest(views.html.documents.create.render(User.findByEmail(request().username()), documentForm, null, DocumentCategory.getAllCategories()));
        }

        document.title = documentForm.get().title;
        document.content_type = resourceFile.getContentType();
        document.content = resourceFile.getFile();
        document.date_created = DateTime.now();
        document.category = cat;
        document.file_name = resourceFile.getFilename();
        document.user = user;
        if(documentForm.get().documentId!= null) {
            document.document_id= documentForm.get().documentId;
        }


        if(document != null){
            if(document.document_id != null) {
                Document existingDoc = Document.getDocById(document.document_id);
                if(existingDoc != null) {
                    Long existingId = existingDoc.document_id;
                    existingDoc = document;
                    existingDoc.document_id= existingId;
                    Document.update(existingDoc);
                }
            } else {
                Document.save(document);
            }
        }
        return blank(cat.document_category_id);
    }

    public Result edit(Long documentId) {
        Form<CreateDocumentForm> documentForm = form(CreateDocumentForm.class).bindFromRequest();
        User user = User.findByEmail(request().username());

        Document existingDoc = Document.getDocById(documentId);

        if(existingDoc != null && existingDoc.user.userId == user.userId)  {
            CreateDocumentForm existingForm = new CreateDocumentForm();

            existingForm.documentId = existingDoc.document_id;
            existingForm.title = existingDoc.title;
            existingForm.contentType = existingDoc.content_type;
            existingForm.category = existingDoc.category.name;

            documentForm = documentForm.fill(existingForm);

            List<DocumentCategory> categories = DocumentCategory.getAllCategories();


            return ok(views.html.documents.create.render(user, documentForm, null, categories));
        } else {
            return categories();
        }
    }

    public Result viewDoc(Long documentId) {
        Form<CreateDocumentCommentForm> documentCommentForm = form(CreateDocumentCommentForm.class);
        List<DocumentComment> comments = DocumentComment.findByDocument(documentId);

        Document document = Document.getDocById(documentId);
        return ok(views.html.documents.view.render(User.findByEmail(request().username()), document, comments, documentCommentForm));
    }

    public Result createComment(Long documentId) {
        Form<CreateDocumentCommentForm> documentCommentForm = form(CreateDocumentCommentForm.class).bindFromRequest();
        DocumentComment comment = new DocumentComment();
        comment.content = documentCommentForm.get().content;
        comment.user = User.findByEmail(request().username());
        comment.date_created = DateTime.now();
        comment.document = Document.getDocById(documentId);

        if(documentCommentForm.get().content.length() > 255) {
            documentCommentForm.reject("content","Komentaras negali būti ilgesnis už 255 simbolius");
        }
        if( documentCommentForm.hasErrors()) {
            return badRequest(views.html.documents.view.render(User.findByEmail(request().username()),
                    Document.getDocById(documentId),DocumentComment.findByDocument(documentId), documentCommentForm));
        }
        if(comment != null) {
            comment.save();
        }

        return viewDoc(documentId);
    }


    public Result deleteDoc(Long documentId) {
        Document document = Document.getDocById(documentId);
        Long categoryId = document.category.document_category_id;
        List<DocumentComment> comments = DocumentComment.findByDocument(documentId);

        if(comments.size() > 0) {
            comments.stream().forEach(x -> x.delete(x));
        }

        if(document != null) {
            document.delete();
        }

        return blank(categoryId);
    }

    public Result downloadFile(Long documentId) {
        Document document = Document.getDocById(documentId);
        response().setContentType("application/x-download");
        response().setHeader("Content-disposition", "attachment; filename=" + document.file_name);

        return ok(document.content);
    }
}
