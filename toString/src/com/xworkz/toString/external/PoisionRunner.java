package com.xworkz.toString.external;

import com.xworkz.toString.internal.Poision;

public class PoisionRunner {
    public static void main(String[] args) {
        Poision p1 = new Poision("Cyanide", 10.0, true);
        Poision p2 = new Poision("Arsenic", 5.0, true);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("HashCode1: " + p1.hashCode());
        System.out.println("HashCode2: " + p2.hashCode());
        System.out.println(new Poision("Ricin", 2.0, true).hashCode());
    }
}
