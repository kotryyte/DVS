package forms;


/**
 * Created by Kotryna on 01/04/2018.
 */
public class CreateUserLevelForm {

    public String userLevel;

    public Long userId;

    public CreateUserLevelForm() {
    }
    CreateUserLevelForm(String userLevel, Long userId) {
        this.userLevel = userLevel;
        this.userId = userId;
    }
}
