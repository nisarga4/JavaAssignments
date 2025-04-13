package com.xworkz.toString.external;

import com.xworkz.toString.internal.Nail;

public class NailRunner {
    public static void main(String[] args) {
        Nail nail1 = new Nail("Steel", 5.0, 2.0);
        System.out.println(nail1);

        int hash = nail1.hashCode();
        System.out.println("Hash Code: " + hash);

        Nail nail2 = new Nail("Steel", 5.0, 2.0);
        Nail nail3 = new Nail("Copper", 4.0, 1.5);

        System.out.println("Checking same location: " + (nail1 == nail2));
        boolean same = nail1.equals(nail2);
        System.out.println("Nail1 is same as Nail2: " + same);

        boolean different = nail1.equals(nail3);
        System.out.println("Nail1 is same as Nail3: " + different);
    }
}
