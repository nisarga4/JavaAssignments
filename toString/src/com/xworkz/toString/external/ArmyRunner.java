package com.xworkz.toString.external;

import com.xworkz.toString.internal.Army;

public class ArmyRunner {
    public static void main(String[] args) {
        Army army1 = new Army("India", 1200000, "Infantry");
        System.out.println(army1);

        int hash = army1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(army1));

        Army army2 = new Army("India", 1200000, "Infantry");
        Army army3 = new Army("India", 500000, "Artillery");

        System.out.println("Checking same location: " + (army2 == army3));
        boolean same = army2.equals(army3);
        System.out.println("Army2 is same as Army3: " + same);
    }
}
