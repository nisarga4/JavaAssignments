package com.xworkz.toString.external;

import com.xworkz.toString.internal.Dam;

public class DamRunner {
    public static void main(String[] args) {
        Dam dam1 = new Dam("Bhakra Nangal", "Himachal Pradesh", 9.34);
        Dam dam2 = new Dam("Sardar Sarovar", "Gujarat", 7.70);

        System.out.println(dam1);
        System.out.println(dam2);

        int code1 = dam1.hashCode();
        System.out.println("Code1: " + code1);

        int code2 = dam2.hashCode();
        System.out.println("Code2: " + code2);

        System.out.println(new Dam("Tehri", "Uttarakhand", 8.55).hashCode());
    }
}
