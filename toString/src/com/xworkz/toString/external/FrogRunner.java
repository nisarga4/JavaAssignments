package com.xworkz.toString.external;

import com.xworkz.toString.internal.Frog;

public class FrogRunner {
    public static void main(String[] args) {
        Frog frog1 = new Frog("Green Frog", "Green", 0.5);
        System.out.println(frog1);

        int hash = frog1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(frog1));

        Frog frog2 = new Frog("Green Frog", "Green", 0.5);
        Frog frog3 = new Frog("Tree Frog", "Green", 0.3);

        System.out.println("Checking same location: " + (frog1 == frog2));
        boolean same = frog1.equals(frog2);
        System.out.println("Frog1 is same as Frog2: " + same);

        System.out.println("Frog1 is same as Frog3: " + frog1.equals(frog3));
    }
}
