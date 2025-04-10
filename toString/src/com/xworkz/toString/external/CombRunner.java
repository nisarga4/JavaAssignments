package com.xworkz.toString.external;

import com.xworkz.toString.internal.Comb;

public class CombRunner {
    public static void main(String[] args) {
        Comb c1 = new Comb("Plastic", true, "Black");
        Comb c2 = new Comb("Wood", false, "Brown");

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("HashCode1: " + c1.hashCode());
        System.out.println("HashCode2: " + c2.hashCode());
        System.out.println(new Comb("Metal", true, "Silver").hashCode());
    }
}
