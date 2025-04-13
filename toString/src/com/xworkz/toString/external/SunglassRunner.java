package com.xworkz.toString.external;

import com.xworkz.toString.internal.Sunglass;

public class SunglassRunner {
    public static void main(String[] args) {
        Sunglass sunglass1 = new Sunglass("Ray-Ban", "Black", "Polarized");
        System.out.println(sunglass1);

        int hash = sunglass1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(sunglass1));

        Sunglass sunglass2 = new Sunglass("Ray-Ban", "Black", "Polarized");
        Sunglass sunglass3 = new Sunglass("Oakley", "Blue", "Non-Polarized");

        System.out.println("Checking same location: " + (sunglass1 == sunglass2));
        boolean same = sunglass1.equals(sunglass2);
        System.out.println("Sunglass1 is same as Sunglass2: " + same);

        boolean sameSunglass3 = sunglass1.equals(sunglass3);
        System.out.println("Sunglass1 is same as Sunglass3: " + sameSunglass3);
    }
}
