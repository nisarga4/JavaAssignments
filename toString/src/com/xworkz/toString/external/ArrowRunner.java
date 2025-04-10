package com.xworkz.toString.external;

import com.xworkz.toString.internal.Arrow;

public class ArrowRunner {
    public static void main(String[] args) {
        Arrow a1 = new Arrow("Wood", 50.5, true);
        Arrow a2 = new Arrow("Carbon", 45.0, false);

        System.out.println(a1);
        System.out.println(a2);

        System.out.println("HashCode1: " + a1.hashCode());
        System.out.println("HashCode2: " + a2.hashCode());
        System.out.println(new Arrow("Bamboo", 47.8, true).hashCode());
    }
}
