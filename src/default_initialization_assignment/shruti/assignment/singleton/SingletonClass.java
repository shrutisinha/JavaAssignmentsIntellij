package default_initialization_assignment.shruti.assignment.singleton;

public class SingletonClass {
    //makes sure singleton instance is created only once
    //**STATIC VARIABLES***********************************************************************************************/
    private static final String TAG = SingletonClass.class.getSimpleName();

    //**MEMBER VARIABLES***********************************************************************************************/
    private static SingletonClass sSinglObj;
    private String mSampleString;

    //region Intializations

    private SingletonClass() {
        //required empty constructor to prevent default initializations
    }

    /**
     * Returns the singleton instance of the object by updating the String variable
     * @param str String that is to be updated
     * @return SingletonClass object of the SingletonClass class
     */
    public static SingletonClass getInstance(String str) {
        if(sSinglObj == null){
            System.out.println(TAG+": SingletonClass initialized");
            sSinglObj = new SingletonClass();
        }
        //members of static class objects can be initialized only using object reference of the class;
        sSinglObj.mSampleString = str;
        return sSinglObj;
    }

    //endregion

    //region Class Interaction Methods

    public void print() {
        System.out.println(mSampleString);
    }

    //endregion

    //region Public Getters

    public String getCurrentString(){
        return mSampleString;
    }

    public int getStringSize(){
        if(mSampleString == null){
            return 0;
        }else {
            return mSampleString.length();
        }
    }

    //endregion
}

