package com.xworkz.toString.external;

import com.xworkz.toString.internal.Hanger;

public class HangerRunner {
    public static void main(String[] args) {
        Hanger h1 = new Hanger("Plastic", "Shirt", true);
        Hanger h2 = new Hanger("Wood", "Coat", false);

        System.out.println(h1);
        System.out.println(h2);

        System.out.println("HashCode1: " + h1.hashCode());
        System.out.println("HashCode2: " + h2.hashCode());
        System.out.println(new Hanger("Metal", "Pant", true).hashCode());
    }
}
