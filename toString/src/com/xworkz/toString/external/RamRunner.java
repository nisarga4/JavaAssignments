package com.xworkz.toString.external;

import com.xworkz.toString.internal.Ram;

public class RamRunner {
    public static void main(String[] args) {
        Ram r1 = new Ram("DDR4", 8, 3200);
        Ram r2 = new Ram("DDR5", 16, 4800);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("HashCode1: " + r1.hashCode());
        System.out.println("HashCode2: " + r2.hashCode());
        System.out.println(new Ram("DDR3", 4, 1600).hashCode());
    }
}
