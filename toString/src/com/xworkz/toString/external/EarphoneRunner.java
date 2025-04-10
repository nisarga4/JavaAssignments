package com.xworkz.toString.external;

import com.xworkz.toString.internal.Earphone;

public class EarphoneRunner {
    public static void main(String[] args) {
        Earphone e1 = new Earphone("Boat", true, 10);
        Earphone e2 = new Earphone("JBL", false, 0);

        System.out.println(e1);
        System.out.println(e2);

        System.out.println("HashCode1: " + e1.hashCode());
        System.out.println("HashCode2: " + e2.hashCode());
        System.out.println(new Earphone("Sony", true, 12).hashCode());
    }
}
