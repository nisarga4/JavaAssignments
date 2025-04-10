package com.xworkz.toString.external;

import com.xworkz.toString.internal.WashingPowder;

public class WashingPowderRunner {
    public static void main(String[] args) {
        WashingPowder wp1 = new WashingPowder("Ariel", 1.5, false);
        WashingPowder wp2 = new WashingPowder("Surf Excel", 2.0, true);

        System.out.println(wp1);
        System.out.println(wp2);

        System.out.println("HashCode1: " + wp1.hashCode());
        System.out.println("HashCode2: " + wp2.hashCode());
        System.out.println(new WashingPowder("Tide", 1.0, false).hashCode());
    }
}
