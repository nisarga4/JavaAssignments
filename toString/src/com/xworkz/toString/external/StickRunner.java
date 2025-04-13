package com.xworkz.toString.external;

import com.xworkz.toString.internal.Stick;

public class StickRunner {
    public static void main(String[] args) {
        Stick stick1 = new Stick("Wood", 120, "Brown");
        System.out.println(stick1);

        int hash = stick1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(stick1));

        Stick stick2 = new Stick("Wood", 120, "Brown");
        Stick stick3 = new Stick("Metal", 150, "Silver");

        System.out.println("Checking same location: " + (stick1 == stick2));
        boolean same = stick1.equals(stick2);
        System.out.println("Stick1 is same as Stick2: " + same);

        boolean sameStick3 = stick1.equals(stick3);
        System.out.println("Stick1 is same as Stick3: " + sameStick3);
    }
}
