package com.xworkz.toString.external;

import com.xworkz.toString.internal.Shoe;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoe s1 = new Shoe("Nike", 9, "Black");
        Shoe s2 = new Shoe("Adidas", 10, "White");

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("HashCode1: " + s1.hashCode());
        System.out.println("HashCode2: " + s2.hashCode());
        System.out.println(new Shoe("Puma", 8, "Blue").hashCode());
    }
}
