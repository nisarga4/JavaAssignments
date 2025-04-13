package com.xworkz.toString.external;

import com.xworkz.toString.internal.Door;

public class DoorRunner {
    public static void main(String[] args) {
        Door door1 = new Door("Wood", 2.5, "Brown");
        System.out.println(door1);

        int hash = door1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(door1));

        Door door2 = new Door("Wood", 2.5, "Brown");
        Door door3 = new Door("Steel", 3.0, "Silver");

        System.out.println("Checking same location: " + (door1 == door2));
        boolean same = door1.equals(door2);
        System.out.println("Door1 is same as Door2: " + same);

        System.out.println("Door1 is same as Door3: " + door1.equals(door3));
    }
}
