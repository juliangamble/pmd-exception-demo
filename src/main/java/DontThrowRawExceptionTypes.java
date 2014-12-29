/**
 * Created by Julian on 29/12/14.
 */
public class DontThrowRawExceptionTypes {

    public void bar() throws Exception { //NOPMD
        throw new Exception(); //This is the issue
    }
    
}
