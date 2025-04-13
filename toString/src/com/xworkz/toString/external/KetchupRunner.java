package com.xworkz.toString.external;

import com.xworkz.toString.internal.Ketchup;

public class KetchupRunner {
    public static void main(String[] args) {
        Ketchup ketchup1 = new Ketchup("Heinz", 500, "Tomato");
        System.out.println(ketchup1);

        int hash = ketchup1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(ketchup1));

        Ketchup ketchup2 = new Ketchup("Heinz", 500, "Tomato");
        Ketchup ketchup3 = new Ketchup("Del Monte", 250, "Spicy");

        System.out.println("Checking same location: " + (ketchup1 == ketchup2));
        boolean same = ketchup1.equals(ketchup2);
        System.out.println("Ketchup1 is same as Ketchup2: " + same);

        System.out.println("Ketchup1 is same as Ketchup3: " + ketchup1.equals(ketchup3));
    }
}
