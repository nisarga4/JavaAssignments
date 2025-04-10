package com.xworkz.toString.external;

import com.xworkz.toString.internal.Flower;

public class FlowerRunner {
    public static void main(String[] args) {
        Flower f1 = new Flower("Rose", "Red", true);
        Flower f2 = new Flower("Lily", "White", false);

        System.out.println(f1);
        System.out.println(f2);

        System.out.println("HashCode1: " + f1.hashCode());
        System.out.println("HashCode2: " + f2.hashCode());
        System.out.println(new Flower("Tulip", "Yellow", true).hashCode());
    }
}
