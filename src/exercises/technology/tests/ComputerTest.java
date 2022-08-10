package exercises.technology.tests;

import exercises.technology.main.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {

    Computer computer_test;

    @Before
    public void createMyComputer(){
        computer_test = new Computer(10, 20, true);
    }

    @Test
    public void constructorSetValuesTest() {

        assertEquals(20, computer_test.getRam());
        assertEquals(10, computer_test.getStorage());
        assertEquals(true, computer_test.isHasKeyboard());
    }

    @Test
    public void increaseRAMTest(){

        assertEquals(40, computer_test.increaseRAM(20));
    }
}
