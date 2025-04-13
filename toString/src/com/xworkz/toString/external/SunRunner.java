package com.xworkz.toString.external;

import com.xworkz.toString.internal.Sun;

public class SunRunner {
    public static void main(String[] args) {
        Sun sun1 = new Sun("Sol", 5500, "Main Sequence");
        System.out.println(sun1);

        int hash = sun1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(sun1));

        Sun sun2 = new Sun("Sol", 5500, "Main Sequence");
        Sun sun3 = new Sun("Alpha Centauri", 6000, "Red Giant");

        System.out.println("Checking same location: " + (sun1 == sun2));
        boolean same = sun1.equals(sun2);
        System.out.println("Sun1 is same as Sun2: " + same);

        boolean sameSun3 = sun1.equals(sun3);
        System.out.println("Sun1 is same as Sun3: " + sameSun3);
    }
}
