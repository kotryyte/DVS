package models;

import com.avaje.ebean.Model;
import org.joda.time.DateTime;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.io.File;
import java.util.List;


@Entity
@Table(name="\"document_comment\"")
public class DocumentComment extends Model {

    @Id
    public Long comment_id;

    @ManyToOne
    @JoinColumn(name="\"user_id\"")
    public User user;

    @Constraints.Required
    public String content;

    @ManyToOne
    @JoinColumn(name="\"document_id\"")
    public Document document;

    public DateTime date_created;


    public static Finder<Long, DocumentComment> find = new Finder<Long, DocumentComment>(Long.class, DocumentComment.class);


    public static DocumentComment getCommentById(Long comment_id){
        return find.where().eq("comment_id", comment_id).findUnique();
    }

    public static void save(DocumentComment model){
        model.save();
    }

    public static void update(DocumentComment model) { model.update(); }

    public static void delete(DocumentComment model) { model.delete(); }

    public static List<DocumentComment> getAllDocs() {
        return find.findList();
    }

    public static List<DocumentComment> findByUserId(Long user_id) {
        return find.where().eq("user_id", user_id).findList();
    }

    public static List<DocumentComment> findByDocument(Long document_id) {
        return find.where().eq("document_id", document_id).findList();
    }

}
