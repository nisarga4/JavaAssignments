package com.xworkz.toString.external;

import com.xworkz.toString.internal.Nail;

public class NailRunner {
    public static void main(String[] args) {
        Nail n1 = new Nail("Iron", 3.5, true);
        Nail n2 = new Nail("Steel", 2.0, false);

        System.out.println(n1);
        System.out.println(n2);

        System.out.println("HashCode1: " + n1.hashCode());
        System.out.println("HashCode2: " + n2.hashCode());
        System.out.println(new Nail("Copper", 1.5, true).hashCode());
    }
}
