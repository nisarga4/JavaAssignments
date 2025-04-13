package com.xworkz.toString.external;

import com.xworkz.toString.internal.Krishna;

public class KrishnaRunner {
    public static void main(String[] args) {
        Krishna krishna1 = new Krishna("Vishnu", "Sudarshan Chakra", "Blue");
        System.out.println(krishna1);

        int hash = krishna1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(krishna1));

        Krishna krishna2 = new Krishna("Vishnu", "Sudarshan Chakra", "Blue");
        Krishna krishna3 = new Krishna("Vishnu", "Bow", "Dark");

        System.out.println("Checking same location: " + (krishna1 == krishna2));
        boolean same = krishna1.equals(krishna2);
        System.out.println("Krishna1 is same as Krishna2: " + same);

        System.out.println("Krishna1 is same as Krishna3: " + krishna1.equals(krishna3));
    }
}
