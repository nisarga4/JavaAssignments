package com.xworkz.toString.external;

import com.xworkz.toString.internal.Oven;

public class OvenRunner {
    public static void main(String[] args) {
        Oven oven1 = new Oven("Samsung", 30.0, "Convection");
        System.out.println(oven1);

        int hash = oven1.hashCode();
        System.out.println("Hash Code: " + hash);

        Oven oven2 = new Oven("Samsung", 30.0, "Convection");
        Oven oven3 = new Oven("LG", 32.0, "Microwave");

        System.out.println("Checking same location: " + (oven1 == oven2));
        boolean same = oven1.equals(oven2);
        System.out.println("Oven1 is same as Oven2: " + same);

        boolean different = oven1.equals(oven3);
        System.out.println("Oven1 is same as Oven3: " + different);
    }
}
