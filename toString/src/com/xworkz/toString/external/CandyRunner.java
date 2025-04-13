package com.xworkz.toString.external;

import com.xworkz.toString.internal.Candy;

public class CandyRunner {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Strawberry", "Red", 50.0);
        System.out.println(candy1);

        int hash = candy1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(candy1));

        Candy candy2 = new Candy("Strawberry", "Red", 50.0);
        Candy candy3 = new Candy("Lemon", "Yellow", 40.0);

        System.out.println("Checking same location: " + (candy1 == candy2));
        boolean same = candy1.equals(candy2);
        System.out.println("Candy1 is same as Candy2: " + same);

        System.out.println("Candy1 is same as Candy3: " + candy1.equals(candy3));
    }
}
