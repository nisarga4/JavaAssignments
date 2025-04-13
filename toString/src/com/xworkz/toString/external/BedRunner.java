package com.xworkz.toString.external;

import com.xworkz.toString.internal.Bed;

public class BedRunner {
    public static void main(String[] args) {
        Bed bed1 = new Bed("Queen", "Wood", true);
        System.out.println(bed1);

        int hash = bed1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(bed1));

        Bed bed2 = new Bed("Queen", "Wood", true);
        Bed bed3 = new Bed("King", "Metal", false);

        System.out.println("Checking same location: " + (bed2 == bed3));
        boolean same = bed2.equals(bed3);
        System.out.println("Bed2 is same as Bed3: " + same);
    }
}
