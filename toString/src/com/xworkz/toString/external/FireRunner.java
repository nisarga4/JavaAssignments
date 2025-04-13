package com.xworkz.toString.external;

import com.xworkz.toString.internal.Fire;

public class FireRunner {
    public static void main(String[] args) {
        Fire fire1 = new Fire("Wildfire", 1200, "Lightning");
        System.out.println(fire1);

        int hash = fire1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(fire1));

        Fire fire2 = new Fire("Wildfire", 1200, "Lightning");
        Fire fire3 = new Fire("Campfire", 800, "Wood");

        System.out.println("Checking same location: " + (fire1 == fire2));
        boolean same = fire1.equals(fire2);
        System.out.println("Fire1 is same as Fire2: " + same);

        System.out.println("Fire1 is same as Fire3: " + fire1.equals(fire3));
    }
}
