package com.xworkz.toString.external;

import com.xworkz.toString.internal.Salman;

public class SalmanRunner {
    public static void main(String[] args) {
        Salman s1 = new Salman("Actor", 58, true);
        Salman s2 = new Salman("Producer", 60, true);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("HashCode1: " + s1.hashCode());
        System.out.println("HashCode2: " + s2.hashCode());
        System.out.println(new Salman("Host", 55, true).hashCode());
    }
}
