package com.xworkz.toString.external;

import com.xworkz.toString.internal.Bedsheet;

public class BedsheetRunner {
    public static void main(String[] args) {
        Bedsheet bedsheet1 = new Bedsheet("Cotton", "Blue", 1200.0);
        System.out.println(bedsheet1);

        int hash = bedsheet1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(bedsheet1));

        Bedsheet bedsheet2 = new Bedsheet("Cotton", "Blue", 1200.0);
        Bedsheet bedsheet3 = new Bedsheet("Silk", "Red", 1500.0);

        System.out.println("Checking same location: " + (bedsheet2 == bedsheet3));
        boolean same = bedsheet2.equals(bedsheet3);
        System.out.println("Bedsheet2 is same as Bedsheet3: " + same);
    }
}
