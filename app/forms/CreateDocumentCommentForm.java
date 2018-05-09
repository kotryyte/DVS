package forms;


/**
 * Created by Kotryna on 01/04/2018.
 */
public class CreateDocumentCommentForm {

    public Long documentCommentId;

    public String content;

    public CreateDocumentCommentForm() {
    }
    CreateDocumentCommentForm(String content) {
        this.content = content;
    }
}
