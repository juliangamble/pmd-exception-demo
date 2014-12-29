/**
 * Created by Julian on 29/12/14.
 */
public class DontCatchGenericException {

    public void downCastPrimitiveType() {
        try {
            int i = 0;
            System.out.println(" i [" + i + "]");
        } catch(NullPointerException e) { //NOPMD - avoid the NPE for this example
            e.printStackTrace();
        } catch(RuntimeException e) {
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
