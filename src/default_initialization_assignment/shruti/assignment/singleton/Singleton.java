package default_initialization_assignment.shruti.assignment.singleton;

public class Singleton {
    //makes sure singleton instance is created only once
    private static final String TAG = Singleton.class.getSimpleName();
    private static Singleton obj;
    private String s;

    private Singleton() {
        //required empty constructor to prevent default initializations
    }


    /**
     * Returns the singleton instance of the object by updating the String variable
     * @param str String that is to be updated
     * @return Singleton object of the Singleton class
     */
    public static Singleton getInstance(String str) {
        if(obj == null){
            obj = new Singleton();
        }
        //members of static class objects can be initialized only using object reference of the class;
        obj.s = str;
        return obj;
    }

    public void print() {
        System.out.println(s);
    }
}

