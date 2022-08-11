package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        System.out.println("Before:");
        for(Flavor flavor : flavors){
//            System.out.println(flavor.getName());
            System.out.println(flavor.getAllergens());
        }

        System.out.println("\nAfter:");
        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);
        for(Flavor flavor : flavors){
//            System.out.println(flavor.getName());
            System.out.println(flavor.getAllergens());
        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        System.out.println("\nBefore:");
        for(Cone cone : cones){
            System.out.println(cone.getCost());
        }

        System.out.println("\nAfter:");
        cones.sort((new ConeComparator()));
        for(Cone cone: cones ){
            System.out.println(cone.getCost());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        System.out.println("\nBefore:");
        for(Topping topping : toppings){
            System.out.println(topping.getTastiness());
        }

        System.out.println("\nAfter:");
        toppings.sort(new ToppingComparator());
        for(Topping topping : toppings){
            System.out.println(topping.getTastiness());
        }
    }
}
