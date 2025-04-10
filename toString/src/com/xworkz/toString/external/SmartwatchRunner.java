package com.xworkz.toString.external;

import com.xworkz.toString.internal.Smartwatch;

public class SmartwatchRunner {
    public static void main(String[] args) {
        Smartwatch sw1 = new Smartwatch("Apple", true, 29999.99);
        Smartwatch sw2 = new Smartwatch("Samsung", false, 19999.99);

        System.out.println(sw1);
        System.out.println(sw2);

        System.out.println("HashCode1: " + sw1.hashCode());
        System.out.println("HashCode2: " + sw2.hashCode());
        System.out.println(new Smartwatch("Boat", true, 4999.0).hashCode());
    }
}
