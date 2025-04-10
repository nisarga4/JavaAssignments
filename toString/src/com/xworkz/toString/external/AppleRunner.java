package com.xworkz.toString.external;

import com.xworkz.toString.internal.Apple;

public class AppleRunner {
    public static void main(String[] args) {
        Apple apple1 = new Apple("Fuji", "Japan", 180.0);
        Apple apple2 = new Apple("Kinnaur", "India", 150.0);

        System.out.println(apple1);
        System.out.println(apple2);

        int code1 = apple1.hashCode();
        System.out.println("Code1: " + code1);

        int code2 = apple2.hashCode();
        System.out.println("Code2: " + code2);

        System.out.println(new Apple("Granny Smith", "USA", 200.0).hashCode());
    }
}
