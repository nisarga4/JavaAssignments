package com.xworkz.toString.external;

import com.xworkz.toString.internal.Flower;

public class FlowerRunner {
    public static void main(String[] args) {
        Flower flower1 = new Flower("Rose", "Red", 50.0);
        System.out.println(flower1);

        int hash = flower1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(flower1));

        Flower flower2 = new Flower("Rose", "Red", 50.0);
        Flower flower3 = new Flower("Tulip", "Yellow", 30.0);

        System.out.println("Checking same location: " + (flower1 == flower2));
        boolean same = flower1.equals(flower2);
        System.out.println("Flower1 is same as Flower2: " + same);

        System.out.println("Flower1 is same as Flower3: " + flower1.equals(flower3));
    }
}
