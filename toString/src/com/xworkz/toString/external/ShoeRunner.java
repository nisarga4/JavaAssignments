package com.xworkz.toString.external;

import com.xworkz.toString.internal.Shoe;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoe shoe1 = new Shoe("Nike", "10", "Black");
        System.out.println(shoe1);

        int hash = shoe1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(shoe1));

        Shoe shoe2 = new Shoe("Nike", "10", "Black");
        Shoe shoe3 = new Shoe("Adidas", "9", "White");

        System.out.println("Checking same location: " + (shoe1 == shoe2));
        boolean same = shoe1.equals(shoe2);
        System.out.println("Shoe1 is same as Shoe2: " + same);

        boolean sameShoe3 = shoe1.equals(shoe3);
        System.out.println("Shoe1 is same as Shoe3: " + sameShoe3);
    }
}
