package com.xworkz.toString.external;

import com.xworkz.toString.internal.Battery;

public class BatteryRunner {
    public static void main(String[] args) {
        Battery b1 = new Battery("Duracell", 2500, true);
        Battery b2 = new Battery("Eveready", 1800, false);

        System.out.println(b1);
        System.out.println(b2);

        System.out.println("HashCode1: " + b1.hashCode());
        System.out.println("HashCode2: " + b2.hashCode());
        System.out.println(new Battery("Panasonic", 2000, true).hashCode());
    }
}
