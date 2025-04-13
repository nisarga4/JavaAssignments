package com.xworkz.toString.external;

import com.xworkz.toString.internal.Baloon;

public class BaloonRunner {
    public static void main(String[] args) {
        Baloon baloon1 = new Baloon("Red", 12, "Heart");
        System.out.println(baloon1);

        int hash = baloon1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(baloon1));

        Baloon baloon2 = new Baloon("Red", 12, "Heart");
        Baloon baloon3 = new Baloon("Blue", 10, "Round");

        System.out.println("Checking same location: " + (baloon2 == baloon3));
        boolean same = baloon2.equals(baloon3);
        System.out.println("Baloon2 is same as Baloon3: " + same);
    }
}
