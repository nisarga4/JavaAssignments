package com.xworkz.toString.external;

import com.xworkz.toString.internal.Baloon;

public class BaloonRunner {
    public static void main(String[] args) {
        Baloon b1 = new Baloon("Red", 30.0, true);
        Baloon b2 = new Baloon("Blue", 25.0, false);

        System.out.println(b1);
        System.out.println(b2);

        System.out.println("HashCode1: " + b1.hashCode());
        System.out.println("HashCode2: " + b2.hashCode());
        System.out.println(new Baloon("Yellow", 20.0, true).hashCode());
    }
}
