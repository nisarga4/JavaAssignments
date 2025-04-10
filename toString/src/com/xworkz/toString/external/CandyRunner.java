package com.xworkz.toString.external;

import com.xworkz.toString.internal.Candy;

public class CandyRunner {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Strawberry", "Red", 12.5);
        Candy candy2 = new Candy("Mint", "Green", 8.0);

        System.out.println(candy1);
        System.out.println(candy2);

        int code1 = candy1.hashCode();
        System.out.println("Code1: " + code1);

        int code2 = candy2.hashCode();
        System.out.println("Code2: " + code2);

        System.out.println(new Candy("Orange", "Orange", 10.0).hashCode());
    }
}
