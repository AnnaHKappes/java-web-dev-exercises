package exercises.inheritance.technologyTest;

import exercises.inheritance.technology.Laptop;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class threeClassesTest {
//    Laptop Class
    @Test
    public void inheritsSuperInFirstConstructor(){
        Laptop theLaptop = new Laptop(50, 60, true, 6.0);
        assertEquals(50, theLaptop.getStorage(), .001);
    }

}
