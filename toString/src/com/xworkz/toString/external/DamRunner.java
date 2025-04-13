package com.xworkz.toString.external;

import com.xworkz.toString.internal.Dam;

public class DamRunner {
    public static void main(String[] args) {
        Dam dam1 = new Dam("Hoover", 5000.5, 1936);
        System.out.println(dam1);

        int hash = dam1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(dam1));

        Dam dam2 = new Dam("Hoover", 5000.5, 1936);
        Dam dam3 = new Dam("Three Gorges", 20000.0, 2003);

        System.out.println("Checking same location: " + (dam1 == dam2));
        boolean same = dam1.equals(dam2);
        System.out.println("Dam1 is same as Dam2: " + same);

        System.out.println("Dam1 is same as Dam3: " + dam1.equals(dam3));
    }
}
