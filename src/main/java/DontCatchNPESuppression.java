/**
 * Created by Julian on 29/12/14.
 */
public class DontCatchNPESuppression {

    //@SuppressWarnings("PMD.AvoidCatchingNPE ")
    //AvoidCatchingGenericException
    void bar() {
        try {
            // do something
        }  catch (NullPointerException npe) { //NOPMD 
        }
    }
    
}
