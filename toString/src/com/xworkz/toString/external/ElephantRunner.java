package com.xworkz.toString.external;

import com.xworkz.toString.internal.Elephant;

public class ElephantRunner {
    public static void main(String[] args) {
        Elephant elephant1 = new Elephant("African", 6000.5, 10);
        System.out.println(elephant1);

        int hash = elephant1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(elephant1));

        Elephant elephant2 = new Elephant("African", 6000.5, 10);
        Elephant elephant3 = new Elephant("Asian", 4000.0, 12);

        System.out.println("Checking same location: " + (elephant1 == elephant2));
        boolean same = elephant1.equals(elephant2);
        System.out.println("Elephant1 is same as Elephant2: " + same);

        System.out.println("Elephant1 is same as Elephant3: " + elephant1.equals(elephant3));
    }
}
