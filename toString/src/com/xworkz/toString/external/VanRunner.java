package com.xworkz.toString.external;

import com.xworkz.toString.internal.Van;

public class VanRunner {
    public static void main(String[] args) {
        Van van1 = new Van("Ford", "Transit", 2019);
        System.out.println(van1);

        int hash = van1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(van1));

        Van van2 = new Van("Ford", "Transit", 2019);
        Van van3 = new Van("Chevrolet", "Express", 2020);

        System.out.println("Checking same location: " + (van1 == van2));
        boolean same = van1.equals(van2);
        System.out.println("Van1 is same as Van2: " + same);

        System.out.println("Van1 is same as Van3: " + van1.equals(van3));
    }
}
