package com.xworkz.toString.external;

import com.xworkz.toString.internal.Pendrive;

public class PendriveRunner {
    public static void main(String[] args) {
        Pendrive pendrive1 = new Pendrive("SanDisk", 64, "Black");
        System.out.println(pendrive1);

        int hash = pendrive1.hashCode();
        System.out.println("Hash Code: " + hash);

        Pendrive pendrive2 = new Pendrive("SanDisk", 64, "Black");
        Pendrive pendrive3 = new Pendrive("Kingston", 128, "Blue");

        System.out.println("Checking same location: " + (pendrive1 == pendrive2));
        boolean same = pendrive1.equals(pendrive2);
        System.out.println("Pendrive1 is same as Pendrive2: " + same);

        boolean different = pendrive1.equals(pendrive3);
        System.out.println("Pendrive1 is same as Pendrive3: " + different);
    }
}
