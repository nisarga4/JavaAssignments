package com.xworkz.toString.external;

import com.xworkz.toString.internal.SoapPowder;

public class SoapPowderRunner {
    public static void main(String[] args) {
        SoapPowder soap1 = new SoapPowder("Ariel", 1.5, "Lavender");
        System.out.println(soap1);

        int hash = soap1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(soap1));

        SoapPowder soap2 = new SoapPowder("Ariel", 1.5, "Lavender");
        SoapPowder soap3 = new SoapPowder("Surf", 2.0, "Rose");

        System.out.println("Checking same location: " + (soap1 == soap2));
        boolean same = soap1.equals(soap2);
        System.out.println("Soap1 is same as Soap2: " + same);

        boolean sameSoap3 = soap1.equals(soap3);
        System.out.println("Soap1 is same as Soap3: " + sameSoap3);
    }
}
