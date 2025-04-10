package com.xworkz.toString.external;

import com.xworkz.toString.internal.Towel;

public class TowelRunner {
    public static void main(String[] args) {
        Towel t1 = new Towel("Blue", "Cotton", 120);
        Towel t2 = new Towel("White", "Microfiber", 150);

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("HashCode1: " + t1.hashCode());
        System.out.println("HashCode2: " + t2.hashCode());
        System.out.println(new Towel("Pink", "Linen", 130).hashCode());
    }
}
