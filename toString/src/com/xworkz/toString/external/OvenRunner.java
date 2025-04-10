package com.xworkz.toString.external;

import com.xworkz.toString.internal.Oven;

public class OvenRunner {
    public static void main(String[] args) {
        Oven o1 = new Oven("Microwave", "LG", 30);
        Oven o2 = new Oven("Convection", "Samsung", 25);

        System.out.println(o1);
        System.out.println(o2);

        System.out.println("HashCode1: " + o1.hashCode());
        System.out.println("HashCode2: " + o2.hashCode());
        System.out.println(new Oven("Grill", "IFB", 20).hashCode());
    }
}
