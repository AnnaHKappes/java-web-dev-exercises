package exercises.technology.tests;

import exercises.technology.main.SmartPhone;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SmartPhoneTest {

    SmartPhone smartPhone_test;

    @Before
    public void createMyComputer(){
        smartPhone_test = new SmartPhone(10, 20, true, 10);
    }

    @Test
    public void constructorSetValuesTest() {

        assertEquals(20, smartPhone_test.getRam());
        assertEquals(10, smartPhone_test.getStorage());
        assertEquals(true, smartPhone_test.isHasKeyboard());
        assertEquals(10, smartPhone_test.getNumberOfSelfies());
    }

    @Test
    public void takeSelfieTest(){

        assertEquals(11, smartPhone_test.takeSelfie());
    }
}
