package default_initialization_assignment.shruti.assignment.data;

public class Data {

    private int mDefaultInt;
    private char mDefaultChar;

    /**
     * Prints the member variables of the class
     */
    public void print() {
        System.out.println(String.valueOf(mDefaultInt));
        System.out.println(String.valueOf(mDefaultChar));
    }

    /**
     * Prints the local variables of the method
     */
    public void printLocal() {
        int localInt;
        char localChar;
//        System.out.println(String.valueOf(localInt));
//        System.out.println(String.valueOf(localChar));
//      since localInt and localChar are local variables,
//      so they are not initialized by default.
//      We need to initialize them before using.
//      Since its not possible to print the values without initializing as asked by the question,
//      we must either initialize them or comment out the print statements to prevent error
    }
}
