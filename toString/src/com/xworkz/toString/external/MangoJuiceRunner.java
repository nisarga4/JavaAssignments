package com.xworkz.toString.external;

import com.xworkz.toString.internal.MangoJuice;

public class MangoJuiceRunner {
    public static void main(String[] args) {
        MangoJuice j1 = new MangoJuice("Maaza", 250, true);
        MangoJuice j2 = new MangoJuice("Frooti", 200, false);

        System.out.println(j1);
        System.out.println(j2);

        System.out.println("HashCode1: " + j1.hashCode());
        System.out.println("HashCode2: " + j2.hashCode());
        System.out.println(new MangoJuice("Slice", 300, true).hashCode());
    }
}
