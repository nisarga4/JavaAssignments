package com.xworkz.toString.external;

import com.xworkz.toString.internal.Drumstick;

public class DrumstickRunner {
    public static void main(String[] args) {
        Drumstick d1 = new Drumstick(15.0, true, "Local Farm");
        Drumstick d2 = new Drumstick(12.5, false, "Market");

        System.out.println(d1);
        System.out.println(d2);

        System.out.println("HashCode1: " + d1.hashCode());
        System.out.println("HashCode2: " + d2.hashCode());
        System.out.println(new Drumstick(18.0, true, "Organic").hashCode());
    }
}
