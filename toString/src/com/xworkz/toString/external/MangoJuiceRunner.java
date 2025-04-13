package com.xworkz.toString.external;

import com.xworkz.toString.internal.MangoJuice;

public class MangoJuiceRunner {
    public static void main(String[] args) {
        MangoJuice juice1 = new MangoJuice("Tropicana", 1.0, true);
        System.out.println(juice1);

        int hash = juice1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(juice1));

        MangoJuice juice2 = new MangoJuice("Tropicana", 1.0, true);
        MangoJuice juice3 = new MangoJuice("Real", 0.5, false);

        System.out.println("Checking same location: " + (juice1 == juice2));
        boolean same = juice1.equals(juice2);
        System.out.println("Juice1 is same as Juice2: " + same);

        System.out.println("Juice1 is same as Juice3: " + juice1.equals(juice3));
    }
}
