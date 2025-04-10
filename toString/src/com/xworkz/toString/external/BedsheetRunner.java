package com.xworkz.toString.external;

import com.xworkz.toString.internal.Bedsheet;

public class BedsheetRunner {
    public static void main(String[] args) {
        Bedsheet b1 = new Bedsheet("Cotton", "White", 2.5);
        Bedsheet b2 = new Bedsheet("Silk", "Red", 2.2);

        System.out.println(b1);
        System.out.println(b2);

        System.out.println("HashCode1: " + b1.hashCode());
        System.out.println("HashCode2: " + b2.hashCode());
        System.out.println(new Bedsheet("Linen", "Blue", 2.8).hashCode());
    }
}
