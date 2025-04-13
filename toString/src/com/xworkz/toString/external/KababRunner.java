package com.xworkz.toString.external;

import com.xworkz.toString.internal.Kabab;

public class KababRunner {
    public static void main(String[] args) {
        Kabab kabab1 = new Kabab("Chicken", 5, "Spicy");
        System.out.println(kabab1);

        int hash = kabab1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(kabab1));

        Kabab kabab2 = new Kabab("Chicken", 5, "Spicy");
        Kabab kabab3 = new Kabab("Mutton", 3, "Mild");

        System.out.println("Checking same location: " + (kabab1 == kabab2));
        boolean same = kabab1.equals(kabab2);
        System.out.println("Kabab1 is same as Kabab2: " + same);

        System.out.println("Kabab1 is same as Kabab3: " + kabab1.equals(kabab3));
    }
}
