package com.xworkz.toString.external;

import com.xworkz.toString.internal.SoapPowder;

public class SoapPowderRunner {
    public static void main(String[] args) {
        SoapPowder s1 = new SoapPowder("Surf Excel", 1.0, true);
        SoapPowder s2 = new SoapPowder("Ariel", 0.5, true);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("HashCode1: " + s1.hashCode());
        System.out.println("HashCode2: " + s2.hashCode());
        System.out.println(new SoapPowder("Tide", 2.0, false).hashCode());
    }
}
