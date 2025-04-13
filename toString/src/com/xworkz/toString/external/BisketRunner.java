package com.xworkz.toString.external;

import com.xworkz.toString.internal.Bisket;

public class BisketRunner {
    public static void main(String[] args) {
        Bisket bisket1 = new Bisket("Chocolate", 10, 250.0);
        System.out.println(bisket1);

        int hash = bisket1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(bisket1));

        Bisket bisket2 = new Bisket("Chocolate", 10, 250.0);
        Bisket bisket3 = new Bisket("Vanilla", 15, 300.0);

        System.out.println("Checking same location: " + (bisket2 == bisket3));
        boolean same = bisket2.equals(bisket3);
        System.out.println("Bisket2 is same as Bisket3: " + same);
    }
}
