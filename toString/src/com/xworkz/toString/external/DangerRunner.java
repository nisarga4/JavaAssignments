package com.xworkz.toString.external;

import com.xworkz.toString.internal.Danger;

public class DangerRunner {
    public static void main(String[] args) {
        Danger d1 = new Danger("Fire", 10, false);
        Danger d2 = new Danger("Electric Shock", 8, true);

        System.out.println(d1);
        System.out.println(d2);

        System.out.println("HashCode1: " + d1.hashCode());
        System.out.println("HashCode2: " + d2.hashCode());
        System.out.println(new Danger("Flood", 9, false).hashCode());
    }
}
