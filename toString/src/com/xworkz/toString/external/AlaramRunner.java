package com.xworkz.toString.external;

import com.xworkz.toString.internal.Alaram;

public class AlaramRunner {
    public static void main(String[] args) {
        Alaram a1 = new Alaram("Digital", "Beep", true);
        Alaram a2 = new Alaram("Analog", "Ring", false);

        System.out.println(a1);
        System.out.println(a2);

        System.out.println("HashCode1: " + a1.hashCode());
        System.out.println("HashCode2: " + a2.hashCode());
        System.out.println(new Alaram("Smart", "Melody", true).hashCode());
    }
}
