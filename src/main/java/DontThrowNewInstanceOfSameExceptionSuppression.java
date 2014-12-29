/**
 * Created by Julian on 29/12/14.
 */
public class DontThrowNewInstanceOfSameExceptionSuppression {

    @SuppressWarnings("PMD.AvoidThrowingNewInstanceOfSameException")
    void bar() {
        try {
            // do something
        }  catch (ChildRuntimeException se) {
            // harmless comment
            throw new ChildRuntimeException(se);
        }
    }
}
