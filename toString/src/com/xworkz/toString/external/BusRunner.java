package com.xworkz.toString.external;

import com.xworkz.toString.internal.Bus;

public class BusRunner {
    public static void main(String[] args) {
        Bus bus1 = new Bus("Volvo", 50, "Sleeper");
        Bus bus2 = new Bus("Tata", 60, "Seater");

        System.out.println(bus1);
        System.out.println(bus2);

        int code1 = bus1.hashCode();
        System.out.println("Code1: " + code1);

        int code2 = bus2.hashCode();
        System.out.println("Code2: " + code2);

        System.out.println(new Bus("Ashok Leyland", 40, "Mini").hashCode());
    }
}
