/**
 * Created by Julian on 29/12/14.
 */
public class DontReThrowExceptionSuppression {

    @SuppressWarnings("PMD.AvoidRethrowingException")
    void bar() {
        try {
            // do something
        }  catch (SomeException se) {
            throw se;
        }
    }

}
