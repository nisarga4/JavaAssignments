package com.xworkz.toString.external;

import com.xworkz.toString.internal.Egg;

public class EggRunner {
    public static void main(String[] args) {
        Egg egg1 = new Egg("Organic", "Large", "Brown");
        System.out.println(egg1);

        int hash = egg1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(egg1));

        Egg egg2 = new Egg("Organic", "Large", "Brown");
        Egg egg3 = new Egg("Free-range", "Medium", "White");

        System.out.println("Checking same location: " + (egg1 == egg2));
        boolean same = egg1.equals(egg2);
        System.out.println("Egg1 is same as Egg2: " + same);

        System.out.println("Egg1 is same as Egg3: " + egg1.equals(egg3));
    }
}
