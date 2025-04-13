package com.xworkz.toString.external;

import com.xworkz.toString.internal.Honey;

public class HoneyRunner {
    public static void main(String[] args) {
        Honey honey1 = new Honey("Manuka", 0.5, "New Zealand");
        System.out.println(honey1);

        int hash = honey1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(honey1));

        Honey honey2 = new Honey("Manuka", 0.5, "New Zealand");
        Honey honey3 = new Honey("Acacia", 0.75, "Australia");

        System.out.println("Checking same location: " + (honey1 == honey2));
        boolean same = honey1.equals(honey2);
        System.out.println("Honey1 is same as Honey2: " + same);

        System.out.println("Honey1 is same as Honey3: " + honey1.equals(honey3));
    }
}
