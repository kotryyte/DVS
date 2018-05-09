package forms;


import models.DocumentCategory;
import play.data.validation.Constraints;

import java.io.File;

/**
 * Created by Kotryna on 01/04/2018.
 */
public class CreateDocumentForm {

    public Long documentId;

/*    @Constraints.Required
    public File content;*/

    public String contentType;

    public String title;

    public String category;

    public CreateDocumentForm() {
    }
    CreateDocumentForm(String contentType, String category) {
        this.contentType = contentType;
        this.category = category;
    }
}
