package com.xworkz.toString.external;

import com.xworkz.toString.internal.Pocket;

public class PocketRunner {
    public static void main(String[] args) {
        Pocket p1 = new Pocket("Side", true, "Denim");
        Pocket p2 = new Pocket("Front", false, "Cotton");

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("HashCode1: " + p1.hashCode());
        System.out.println("HashCode2: " + p2.hashCode());
        System.out.println(new Pocket("Back", true, "Leather").hashCode());
    }
}
