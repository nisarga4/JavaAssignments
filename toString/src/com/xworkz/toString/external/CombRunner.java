package com.xworkz.toString.external;

import com.xworkz.toString.internal.Comb;

public class CombRunner {
    public static void main(String[] args) {
        Comb comb1 = new Comb("Plastic", 20, "Black");
        System.out.println(comb1);

        int hash = comb1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(comb1));

        Comb comb2 = new Comb("Plastic", 20, "Black");
        Comb comb3 = new Comb("Wood", 18, "Brown");

        System.out.println("Checking same location: " + (comb1 == comb2));
        boolean same = comb1.equals(comb2);
        System.out.println("Comb1 is same as Comb2: " + same);

        System.out.println("Comb1 is same as Comb3: " + comb1.equals(comb3));
    }
}
