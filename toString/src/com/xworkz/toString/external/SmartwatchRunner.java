package com.xworkz.toString.external;

import com.xworkz.toString.internal.Smartwatch;

public class SmartwatchRunner {
    public static void main(String[] args) {
        Smartwatch watch1 = new Smartwatch("Apple", 399.99, "GPS, Heart Rate Monitor");
        System.out.println(watch1);

        int hash = watch1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(watch1));

        Smartwatch watch2 = new Smartwatch("Apple", 399.99, "GPS, Heart Rate Monitor");
        Smartwatch watch3 = new Smartwatch("Samsung", 299.99, "GPS, Sleep Tracking");

        System.out.println("Checking same location: " + (watch1 == watch2));
        boolean same = watch1.equals(watch2);
        System.out.println("Watch1 is same as Watch2: " + same);

        boolean sameWatch3 = watch1.equals(watch3);
        System.out.println("Watch1 is same as Watch3: " + sameWatch3);
    }
}
