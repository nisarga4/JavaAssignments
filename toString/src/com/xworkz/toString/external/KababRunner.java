package com.xworkz.toString.external;

import com.xworkz.toString.internal.Kabab;

public class KababRunner {
    public static void main(String[] args) {
        Kabab k1 = new Kabab("Seekh", 4, true);
        Kabab k2 = new Kabab("Shami", 2, false);

        System.out.println(k1);
        System.out.println(k2);

        System.out.println("HashCode1: " + k1.hashCode());
        System.out.println("HashCode2: " + k2.hashCode());
        System.out.println(new Kabab("Tandoori", 3, true).hashCode());
    }
}
