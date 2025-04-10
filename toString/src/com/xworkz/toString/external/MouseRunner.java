package com.xworkz.toString.external;

import com.xworkz.toString.internal.Mouse;

public class MouseRunner {
    public static void main(String[] args) {
        Mouse m1 = new Mouse("Logitech", true, 1600);
        Mouse m2 = new Mouse("Dell", false, 1000);

        System.out.println(m1);
        System.out.println(m2);

        System.out.println("HashCode1: " + m1.hashCode());
        System.out.println("HashCode2: " + m2.hashCode());
        System.out.println(new Mouse("HP", true, 2400).hashCode());
    }
}
