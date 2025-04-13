package com.xworkz.toString.external;

import com.xworkz.toString.internal.Panipuri;

public class PanipuriRunner {
    public static void main(String[] args) {
        Panipuri panipuri1 = new Panipuri("Tamarind", 10, "Small");
        System.out.println(panipuri1);

        int hash = panipuri1.hashCode();
        System.out.println("Hash Code: " + hash);

        Panipuri panipuri2 = new Panipuri("Tamarind", 10, "Small");
        Panipuri panipuri3 = new Panipuri("Mint", 15, "Medium");

        System.out.println("Checking same location: " + (panipuri1 == panipuri2));
        boolean same = panipuri1.equals(panipuri2);
        System.out.println("Panipuri1 is same as Panipuri2: " + same);

        boolean different = panipuri1.equals(panipuri3);
        System.out.println("Panipuri1 is same as Panipuri3: " + different);
    }
}
