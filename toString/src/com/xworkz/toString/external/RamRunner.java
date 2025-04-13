package com.xworkz.toString.external;

import com.xworkz.toString.internal.Ram;

public class RamRunner {
    public static void main(String[] args) {
        Ram ram1 = new Ram("Corsair Vengeance", 16, "DDR4");
        System.out.println(ram1);

        int hash = ram1.hashCode();
        System.out.println("Hash Code: " + hash);

        Ram ram2 = new Ram("Corsair Vengeance", 16, "DDR4");
        Ram ram3 = new Ram("G.Skill Ripjaws", 8, "DDR4");

        System.out.println("Checking same location: " + (ram1 == ram2));
        boolean same = ram1.equals(ram2);
        System.out.println("Ram1 is same as Ram2: " + same);

        boolean different = ram1.equals(ram3);
        System.out.println("Ram1 is same as Ram3: " + different);
    }
}
