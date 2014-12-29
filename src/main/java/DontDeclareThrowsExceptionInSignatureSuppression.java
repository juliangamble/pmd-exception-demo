/**
 * Created by Julian on 29/12/14.
 */
public class DontDeclareThrowsExceptionInSignatureSuppression {

    @SuppressWarnings("PMD.SignatureDeclareThrowsException")
    public void methodThrowingException() throws Exception {
    }

}

