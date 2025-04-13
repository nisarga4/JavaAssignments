package com.xworkz.toString.external;

import com.xworkz.toString.internal.John;

public class JohnRunner {
    public static void main(String[] args) {
        John john1 = new John("Engineer", 30, "New York");
        System.out.println(john1);

        int hash = john1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(john1));

        John john2 = new John("Engineer", 30, "New York");
        John john3 = new John("Doctor", 28, "Los Angeles");

        System.out.println("Checking same location: " + (john1 == john2));
        boolean same = john1.equals(john2);
        System.out.println("John1 is same as John2: " + same);

        System.out.println("John1 is same as John3: " + john1.equals(john3));
    }
}
