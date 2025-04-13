package com.xworkz.toString.external;

import com.xworkz.toString.internal.Salman;

public class SalmanRunner {
    public static void main(String[] args) {
        Salman salman1 = new Salman("Salman Khan", 55, "Actor");
        System.out.println(salman1);

        int hash = salman1.hashCode();
        System.out.println("Hash Code: " + hash);

        Salman salman2 = new Salman("Salman Khan", 55, "Actor");
        Salman salman3 = new Salman("Aamir Khan", 55, "Actor");

        System.out.println("Checking same location: " + (salman1 == salman2));
        boolean same = salman1.equals(salman2);
        System.out.println("Salman1 is same as Salman2: " + same);

        boolean different = salman1.equals(salman3);
        System.out.println("Salman1 is same as Salman3: " + different);
    }
}
