/**
 * Created by Julian on 29/12/14.
 */
public class DontThrowExceptionInFinally {

    public void bar()
    {
        try {
            // Here do some stuff
        }
        catch( ChildRuntimeException e) {
            // Handling the issue
        }
        finally
        {
            // is this really a good idea ?
            throw new ChildRuntimeException();
        }
    }
    
}
