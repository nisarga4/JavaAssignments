package com.xworkz.toString.external;

import com.xworkz.toString.internal.Engine;

public class EngineRunner {
    public static void main(String[] args) {
        Engine e1 = new Engine("Diesel", 120, false);
        Engine e2 = new Engine("Electric", 150, true);

        System.out.println(e1);
        System.out.println(e2);

        System.out.println("HashCode1: " + e1.hashCode());
        System.out.println("HashCode2: " + e2.hashCode());
        System.out.println(new Engine("Petrol", 100, false).hashCode());
    }
}
