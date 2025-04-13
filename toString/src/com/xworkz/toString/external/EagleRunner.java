package com.xworkz.toString.external;

import com.xworkz.toString.internal.Eagle;

public class EagleRunner {
    public static void main(String[] args) {
        Eagle eagle1 = new Eagle("Golden Eagle", 2.3, "Mountains");
        System.out.println(eagle1);

        int hash = eagle1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(eagle1));

        Eagle eagle2 = new Eagle("Golden Eagle", 2.3, "Mountains");
        Eagle eagle3 = new Eagle("Bald Eagle", 2.4, "Forests");

        System.out.println("Checking same location: " + (eagle1 == eagle2));
        boolean same = eagle1.equals(eagle2);
        System.out.println("Eagle1 is same as Eagle2: " + same);

        System.out.println("Eagle1 is same as Eagle3: " + eagle1.equals(eagle3));
    }
}
