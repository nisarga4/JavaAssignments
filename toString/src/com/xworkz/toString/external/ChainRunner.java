package com.xworkz.toString.external;

import com.xworkz.toString.internal.Chain;

public class ChainRunner {
    public static void main(String[] args) {
        Chain c1 = new Chain("Silver", 45.0, true);
        Chain c2 = new Chain("Steel", 50.0, false);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("HashCode1: " + c1.hashCode());
        System.out.println("HashCode2: " + c2.hashCode());
        System.out.println(new Chain("Gold", 40.0, true).hashCode());
    }
}
