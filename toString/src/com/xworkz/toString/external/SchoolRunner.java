package com.xworkz.toString.external;

import com.xworkz.toString.internal.School;

public class SchoolRunner {
    public static void main(String[] args) {
        School school1 = new School("Greenwood High", 1200, "New York");
        System.out.println(school1);

        int hash = school1.hashCode();
        System.out.println("Hash Code: " + hash);

        School school2 = new School("Greenwood High", 1200, "New York");
        School school3 = new School("Riverdale High", 1000, "Los Angeles");

        System.out.println("Checking same location: " + (school1 == school2));
        boolean same = school1.equals(school2);
        System.out.println("School1 is same as School2: " + same);

        boolean different = school1.equals(school3);
        System.out.println("School1 is same as School3: " + different);
    }
}
