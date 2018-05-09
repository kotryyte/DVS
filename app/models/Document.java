package models;

import com.avaje.ebean.Model;
import org.joda.time.DateTime;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.io.File;
import java.util.List;


@Entity
@Table(name="\"document\"")
public class Document extends Model {

    @Id
    public Long document_id;

    @ManyToOne
    @JoinColumn(name="\"user_id\"")
    public User user;

    @Constraints.Required
    public String title;

    @Constraints.Required
    public File content;

    @Constraints.Required
    public String content_type;

    public String file_name;

    @ManyToOne
    @JoinColumn(name="\"document_category_id\"")
    public DocumentCategory category;

    public DateTime date_created;


    public static Finder<Long, Document> find = new Finder<Long, Document>(Long.class, Document.class);


    public static Document getDocById(Long document_id){
        return find.where().eq("document_id", document_id).findUnique();
    }

    public static void save(Document model){
        model.save();
    }

    public static void update(Document model) { model.update(); }

    public static void delete(Document model) { model.delete(); }

    public static List<Document> getAllDocs() {
        return find.findList();
    }

    public static List<Document> findByUserId(Long user_id) {
        return find.where().eq("user_id", user_id).findList();
    }

    public static List<Document> findByCategory(Long document_category_id) {
        return find.where().eq("document_category_id", document_category_id).findList();
    }

    public static List<Document> uploadedBetween(DateTime from, DateTime to) {
        return find.where().between("date_created", from, to).findList();
    }

}
