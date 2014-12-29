

/**
 * Created by Julian on 29/12/14.
 */
public class DontUseExceptionsForFlowControl {

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

class ChildRuntimeException extends RuntimeException {
    public ChildRuntimeException(Exception e) {super(e);}
}

class WrapperException extends Exception {
    public WrapperException(Exception e) {
        super(e);
    }
    
}
