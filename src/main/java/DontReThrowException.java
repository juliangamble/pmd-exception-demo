/**
 * Created by Julian on 29/12/14.
 */
public class DontReThrowException {

    void bar() {
        try {
            // do something
        }  catch (SomeException se) {
            throw se;
        }
    }
}

class SomeException extends RuntimeException {}

