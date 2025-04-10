package com.xworkz.toString.external;

import com.xworkz.toString.internal.Elephant;

public class ElephantRunner {
    public static void main(String[] args) {
        Elephant e1 = new Elephant("Appu", 2.9, true);
        Elephant e2 = new Elephant("Ramu", 3.2, false);

        System.out.println(e1);
        System.out.println(e2);

        System.out.println("HashCode1: " + e1.hashCode());
        System.out.println("HashCode2: " + e2.hashCode());
        System.out.println(new Elephant("Lakshmi", 2.5, true).hashCode());
    }
}
