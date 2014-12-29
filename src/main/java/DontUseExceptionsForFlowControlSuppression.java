/**
 * Created by Julian on 29/12/14.
 */
public class DontUseExceptionsForFlowControlSuppression {

    @SuppressWarnings("PMD.ExceptionAsFlowControl")
    void bar() {
        try {
            try {
            } catch (ChildRuntimeException e) {
                throw new WrapperException(e);
                // this is essentially a GOTO to the WrapperException catch block
            }
        } catch (WrapperException e) {
            // do some more stuff
        }
    }


}
