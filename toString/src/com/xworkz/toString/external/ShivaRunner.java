package com.xworkz.toString.external;

import com.xworkz.toString.internal.Shiva;

public class ShivaRunner {
    public static void main(String[] args) {
        Shiva shiva1 = new Shiva("Shiva", "Fire", "Om Namah Shivaya");
        System.out.println(shiva1);

        int hash = shiva1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(shiva1));

        Shiva shiva2 = new Shiva("Shiva", "Fire", "Om Namah Shivaya");
        Shiva shiva3 = new Shiva("Shiva", "Water", "Om Namah Shivaya");

        System.out.println("Checking same location: " + (shiva1 == shiva2));
        boolean same = shiva1.equals(shiva2);
        System.out.println("Shiva1 is same as Shiva2: " + same);

        boolean sameShiva3 = shiva1.equals(shiva3);
        System.out.println("Shiva1 is same as Shiva3: " + sameShiva3);
    }
}
