package com.xworkz.toString.external;

import com.xworkz.toString.internal.Long;

public class LongRunner {
    public static void main(String[] args) {
        Long l1 = new Long("Measuring tape", 150.0, true);
        Long l2 = new Long("Stick", 100.0, false);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println("HashCode1: " + l1.hashCode());
        System.out.println("HashCode2: " + l2.hashCode());
        System.out.println(new Long("Rope", 120.0, true).hashCode());
    }
}
