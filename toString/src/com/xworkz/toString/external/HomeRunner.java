package com.xworkz.toString.external;

import com.xworkz.toString.internal.Home;

public class HomeRunner {
    public static void main(String[] args) {
        Home home1 = new Home("123 Elm Street", 3, true);
        System.out.println(home1);

        int hash = home1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(home1));

        Home home2 = new Home("123 Elm Street", 3, true);
        Home home3 = new Home("456 Oak Avenue", 4, false);

        System.out.println("Checking same location: " + (home1 == home2));
        boolean same = home1.equals(home2);
        System.out.println("Home1 is same as Home2: " + same);

        System.out.println("Home1 is same as Home3: " + home1.equals(home3));
    }
}
