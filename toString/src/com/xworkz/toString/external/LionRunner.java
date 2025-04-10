package com.xworkz.toString.external;

import com.xworkz.toString.internal.Lion;

public class LionRunner {
    public static void main(String[] args) {
        Lion l1 = new Lion("Asiatic", 8, "India");
        Lion l2 = new Lion("African", 10, "Kenya");

        System.out.println(l1);
        System.out.println(l2);

        System.out.println("HashCode1: " + l1.hashCode());
        System.out.println("HashCode2: " + l2.hashCode());
        System.out.println(new Lion("White", 6, "South Africa").hashCode());
    }
}
