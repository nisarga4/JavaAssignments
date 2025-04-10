package com.xworkz.toString.external;

import com.xworkz.toString.internal.Football;

public class FootballRunner {
    public static void main(String[] args) {
        Football f1 = new Football("Adidas", 5.0, true);
        Football f2 = new Football("Nivia", 4.5, false);

        System.out.println(f1);
        System.out.println(f2);

        System.out.println("HashCode1: " + f1.hashCode());
        System.out.println("HashCode2: " + f2.hashCode());
        System.out.println(new Football("Puma", 4.8, true).hashCode());
    }
}
