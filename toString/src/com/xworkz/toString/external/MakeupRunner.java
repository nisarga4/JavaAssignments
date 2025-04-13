package com.xworkz.toString.external;

import com.xworkz.toString.internal.Makeup;

public class MakeupRunner {
    public static void main(String[] args) {
        Makeup makeup1 = new Makeup("Lakme", "Foundation", 499.99);
        System.out.println(makeup1);

        int hash = makeup1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(makeup1));

        Makeup makeup2 = new Makeup("Lakme", "Foundation", 499.99);
        Makeup makeup3 = new Makeup("Maybelline", "Lipstick", 299.99);

        System.out.println("Checking same location: " + (makeup1 == makeup2));
        boolean same = makeup1.equals(makeup2);
        System.out.println("Makeup1 is same as Makeup2: " + same);

        System.out.println("Makeup1 is same as Makeup3: " + makeup1.equals(makeup3));
    }
}
