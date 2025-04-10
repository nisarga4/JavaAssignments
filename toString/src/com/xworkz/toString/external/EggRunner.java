package com.xworkz.toString.external;

import com.xworkz.toString.internal.Egg;

public class EggRunner {
    public static void main(String[] args) {
        Egg e1 = new Egg("Hen", true, 50);
        Egg e2 = new Egg("Duck", false, 70);

        System.out.println(e1);
        System.out.println(e2);

        System.out.println("HashCode1: " + e1.hashCode());
        System.out.println("HashCode2: " + e2.hashCode());
        System.out.println(new Egg("Quail", false, 35).hashCode());
    }
}
