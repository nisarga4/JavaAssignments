package com.xworkz.toString.external;

import com.xworkz.toString.internal.Army;

public class ArmyRunner {
    public static void main(String[] args) {
        Army army1 = new Army("India", 1200000, "Infantry");
        Army army2 = new Army("USA", 480000, "Armored");

        System.out.println(army1);
        System.out.println(army2);

        int code1 = army1.hashCode();
        System.out.println("Code1: " + code1);

        int code2 = army2.hashCode();
        System.out.println("Code2: " + code2);

        System.out.println(new Army("Russia", 900000, "Artillery").hashCode());
    }
}
