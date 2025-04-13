package com.xworkz.toString.external;

import com.xworkz.toString.internal.Baby;

public class BabyRunner {
    public static void main(String[] args) {
        Baby baby1 = new Baby("Ava", 10, "Teddy Bear");
        System.out.println(baby1);

        int hash = baby1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(baby1));

        Baby baby2 = new Baby("Ava", 10, "Teddy Bear");
        Baby baby3 = new Baby("Noah", 8, "Rattle");

        System.out.println("Checking same location: " + (baby2 == baby3));
        boolean same = baby2.equals(baby3);
        System.out.println("Baby2 is same as Baby3: " + same);
    }
}
