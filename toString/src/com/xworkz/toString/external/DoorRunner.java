package com.xworkz.toString.external;

import com.xworkz.toString.internal.Door;

public class DoorRunner {
    public static void main(String[] args) {
        Door d1 = new Door("Wood", 7.5, false);
        Door d2 = new Door("Glass", 8.0, true);

        System.out.println(d1);
        System.out.println(d2);

        System.out.println("HashCode1: " + d1.hashCode());
        System.out.println("HashCode2: " + d2.hashCode());
        System.out.println(new Door("Steel", 6.5, false).hashCode());
    }
}
