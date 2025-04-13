package com.xworkz.toString.external;

import com.xworkz.toString.internal.WashingPowder;

public class WashingPowderRunner {
    public static void main(String[] args) {
        WashingPowder powder1 = new WashingPowder("Ariel", 1.5, "Lavender");
        System.out.println(powder1);

        int hash = powder1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(powder1));

        WashingPowder powder2 = new WashingPowder("Ariel", 1.5, "Lavender");
        WashingPowder powder3 = new WashingPowder("Surf", 2.0, "Rose");

        System.out.println("Checking same location: " + (powder1 == powder2));
        boolean same = powder1.equals(powder2);
        System.out.println("Powder1 is same as Powder2: " + same);

        System.out.println("Powder1 is same as Powder3: " + powder1.equals(powder3));
    }
}
