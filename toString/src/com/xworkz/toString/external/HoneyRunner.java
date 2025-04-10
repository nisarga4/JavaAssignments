package com.xworkz.toString.external;

import com.xworkz.toString.internal.Honey;

public class HoneyRunner {
    public static void main(String[] args) {
        Honey h1 = new Honey("Forest", 250.0, true);
        Honey h2 = new Honey("Farm", 500.0, false);

        System.out.println(h1);
        System.out.println(h2);

        System.out.println("HashCode1: " + h1.hashCode());
        System.out.println("HashCode2: " + h2.hashCode());
        System.out.println(new Honey("Mountain", 300.0, true).hashCode());
    }
}
