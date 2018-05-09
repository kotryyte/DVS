package models;

import com.avaje.ebean.Model;
import org.joda.time.DateTime;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "\"login_stats\"")
public class LoginStats extends Model {

    @Id
    public Long login_stats_id;

    @ManyToOne
    @JoinColumn(name="\"user_id\"")
    public User user;

    public String agent;

    @Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
    public DateTime date;

    @Constraints.Required
    @Formats.NonEmpty
    public String ip;

    public static Finder<String, LoginStats> find = new Finder(String.class, LoginStats.class);

    public static List<LoginStats> getAllStats() {
        return find.findList();
    }

    public static List<LoginStats> getStatsByUserId(Long userId){
        return find.where().eq("user_id", userId).findList();
    }

}
