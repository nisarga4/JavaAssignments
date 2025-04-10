package com.xworkz.toString.external;

import com.xworkz.toString.internal.SugarFree;

public class SugarFreeRunner {
    public static void main(String[] args) {
        SugarFree s1 = new SugarFree("Gold", 500, true);
        SugarFree s2 = new SugarFree("Green", 300, true);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("HashCode1: " + s1.hashCode());
        System.out.println("HashCode2: " + s2.hashCode());
        System.out.println(new SugarFree("Stevia", 250, true).hashCode());
    }
}
