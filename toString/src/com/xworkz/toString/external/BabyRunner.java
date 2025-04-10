package com.xworkz.toString.external;

import com.xworkz.toString.internal.Baby;

public class BabyRunner {
    public static void main(String[] args) {
        Baby baby1 = new Baby("Aarav", 8, 7.2);
        Baby baby2 = new Baby("Mira", 12, 8.5);

        System.out.println(baby1);
        System.out.println(baby2);

        int code1 = baby1.hashCode();
        System.out.println("Code1: " + code1);

        int code2 = baby2.hashCode();
        System.out.println("Code2: " + code2);

        System.out.println(new Baby("Zoya", 6, 6.8).hashCode());
    }
}
