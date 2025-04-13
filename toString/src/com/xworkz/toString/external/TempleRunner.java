package com.xworkz.toString.external;

import com.xworkz.toString.internal.Temple;

public class TempleRunner {
    public static void main(String[] args) {
        Temple temple1 = new Temple("Golden Temple", "Amritsar", 1581);
        System.out.println(temple1);

        int hash = temple1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(temple1));

        Temple temple2 = new Temple("Golden Temple", "Amritsar", 1581);
        Temple temple3 = new Temple("Kashi Vishwanath", "Varanasi", 1780);

        System.out.println("Checking same location: " + (temple1 == temple2));
        boolean same = temple1.equals(temple2);
        System.out.println("Temple1 is same as Temple2: " + same);

        boolean sameTemple3 = temple1.equals(temple3);
        System.out.println("Temple1 is same as Temple3: " + sameTemple3);
    }
}
