/**
 * Created by Julian on 29/12/14.
 */
public class DontLoseExceptionInformationSupression {

    @SuppressWarnings("PMD.AvoidLosingExceptionInformation")
    void bar() {
        try {
            // do something
        } catch (SomeException se) {
            se.getMessage();
        }
    }
}
