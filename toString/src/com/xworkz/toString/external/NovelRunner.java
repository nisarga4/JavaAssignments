package com.xworkz.toString.external;

import com.xworkz.toString.internal.Novel;

public class NovelRunner {
    public static void main(String[] args) {
        Novel n1 = new Novel("The Alchemist", "Paulo Coelho", 208);
        Novel n2 = new Novel("1984", "George Orwell", 328);

        System.out.println(n1);
        System.out.println(n2);

        System.out.println("HashCode1: " + n1.hashCode());
        System.out.println("HashCode2: " + n2.hashCode());
        System.out.println(new Novel("To Kill a Mockingbird", "Harper Lee", 281).hashCode());
    }
}
