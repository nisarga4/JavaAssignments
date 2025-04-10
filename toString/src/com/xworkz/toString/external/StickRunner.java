package com.xworkz.toString.external;

import com.xworkz.toString.internal.Stick;

public class StickRunner {
    public static void main(String[] args) {
        Stick s1 = new Stick("Bamboo", 100.0, true);
        Stick s2 = new Stick("Plastic", 60.0, false);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("HashCode1: " + s1.hashCode());
        System.out.println("HashCode2: " + s2.hashCode());
        System.out.println(new Stick("Metal", 80.0, true).hashCode());
    }
}
