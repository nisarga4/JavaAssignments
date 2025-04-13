package com.xworkz.toString.external;

import com.xworkz.toString.internal.Lion;

public class LionRunner {
    public static void main(String[] args) {
        Lion lion1 = new Lion("Simba", 5, "Savannah");
        System.out.println(lion1);

        int hash = lion1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(lion1));

        Lion lion2 = new Lion("Simba", 5, "Savannah");
        Lion lion3 = new Lion("Leo", 7, "Jungle");

        System.out.println("Checking same location: " + (lion1 == lion2));
        boolean same = lion1.equals(lion2);
        System.out.println("Lion1 is same as Lion2: " + same);

        System.out.println("Lion1 is same as Lion3: " + lion1.equals(lion3));
    }
}
