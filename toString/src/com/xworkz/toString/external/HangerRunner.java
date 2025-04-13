package com.xworkz.toString.external;

import com.xworkz.toString.internal.Hanger;

public class HangerRunner {
    public static void main(String[] args) {
        Hanger hanger1 = new Hanger("Wood", "Brown", 40);
        System.out.println(hanger1);

        int hash = hanger1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(hanger1));

        Hanger hanger2 = new Hanger("Wood", "Brown", 40);
        Hanger hanger3 = new Hanger("Plastic", "Black", 30);

        System.out.println("Checking same location: " + (hanger1 == hanger2));
        boolean same = hanger1.equals(hanger2);
        System.out.println("Hanger1 is same as Hanger2: " + same);

        System.out.println("Hanger1 is same as Hanger3: " + hanger1.equals(hanger3));
    }
}
