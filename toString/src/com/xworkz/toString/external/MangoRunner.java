package com.xworkz.toString.external;

import com.xworkz.toString.internal.Mango;

public class MangoRunner {
    public static void main(String[] args) {
        Mango m1 = new Mango("Alphonso", 350.0, true);
        Mango m2 = new Mango("Dasheri", 300.0, false);

        System.out.println(m1);
        System.out.println(m2);

        System.out.println("HashCode1: " + m1.hashCode());
        System.out.println("HashCode2: " + m2.hashCode());
        System.out.println(new Mango("Langra", 280.0, true).hashCode());
    }
}
