package com.xworkz.toString.external;

import com.xworkz.toString.internal.Water;

    public class WaterRunner {
        public static void main(String[] args) {
            Water water1 = new Water("River", true, 7.2, "Clear");
            Water water2 = new Water("Sea", false, 8.1, "Bluish");

            System.out.println(water1);
            System.out.println(water2);
        }
    }
