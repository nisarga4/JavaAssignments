package com.xworkz.toString.external;

import com.xworkz.toString.internal.Water;

public class WaterRunner {
    public static void main(String[] args) {
        Water water1 = new Water("River", 10.5, "Clean");
        System.out.println(water1);

        int hash = water1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(water1));

        Water water2 = new Water("River", 10.5, "Clean");
        Water water3 = new Water("Well", 15.0, "Impure");

        System.out.println("Checking same location: " + (water1 == water2));
        boolean same = water1.equals(water2);
        System.out.println("Water1 is same as Water2: " + same);

        System.out.println("Water1 is same as Water3: " + water1.equals(water3));
    }
}
