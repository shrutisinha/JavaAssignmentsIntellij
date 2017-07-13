package default_initialization_assignment.shruti.assignment.test;

import default_initialization_assignment.shruti.assignment.singleton.SingletonClass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vin on 13/7/17.
 */
public class SingletonTest {

    private SingletonClass mTestObject;

    @Before
    public void initializeObject(){
        mTestObject = SingletonClass.getInstance("Hello");
    }

    @Test
    public void getCurrentString() throws Exception {
        assertEquals("Expecting Hello", "Hello", mTestObject.getCurrentString());
        mTestObject = SingletonClass.getInstance(null);
        assertNull(mTestObject.getCurrentString());
    }

    @Test
    public void getStringSize() throws Exception {
        assertEquals("Expecting 5", 5, mTestObject.getStringSize());
        mTestObject = SingletonClass.getInstance(null);
        assertEquals("Expecting 0", 0, mTestObject.getStringSize());
    }


}