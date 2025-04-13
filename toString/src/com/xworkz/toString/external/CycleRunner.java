package com.xworkz.toString.external;

import com.xworkz.toString.internal.Cycle;

public class CycleRunner {
    public static void main(String[] args) {
        Cycle cycle1 = new Cycle("Trek", "Mountain", 18);
        System.out.println(cycle1);

        int hash = cycle1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(cycle1));

        Cycle cycle2 = new Cycle("Trek", "Mountain", 18);
        Cycle cycle3 = new Cycle("Giant", "Road", 21);

        System.out.println("Checking same location: " + (cycle1 == cycle2));
        boolean same = cycle1.equals(cycle2);
        System.out.println("Cycle1 is same as Cycle2: " + same);

        System.out.println("Cycle1 is same as Cycle3: " + cycle1.equals(cycle3));
    }
}
