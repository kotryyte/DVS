package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="\"category_permission\"")
public class CategoryPermission extends Model {

    @Id
    public Long category_permission_id;

    @ManyToOne
    @JoinColumn(name="\"user_id\"")
    public User user;

    @ManyToOne
    @JoinColumn(name="\"document_category_id\"")
    public DocumentCategory category;


    public static Finder<Long, CategoryPermission> find = new Finder<Long, CategoryPermission>(Long.class, CategoryPermission.class);


    public static CategoryPermission getPermById(Long category_permission_id){
        return find.where().eq("category_permission_id", category_permission_id).findUnique();
    }

    public static List<CategoryPermission> getPermByUserId(Long userId){
        return find.where().eq("user_id", userId).findList();
    }

    public static Boolean getIsAvailableForUser(Long userId, Long categoryId) {
        int rowCount = find.where()
                .eq("user_id", userId)
                .eq("document_category_id", categoryId)
                .findRowCount();
        return rowCount > 0;
    }

    public static void save(CategoryPermission model){
        model.save();
    }

    public static void update(CategoryPermission model) { model.update(); }

    public static List<CategoryPermission> getAllPermissions() {
        return find.findList();
    }

    public static List<CategoryPermission> getPermByCatId(Long categoryId) {
        return find.where().eq("document_category_id", categoryId).findList();
    }
}
