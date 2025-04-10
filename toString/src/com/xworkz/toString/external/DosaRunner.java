package com.xworkz.toString.external;

import com.xworkz.toString.internal.Dosa;

public class DosaRunner {
    public static void main(String[] args) {
        Dosa dosa1 = new Dosa("Masala", true, 55.0);
        Dosa dosa2 = new Dosa("Plain", false, 40.0);

        System.out.println(dosa1);
        System.out.println(dosa2);

        int code1 = dosa1.hashCode();
        System.out.println("Code1: " + code1);

        int code2 = dosa2.hashCode();
        System.out.println("Code2: " + code2);

        System.out.println(new Dosa("Rava", true, 60.0).hashCode());
    }
}
