package models;

import models.utils.AppException;
import models.utils.Hash;
import org.joda.time.DateTime;
import play.data.format.Formats;
import play.data.validation.Constraints;
import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="\"user\"")
public class User extends Model {

    @Id
    @Column(name = "user_id")
    public Long userId;

    @Constraints.Required
    @Formats.NonEmpty
    @Column(unique = true)
    public String email;


    @Constraints.Required
    @Formats.NonEmpty
    public String passwordHash;

    @Formats.NonEmpty
    public String user_name;

    @Formats.NonEmpty
    public String user_surname;

    @Formats.DateTime(pattern = "yyyy-MM-dd")
    public DateTime dateCreation;

    public Integer user_level;

    public Boolean user_ban;

    // -- Queries (long id, user.class)
    public static Model.Finder<Long, User> find = new Model.Finder<Long, User>(Long.class, User.class);


    // Get User by UserId //
    public static User getUserByUserId(Long userId){
        return find.where().eq("userId", userId).findUnique();
    }
    // Saving User //
    public static User save(User model){
        model.save();
        return find.where().eq("email", model.email).findUnique();
    }

    public static void update(User model) { model.update(model); }

    public static User findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }

    public static List<User> getAllUsers() {
        return find.findList();
    }

    /**
     * Authenticate a User, from a email and clear password.
     *
     * @param email         email
     * @param clearPassword clear password
     * @return User if authenticated, null otherwise
     * @throws AppException App Exception
     */
    public static User authenticate(String email, String clearPassword) throws AppException {

        // get the user with email only to keep the salt password
        User user = find.where().eq("email", email).findUnique();
        if (user != null) {
            // get the hash password from the salt + clear password
            if (Hash.checkPassword(clearPassword, user.passwordHash)) {
                return user;
            }
        }
        return null;
    }

    public void changePassword(String password) throws AppException {
        this.passwordHash = Hash.createPassword(password);
        this.save();
    }

    /**
     * Confirms an account.
     *
     * @return true if confirmed, false otherwise.
     * @throws AppException App Exception
     */
    public static boolean confirm(User user) throws AppException {
        if (user == null) {
            return false;
        }

        user.save();
        return true;
    }

}
