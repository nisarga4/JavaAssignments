package com.xworkz.toString.external;

import com.xworkz.toString.internal.Makeup;

public class MakeupRunner {
    public static void main(String[] args) {
        Makeup m1 = new Makeup("Lipstick", "Maybelline", 499.0);
        Makeup m2 = new Makeup("Foundation", "Lakme", 699.0);

        System.out.println(m1);
        System.out.println(m2);

        System.out.println("HashCode1: " + m1.hashCode());
        System.out.println("HashCode2: " + m2.hashCode());
        System.out.println(new Makeup("Mascara", "L'Oreal", 599.0).hashCode());
    }
}
