package com.xworkz.toString.external;

import com.xworkz.toString.internal.Chicken;

public class ChickenRunner {
    public static void main(String[] args) {
        Chicken chicken1 = new Chicken("Broiler", 2.5, "White");
        System.out.println(chicken1);

        int hash = chicken1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(chicken1));

        Chicken chicken2 = new Chicken("Broiler", 2.5, "White");
        Chicken chicken3 = new Chicken("Desi", 1.5, "Brown");

        System.out.println("Checking same location: " + (chicken1 == chicken2));
        boolean same = chicken1.equals(chicken2);
        System.out.println("Chicken1 is same as Chicken2: " + same);

        System.out.println("Chicken1 is same as Chicken3: " + chicken1.equals(chicken3));
    }
}
