package com.xworkz.toString.external;

import com.xworkz.toString.internal.Chicken;

public class ChickenRunner {
    public static void main(String[] args) {
        Chicken chicken1 = new Chicken("Broiler", 2.5, true);
        Chicken chicken2 = new Chicken("Desi", 1.8, false);

        System.out.println(chicken1);
        System.out.println(chicken2);

        int code1 = chicken1.hashCode();
        System.out.println("Code1: " + code1);

        int code2 = chicken2.hashCode();
        System.out.println("Code2: " + code2);

        System.out.println(new Chicken("Kadaknath", 2.2, true).hashCode());
    }
}
