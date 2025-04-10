package com.xworkz.toString.external;

import com.xworkz.toString.internal.Bed;

public class BedRunner {
    public static void main(String[] args) {
        Bed bed1 = new Bed("King", "Wood", 6.5);
        Bed bed2 = new Bed("Queen", "Metal", 5.5);

        System.out.println(bed1);
        System.out.println(bed2);

        int code1 = bed1.hashCode();
        System.out.println("Code1: " + code1);

        int code2 = bed2.hashCode();
        System.out.println("Code2: " + code2);

        System.out.println(new Bed("Single", "Plastic", 4.0).hashCode());
    }
}
