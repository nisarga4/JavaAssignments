package com.xworkz.toString.external;

import com.xworkz.toString.internal.Apple;

public class AppleRunner {
    public static void main(String[] args) {
        Apple apple1 = new Apple("Red", "Kashmir", 0.25);
        System.out.println(apple1);

        int hash = apple1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(apple1));

        Apple apple2 = new Apple("Red", "Kashmir", 0.25);
        Apple apple3 = new Apple("Green", "Himachal", 0.30);

        System.out.println("Checking same location: " + (apple2 == apple3));
        boolean same = apple2.equals(apple3);
        System.out.println("Apple2 is same as Apple3: " + same);
    }
}
