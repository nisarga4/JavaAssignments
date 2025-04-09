package com.xworkz.toString.external;


import com.xworkz.toString.internal.WashingPowder;

    public class WashingPowderRunner {
        public static void main(String[] args) {
            WashingPowder powder1 = new WashingPowder("Ariel", 500, "Lemon", true);
            WashingPowder powder2 = new WashingPowder("Surf Excel", 1000, "Floral", false);

            System.out.println(powder1);
            System.out.println(powder2);
        }
    }

