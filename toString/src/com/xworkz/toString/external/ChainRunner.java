package com.xworkz.toString.external;

import com.xworkz.toString.internal.Chain;

public class ChainRunner {
    public static void main(String[] args) {
        Chain chain1 = new Chain("Gold", 45.0, "Yellow");
        System.out.println(chain1);

        int hash = chain1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(chain1));

        Chain chain2 = new Chain("Gold", 45.0, "Yellow");
        Chain chain3 = new Chain("Silver", 50.0, "Gray");

        System.out.println("Checking same location: " + (chain1 == chain2));
        boolean same = chain1.equals(chain2);
        System.out.println("Chain1 is same as Chain2: " + same);

        System.out.println("Chain1 is same as Chain3: " + chain1.equals(chain3));
    }
}
