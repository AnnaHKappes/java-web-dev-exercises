package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor flavor1, Flavor flavor2) {
//        return flavor1.getName().compareTo(flavor2.getName());

//        Sort Allergens from high to low
//        Negative integer if flavor1 > flavor2
//        Positive integer if flavor1 < flavor2
//        Zero if both are equal
        if(flavor1.getAllergens().size() < flavor2.getAllergens().size()){
            return +1;
        } else if (flavor1.getAllergens().size() > flavor2.getAllergens().size()){
            return -1;
        } else {
            return  0;
        }
    }
}
