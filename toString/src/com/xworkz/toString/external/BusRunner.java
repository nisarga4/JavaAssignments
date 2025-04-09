package com.xworkz.toString.external;
import com.xworkz.toString.internal.Bus;

    public class BusRunner {
        public static void main(String[] args) {
            Bus bus1 = new Bus("KA-01-AB-1234", "Majestic to Whitefield", 50, true);
            Bus bus2 = new Bus("KA-02-CD-5678", "MG Road to Airport", 40, false);

            System.out.println(bus1);
            System.out.println(bus2);
        }
    }
