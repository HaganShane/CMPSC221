package CMPSC221;

/**
 * This is a singleton design pattern example
 */
public final class Singleton {
    private static Singleton instance = new Singleton(); // declaration
//    private static int age = 18; // definition

    /**
     * A constructor for the class
     */
    private Singleton() {
    } /* End Singleton */

    /**
     * Access the singleton instance of the class
     * @return The Singleton Instance
     */
    public static Singleton getInstance(){
        if (null == instance){
            instance = new Singleton();
        } /* end if */


        return instance;
    }/* end getInstance */

    public static void main(String[] args) {
        if (Singleton.getInstance() == Singleton.getInstance()){
    }

} /* End Singleton */
