package com.xworkz.toString.external;

import com.xworkz.toString.internal.Bus;

public class BusRunner {
    public static void main(String[] args) {
        Bus bus1 = new Bus("Route A", 40, "City Bus");
        System.out.println(bus1);

        int hash = bus1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(bus1));

        Bus bus2 = new Bus("Route A", 40, "City Bus");
        Bus bus3 = new Bus("Route B", 50, "Tourist Bus");

        System.out.println("Checking same location: " + (bus2 == bus3));
        boolean same = bus2.equals(bus3);
        System.out.println("Bus2 is same as Bus3: " + same);
    }
}
