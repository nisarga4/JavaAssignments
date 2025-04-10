package com.xworkz.toString.external;

import com.xworkz.toString.internal.Fashion;

public class FashionRunner {
    public static void main(String[] args) {
        Fashion f1 = new Fashion("Boho", "Summer", true);
        Fashion f2 = new Fashion("Formal", "Winter", false);

        System.out.println(f1);
        System.out.println(f2);

        System.out.println("HashCode1: " + f1.hashCode());
        System.out.println("HashCode2: " + f2.hashCode());
        System.out.println(new Fashion("Casual", "Spring", true).hashCode());
    }
}
