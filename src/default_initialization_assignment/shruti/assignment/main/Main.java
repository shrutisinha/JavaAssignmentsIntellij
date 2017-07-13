package default_initialization_assignment.shruti.assignment.main;


import default_initialization_assignment.shruti.assignment.data.Data;
import default_initialization_assignment.shruti.assignment.singleton.SingletonClass;

public class Main {

    private final static String TAG = Main.class.getSimpleName();

    public static void main(String args[]) {

        Data obj1 = new Data();
        obj1.print();
        obj1.printLocal();

        SingletonClass obj2 = SingletonClass.getInstance("shruti");
        obj2.print();
        SingletonClass obj3 = SingletonClass.getInstance("suruti");
        obj2.print();
        obj3.print();
        SingletonClass obj4 = SingletonClass.getInstance(null);
    }
}


