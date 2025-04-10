package com.xworkz.toString.external;

import com.xworkz.toString.internal.Cycle;

public class CycleRunner {
    public static void main(String[] args) {
        Cycle c1 = new Cycle("Hero", "Mountain", 21);
        Cycle c2 = new Cycle("Atlas", "Road", 6);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("HashCode1: " + c1.hashCode());
        System.out.println("HashCode2: " + c2.hashCode());
        System.out.println(new Cycle("Btwin", "Hybrid", 7).hashCode());
    }
}
