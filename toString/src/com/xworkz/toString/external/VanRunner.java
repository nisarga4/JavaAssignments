package com.xworkz.toString.external;

import com.xworkz.toString.internal.Van;

public class VanRunner {
    public static void main(String[] args) {
        Van v1 = new Van("Tata", 12, true);
        Van v2 = new Van("Force", 15, false);

        System.out.println(v1);
        System.out.println(v2);

        System.out.println("HashCode1: " + v1.hashCode());
        System.out.println("HashCode2: " + v2.hashCode());
        System.out.println(new Van("Eicher", 18, true).hashCode());
    }
}
