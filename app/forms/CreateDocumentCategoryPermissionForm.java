package forms;


/**
 * Created by Kotryna on 01/04/2018.
 */
public class CreateDocumentCategoryPermissionForm {

    public Long documentCategoryId;

    public String categoryName;

    public Long userId;

    public CreateDocumentCategoryPermissionForm() {
    }
    CreateDocumentCategoryPermissionForm(String categoryName, Long userId) {
        this.categoryName = categoryName;
        this.userId = userId;
    }
}
