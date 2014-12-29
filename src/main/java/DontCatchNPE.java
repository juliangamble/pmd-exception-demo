/**
 * Created by Julian on 29/12/14.
 */
public class DontCatchNPE {

    void bar() {
        try {
            // do something
        }  catch (NullPointerException npe) {
        }
    }
    
}
