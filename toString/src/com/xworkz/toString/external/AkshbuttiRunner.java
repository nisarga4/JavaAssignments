package com.xworkz.toString.external;

import com.xworkz.toString.internal.Akshbutti;

public class AkshbuttiRunner {
    public static void main(String[] args) {
        Akshbutti aksh1 = new Akshbutti("Brass", 15.0, true, "Diwali");
        Akshbutti aksh2 = new Akshbutti("Clay", 10.0, false, "Pooja");

        System.out.println(aksh1);
        System.out.println(aksh2);

        int code1 = aksh1.hashCode();
        System.out.println("Code1: " + code1);

        int code2 = aksh2.hashCode();
        System.out.println("Code2: " + code2);

        System.out.println(new Akshbutti("Silver", 12.5, true, "Wedding").hashCode());
    }
}

