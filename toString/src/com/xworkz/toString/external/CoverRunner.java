package com.xworkz.toString.external;

import com.xworkz.toString.internal.Cover;

public class CoverRunner {
    public static void main(String[] args) {
        Cover cover1 = new Cover("Leather", "Black", "Medium");
        System.out.println(cover1);

        int hash = cover1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(cover1));

        Cover cover2 = new Cover("Leather", "Black", "Medium");
        Cover cover3 = new Cover("Fabric", "Red", "Small");

        System.out.println("Checking same location: " + (cover1 == cover2));
        boolean same = cover1.equals(cover2);
        System.out.println("Cover1 is same as Cover2: " + same);

        System.out.println("Cover1 is same as Cover3: " + cover1.equals(cover3));
    }
}
