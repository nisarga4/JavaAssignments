package com.xworkz.toString.external;

import com.xworkz.toString.internal.Mug;

public class MugRunner {
    public static void main(String[] args) {
        Mug m1 = new Mug("Red", 300, true);
        Mug m2 = new Mug("Black", 250, false);

        System.out.println(m1);
        System.out.println(m2);

        System.out.println("HashCode1: " + m1.hashCode());
        System.out.println("HashCode2: " + m2.hashCode());
        System.out.println(new Mug("White", 350, true).hashCode());
    }
}
