/**
 * Created by Julian on 29/12/14.
 */
public class DontCatchThrowableSuppression {
    
    public static void main(String args[]) {
        System.out.println("Hello World");
        
    }

    @SuppressWarnings("PMD.AvoidCatchingThrowable")
    public void bar() {
        try {
            // do something
        } catch (Throwable th) {  //Should not catch throwable
            th.printStackTrace();
        }
    }
    
}
