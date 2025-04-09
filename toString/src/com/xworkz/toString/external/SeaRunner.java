package com.xworkz.toString.external;

import com.xworkz.toString.internal.Sea;

    public class SeaRunner {
        public static void main(String[] args) {
            Sea sea1 = new Sea("Arabian Sea", "Indian Ocean", 3862000, 2740);
            Sea sea2 = new Sea("Baltic Sea", "Northern Europe", 377000, 55);

            System.out.println(sea1);
            System.out.println(sea2);
        }
    }
