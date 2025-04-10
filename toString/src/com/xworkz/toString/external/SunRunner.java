package com.xworkz.toString.external;

import com.xworkz.toString.internal.Sun;

public class SunRunner {
    public static void main(String[] args) {
        Sun s1 = new Sun("Main Sequence", 5778, true);
        Sun s2 = new Sun("G-Type", 6000, true);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("HashCode1: " + s1.hashCode());
        System.out.println("HashCode2: " + s2.hashCode());
        System.out.println(new Sun("Red Giant", 3500, false).hashCode());
    }
}
