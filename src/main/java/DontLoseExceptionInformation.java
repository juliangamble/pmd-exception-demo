/**
 * Created by Julian on 29/12/14.
 */
public class DontLoseExceptionInformation {

    void bar() {
        try {
            // do something
        } catch (SomeException se) {
            se.getMessage();
        }
    }
}
