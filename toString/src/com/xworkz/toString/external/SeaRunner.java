package com.xworkz.toString.external;

import com.xworkz.toString.internal.Sea;

public class SeaRunner {
    public static void main(String[] args) {
        Sea sea1 = new Sea("Arabian Sea", 1500.0, true);
        Sea sea2 = new Sea("Baltic Sea", 450.0, true);

        System.out.println(sea1);
        System.out.println(sea2);

        System.out.println("HashCode1: " + sea1.hashCode());
        System.out.println("HashCode2: " + sea2.hashCode());
        System.out.println(new Sea("Dead Sea", 304.8, verySalty).hashCode());
    }
}
