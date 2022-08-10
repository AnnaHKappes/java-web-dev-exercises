package exercises.technology.main;

import static org.junit.Assert.assertEquals;

public class Program {
    public static void main(String[] args) {

        Laptop myLaptop = new Laptop(25, 50, true, 100.0);
//        System.out.println(myLaptop.isClunky());
//        System.out.println(myLaptop.getRam());
//        System.out.println(myLaptop.increaseRAM(20));
        System.out.println(myLaptop.getId());

        SmartPhone mySmartPhone = new SmartPhone(10, 20, true, 30);
//        System.out.println(mySmartPhone.takeSelfie());
//        System.out.println(mySmartPhone.increaseRAM(20));
        System.out.println(mySmartPhone.getId());

        Computer myComputer = new Computer(10, 20, true);
//        System.out.println(myComputer.increaseRAM(20));
        System.out.println(myComputer.getId());

    }
}
