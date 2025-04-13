package com.xworkz.toString.external;

import com.xworkz.toString.internal.Long;

public class LongRunner {
    public static void main(String[] args) {
        Long obj1 = new Long("MeasuringTape", 10.5, "Steel");
        System.out.println(obj1);

        int hash = obj1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(obj1));

        Long obj2 = new Long("MeasuringTape", 10.5, "Steel");
        Long obj3 = new Long("Stick", 12.0, "Wood");

        System.out.println("Checking same location: " + (obj1 == obj2));
        boolean same = obj1.equals(obj2);
        System.out.println("Long1 is same as Long2: " + same);

        System.out.println("Long1 is same as Long3: " + obj1.equals(obj3));
    }
}
