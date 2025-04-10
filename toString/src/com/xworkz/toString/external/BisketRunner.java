package com.xworkz.toString.external;

import com.xworkz.toString.internal.Bisket;

public class BisketRunner {
    public static void main(String[] args) {
        Bisket b1 = new Bisket("Chocolate", 10, true);
        Bisket b2 = new Bisket("Salty", 12, false);

        System.out.println(b1);
        System.out.println(b2);

        System.out.println("HashCode1: " + b1.hashCode());
        System.out.println("HashCode2: " + b2.hashCode());
        System.out.println(new Bisket("Butter", 8, true).hashCode());
    }
}
