package com.xworkz.toString.external;

import com.xworkz.toString.internal.Clip;

public class ClipRunner {
    public static void main(String[] args) {
        Clip clip1 = new Clip("Paper", "Black", 5.0);
        System.out.println(clip1);

        int hash = clip1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(clip1));

        Clip clip2 = new Clip("Paper", "Black", 5.0);
        Clip clip3 = new Clip("Hair", "Brown", 3.0);

        System.out.println("Checking same location: " + (clip1 == clip2));
        boolean same = clip1.equals(clip2);
        System.out.println("Clip1 is same as Clip2: " + same);

        System.out.println("Clip1 is same as Clip3: " + clip1.equals(clip3));
    }
}
