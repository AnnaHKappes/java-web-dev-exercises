package exercises.technology.tests;

import exercises.technology.main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaptopTest {
    Laptop laptop_test;

    @Before
    public void createMyComputer(){
        laptop_test = new Laptop(10, 20, true, 10.0);
    }

    @Test
    public void constructorSetValuesTest() {

        assertEquals(20, laptop_test.getRam());
        assertEquals(10, laptop_test.getStorage());
        assertEquals(true, laptop_test.isHasKeyboard());
        assertEquals(10.0, laptop_test.getWeight(), 0.001);
    }

    @Test
    public void isClunkyTest(){

        assertEquals(true, laptop_test.isClunky());
    }
}
