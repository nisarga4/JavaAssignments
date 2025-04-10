package com.xworkz.toString.external;

import com.xworkz.toString.internal.Bulb;

public class BulbRunner {
    public static void main(String[] args) {
        Bulb b1 = new Bulb("Philips", 9, true);
        Bulb b2 = new Bulb("Syska", 12, false);

        System.out.println(b1);
        System.out.println(b2);

        System.out.println("HashCode1: " + b1.hashCode());
        System.out.println("HashCode2: " + b2.hashCode());
        System.out.println(new Bulb("Wipro", 7, true).hashCode());
    }
}
