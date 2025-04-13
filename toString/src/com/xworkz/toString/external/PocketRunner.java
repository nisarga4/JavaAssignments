package com.xworkz.toString.external;

import com.xworkz.toString.internal.Pocket;

public class PocketRunner {
    public static void main(String[] args) {
        Pocket pocket1 = new Pocket("Denim", 12.5, true);
        System.out.println(pocket1);

        int hash = pocket1.hashCode();
        System.out.println("Hash Code: " + hash);

        Pocket pocket2 = new Pocket("Denim", 12.5, true);
        Pocket pocket3 = new Pocket("Cotton", 10.0, false);

        System.out.println("Checking same location: " + (pocket1 == pocket2));
        boolean same = pocket1.equals(pocket2);
        System.out.println("Pocket1 is same as Pocket2: " + same);

        boolean different = pocket1.equals(pocket3);
        System.out.println("Pocket1 is same as Pocket3: " + different);
    }
}
