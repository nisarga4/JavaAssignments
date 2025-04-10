package com.xworkz.toString.external;

import com.xworkz.toString.internal.Temple;

public class TempleRunner {
    public static void main(String[] args) {
        Temple t1 = new Temple("Virupaksha", "Hampi", true);
        Temple t2 = new Temple("Meenakshi", "Madurai", true);

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("HashCode1: " + t1.hashCode());
        System.out.println("HashCode2: " + t2.hashCode());
        System.out.println(new Temple("Iskcon", "Bangalore", false).hashCode());
    }
}
