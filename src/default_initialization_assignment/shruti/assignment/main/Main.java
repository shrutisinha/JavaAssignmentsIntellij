package default_initialization_assignment.shruti.assignment.main;


import default_initialization_assignment.shruti.assignment.data.Data;
import default_initialization_assignment.shruti.assignment.singleton.Singleton;

public class Main {

    private final static String TAG = Main.class.getSimpleName();

    public static void main(String args[]) {

        Data obj1 = new Data();
        obj1.print();
        obj1.printLocal();

        Singleton obj2 = Singleton.getInstance("shruti");
        obj2.print();
        Singleton obj3 = Singleton.getInstance("suruti");
        obj2.print();
        obj3.print();
        Singleton obj4 = Singleton.getInstance(null);
    }
}


