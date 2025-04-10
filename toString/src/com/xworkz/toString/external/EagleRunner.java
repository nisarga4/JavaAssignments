package com.xworkz.toString.external;

import com.xworkz.toString.internal.Eagle;

public class EagleRunner {
    public static void main(String[] args) {
        Eagle e1 = new Eagle("Golden", 2.1, false);
        Eagle e2 = new Eagle("Bald", 2.3, true);

        System.out.println(e1);
        System.out.println(e2);

        System.out.println("HashCode1: " + e1.hashCode());
        System.out.println("HashCode2: " + e2.hashCode());
        System.out.println(new Eagle("Sea Eagle", 2.5, false).hashCode());
    }
}
