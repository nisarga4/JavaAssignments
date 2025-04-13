package com.xworkz.toString.external;

import com.xworkz.toString.internal.Earphone;

public class EarphoneRunner {
    public static void main(String[] args) {
        Earphone earphone1 = new Earphone("Sony", "Wireless", 199.99);
        System.out.println(earphone1);

        int hash = earphone1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(earphone1));

        Earphone earphone2 = new Earphone("Sony", "Wireless", 199.99);
        Earphone earphone3 = new Earphone("Bose", "Wired", 249.99);

        System.out.println("Checking same location: " + (earphone1 == earphone2));
        boolean same = earphone1.equals(earphone2);
        System.out.println("Earphone1 is same as Earphone2: " + same);

        System.out.println("Earphone1 is same as Earphone3: " + earphone1.equals(earphone3));
    }
}
