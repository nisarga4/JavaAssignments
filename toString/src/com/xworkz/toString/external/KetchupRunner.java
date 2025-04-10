package com.xworkz.toString.external;

import com.xworkz.toString.internal.Ketchup;

public class KetchupRunner {
    public static void main(String[] args) {
        Ketchup k1 = new Ketchup("Heinz", 500, true);
        Ketchup k2 = new Ketchup("Maggi", 200, false);

        System.out.println(k1);
        System.out.println(k2);

        System.out.println("HashCode1: " + k1.hashCode());
        System.out.println("HashCode2: " + k2.hashCode());
        System.out.println(new Ketchup("Del Monte", 300, true).hashCode());
    }
}
