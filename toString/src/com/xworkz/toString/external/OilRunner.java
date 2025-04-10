package com.xworkz.toString.external;

import com.xworkz.toString.internal.Oil;

public class OilRunner {
    public static void main(String[] args) {
        Oil o1 = new Oil("Coconut", 500.0, true);
        Oil o2 = new Oil("Motor", 1000.0, false);

        System.out.println(o1);
        System.out.println(o2);

        System.out.println("HashCode1: " + o1.hashCode());
        System.out.println("HashCode2: " + o2.hashCode());
        System.out.println(new Oil("Olive", 750.0, true).hashCode());
    }
}
