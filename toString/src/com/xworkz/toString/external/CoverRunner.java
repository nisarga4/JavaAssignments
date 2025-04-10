package com.xworkz.toString.external;

import com.xworkz.toString.internal.Cover;

public class CoverRunner {
    public static void main(String[] args) {
        Cover c1 = new Cover("Plastic", "A4", true);
        Cover c2 = new Cover("Cloth", "A5", false);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("HashCode1: " + c1.hashCode());
        System.out.println("HashCode2: " + c2.hashCode());
        System.out.println(new Cover("Leather", "A3", true).hashCode());
    }
}
