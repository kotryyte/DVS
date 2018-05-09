package forms;


/**
 * Created by Kotryna on 01/04/2018.
 */
public class CreateDocumentCategoryForm {

    public Long documentCategoryId;

    public String categoryName;

    public boolean isPermissionRequired;

    public CreateDocumentCategoryForm() {
    }
    CreateDocumentCategoryForm(String categoryName) {
        this.categoryName = categoryName;
    }
}
