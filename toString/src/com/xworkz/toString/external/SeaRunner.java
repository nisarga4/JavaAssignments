package com.xworkz.toString.external;

import com.xworkz.toString.internal.Sea;

public class SeaRunner {
    public static void main(String[] args) {
        Sea sea1 = new Sea("Pacific Ocean", "Global", 10924.0);
        System.out.println(sea1);

        int hash = sea1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(sea1));

        Sea sea2 = new Sea("Pacific Ocean", "Global", 10924.0);
        Sea sea3 = new Sea("Atlantic Ocean", "Global", 8130.0);

        System.out.println("Checking same location: " + (sea1 == sea2));
        boolean same = sea1.equals(sea2);
        System.out.println("Sea1 is same as Sea2: " + same);

        boolean sameSea3 = sea1.equals(sea3);
        System.out.println("Sea1 is same as Sea3: " + sameSea3);
    }
}
