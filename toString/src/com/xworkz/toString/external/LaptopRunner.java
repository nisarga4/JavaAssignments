package com.xworkz.toString.external;

import com.xworkz.toString.internal.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", 16, "i7");
        Laptop l2 = new Laptop("HP", 8, "Ryzen 5");

        System.out.println(l1);
        System.out.println(l2);

        System.out.println("HashCode1: " + l1.hashCode());
        System.out.println("HashCode2: " + l2.hashCode());
        System.out.println(new Laptop("MacBook", 16, "M1").hashCode());
    }
}
