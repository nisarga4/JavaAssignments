package com.xworkz.toString.external;

import com.xworkz.toString.internal.Ant;

public class AntRunner {
    public static void main(String[] args) {
        Ant ant1 = new Ant("Carpenter", 6, true);
        Ant ant2 = new Ant("Weaver", 6, false);

        System.out.println(ant1);
        System.out.println(ant2);

        int code1 = ant1.hashCode();
        System.out.println("Code1: " + code1);

        int code2 = ant2.hashCode();
        System.out.println("Code2: " + code2);

        System.out.println(new Ant("Army", 6, true).hashCode());
    }
}
