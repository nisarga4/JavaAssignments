package com.xworkz.toString.external;

import com.xworkz.toString.internal.School;

public class SchoolRunner {
    public static void main(String[] args) {
        School s1 = new School("Greenwood High", "Bangalore", 1200);
        School s2 = new School("Delhi Public School", "Delhi", 1500);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("HashCode1: " + s1.hashCode());
        System.out.println("HashCode2: " + s2.hashCode());
        System.out.println(new School("Ryan International", "Mumbai", 1000).hashCode());
    }
}
