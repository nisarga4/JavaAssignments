package com.xworkz.toString.external;

import com.xworkz.toString.internal.Panipuri;

public class PanipuriRunner {
    public static void main(String[] args) {
        Panipuri p1 = new Panipuri("Mint", true, 6);
        Panipuri p2 = new Panipuri("Sweet", false, 8);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("HashCode1: " + p1.hashCode());
        System.out.println("HashCode2: " + p2.hashCode());
        System.out.println(new Panipuri("Tamarind", true, 10).hashCode());
    }
}
