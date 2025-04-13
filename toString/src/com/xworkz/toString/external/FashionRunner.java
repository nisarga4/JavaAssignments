package com.xworkz.toString.external;

import com.xworkz.toString.internal.Fashion;

public class FashionRunner {
    public static void main(String[] args) {
        Fashion fashion1 = new Fashion("Shirt", "Nike", 49.99);
        System.out.println(fashion1);

        int hash = fashion1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(fashion1));

        Fashion fashion2 = new Fashion("Shirt", "Nike", 49.99);
        Fashion fashion3 = new Fashion("Pants", "Adidas", 59.99);

        System.out.println("Checking same location: " + (fashion1 == fashion2));
        boolean same = fashion1.equals(fashion2);
        System.out.println("Fashion1 is same as Fashion2: " + same);

        System.out.println("Fashion1 is same as Fashion3: " + fashion1.equals(fashion3));
    }
}
