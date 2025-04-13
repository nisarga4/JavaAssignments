package com.xworkz.toString.external;

import com.xworkz.toString.internal.Towel;

public class TowelRunner {
    public static void main(String[] args) {
        Towel towel1 = new Towel("Blue", 1.5, "Cotton");
        System.out.println(towel1);

        int hash = towel1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(towel1));

        Towel towel2 = new Towel("Blue", 1.5, "Cotton");
        Towel towel3 = new Towel("Red", 1.2, "Microfiber");

        System.out.println("Checking same location: " + (towel1 == towel2));
        boolean same = towel1.equals(towel2);
        System.out.println("Towel1 is same as Towel2: " + same);

        System.out.println("Towel1 is same as Towel3: " + towel1.equals(towel3));
    }
}
