package com.xworkz.toString.external;

import com.xworkz.toString.internal.Pendrive;

public class PendriveRunner {
    public static void main(String[] args) {
        Pendrive p1 = new Pendrive("SanDisk", 64, true);
        Pendrive p2 = new Pendrive("HP", 32, false);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("HashCode1: " + p1.hashCode());
        System.out.println("HashCode2: " + p2.hashCode());
        System.out.println(new Pendrive("Sony", 128, true).hashCode());
    }
}
