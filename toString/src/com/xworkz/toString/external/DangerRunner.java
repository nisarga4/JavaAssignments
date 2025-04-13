package com.xworkz.toString.external;

import com.xworkz.toString.internal.Danger;

public class DangerRunner {
    public static void main(String[] args) {
        Danger danger1 = new Danger("Earthquake", 9, "Tectonic Plates Movement");
        System.out.println(danger1);

        int hash = danger1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(danger1));

        Danger danger2 = new Danger("Earthquake", 9, "Tectonic Plates Movement");
        Danger danger3 = new Danger("Flood", 7, "Heavy Rainfall");

        System.out.println("Checking same location: " + (danger1 == danger2));
        boolean same = danger1.equals(danger2);
        System.out.println("Danger1 is same as Danger2: " + same);

        System.out.println("Danger1 is same as Danger3: " + danger1.equals(danger3));
    }
}
