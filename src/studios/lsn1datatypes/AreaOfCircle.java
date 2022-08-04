package studios.lsn1datatypes;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = input.nextDouble();
        input.close();
        double area = Circle.getArea(radius);
        System.out.println(String.format("The area of a circle of radius %s is: %s", radius, area));
    }
}
