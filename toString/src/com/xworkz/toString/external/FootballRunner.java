package com.xworkz.toString.external;

import com.xworkz.toString.internal.Football;

public class FootballRunner {
    public static void main(String[] args) {
        Football football1 = new Football("Nike", "Leather", 5.0);
        System.out.println(football1);

        int hash = football1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(football1));

        Football football2 = new Football("Nike", "Leather", 5.0);
        Football football3 = new Football("Adidas", "Synthetic", 4.5);

        System.out.println("Checking same location: " + (football1 == football2));
        boolean same = football1.equals(football2);
        System.out.println("Football1 is same as Football2: " + same);

        System.out.println("Football1 is same as Football3: " + football1.equals(football3));
    }
}
