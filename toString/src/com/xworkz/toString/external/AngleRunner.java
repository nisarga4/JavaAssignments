package com.xworkz.toString.external;

import com.xworkz.toString.internal.Angle;

public class AngleRunner {
    public static void main(String[] args) {
        Angle a1 = new Angle("Right", 90.0, false);
        Angle a2 = new Angle("Acute", 45.0, true);

        System.out.println(a1);
        System.out.println(a2);

        System.out.println("HashCode1: " + a1.hashCode());
        System.out.println("HashCode2: " + a2.hashCode());
        System.out.println(new Angle("Obtuse", 120.0, false).hashCode());
    }
}
