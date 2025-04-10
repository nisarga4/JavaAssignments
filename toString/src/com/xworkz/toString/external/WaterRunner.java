package com.xworkz.toString.external;

import com.xworkz.toString.internal.Water;

public class WaterRunner {
    public static void main(String[] args) {
        Water w1 = new Water("River", 7.5, true);
        Water w2 = new Water("Sea", 8.2, false);

        System.out.println(w1);
        System.out.println(w2);

        System.out.println("HashCode1: " + w1.hashCode());
        System.out.println("HashCode2: " + w2.hashCode());
        System.out.println(new Water("Well", 6.8, true).hashCode());
    }
}
