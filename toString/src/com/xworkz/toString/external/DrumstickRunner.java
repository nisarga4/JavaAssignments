package com.xworkz.toString.external;

import com.xworkz.toString.internal.Drumstick;

public class DrumstickRunner {
    public static void main(String[] args) {
        Drumstick drumstick1 = new Drumstick("Chicken", 200, true);
        System.out.println(drumstick1);

        int hash = drumstick1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(drumstick1));

        Drumstick drumstick2 = new Drumstick("Chicken", 200, true);
        Drumstick drumstick3 = new Drumstick("Mutton", 250, false);

        System.out.println("Checking same location: " + (drumstick1 == drumstick2));
        boolean same = drumstick1.equals(drumstick2);
        System.out.println("Drumstick1 is same as Drumstick2: " + same);

        System.out.println("Drumstick1 is same as Drumstick3: " + drumstick1.equals(drumstick3));
    }
}
