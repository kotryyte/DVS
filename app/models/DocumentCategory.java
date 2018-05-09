package models;

import com.avaje.ebean.Model;
import org.joda.time.DateTime;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="\"document_category\"")
public class DocumentCategory extends Model {

    @Id
    public Long document_category_id;

    @ManyToOne
    @JoinColumn(name="\"user_id\"")
    public User user;

    @Constraints.Required
    @Column(unique = true)
    public String name;

    public boolean is_permission_required;


    public static Finder<Long, DocumentCategory> find = new Finder<Long, DocumentCategory>(Long.class, DocumentCategory.class);


    public static DocumentCategory getCatById(Long document_category_id){
        return find.where().eq("document_category_id", document_category_id).findUnique();
    }

    public static DocumentCategory getCatByName(String name) {
        return find.where().eq("name", name).findUnique();
    }

    public static void save(DocumentCategory model){
        model.save();
    }

    public static void update(DocumentCategory model) { model.update(); }

    public static List<DocumentCategory> getAllCategories() {
        return find.findList();
    }

    public static List<DocumentCategory> getPermitedCats() {
       return find.where().eq( "is_permission_required", true).findList();
    }

}
