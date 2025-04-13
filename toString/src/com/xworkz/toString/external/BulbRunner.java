package com.xworkz.toString.external;

import com.xworkz.toString.internal.Bulb;

public class BulbRunner {
    public static void main(String[] args) {
        Bulb bulb1 = new Bulb("Philips", "LED", 20.99);
        System.out.println(bulb1);

        int hash = bulb1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(bulb1));

        Bulb bulb2 = new Bulb("Philips", "LED", 20.99);
        Bulb bulb3 = new Bulb("Osram", "Incandescent", 15.49);

        System.out.println("Checking same location: " + (bulb2 == bulb3));
        boolean same = bulb2.equals(bulb3);
        System.out.println("Bulb2 is same as Bulb3: " + same);
    }
}
