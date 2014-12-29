/**
 * Created by Julian on 29/12/14.
 */
public class DontCatchThrowable {
    
    public static void main(String args[]) {
        new DontCatchThrowable().bar();
        System.out.println("Hello World");
        
    }

    public void bar() {
        try {
            // do something
        } catch (Throwable th) {  //Should not catch throwable
            th.printStackTrace();
        }
    }
    
}
