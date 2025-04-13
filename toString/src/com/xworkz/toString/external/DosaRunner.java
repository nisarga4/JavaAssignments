package com.xworkz.toString.external;

import com.xworkz.toString.internal.Dosa;

public class DosaRunner {
    public static void main(String[] args) {
        Dosa dosa1 = new Dosa("Masala", 10.5, true);
        System.out.println(dosa1);

        int hash = dosa1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(dosa1));

        Dosa dosa2 = new Dosa("Masala", 10.5, true);
        Dosa dosa3 = new Dosa("Plain", 9.0, false);

        System.out.println("Checking same location: " + (dosa1 == dosa2));
        boolean same = dosa1.equals(dosa2);
        System.out.println("Dosa1 is same as Dosa2: " + same);

        System.out.println("Dosa1 is same as Dosa3: " + dosa1.equals(dosa3));
    }
}
