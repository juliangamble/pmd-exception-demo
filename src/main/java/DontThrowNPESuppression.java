/**
 * Created by Julian on 29/12/14.
 */
public class DontThrowNPESuppression {
    
    @SuppressWarnings("PMD.AvoidThrowingNullPointerException")
    void bar() {
        throw new NullPointerException();
    }
}
