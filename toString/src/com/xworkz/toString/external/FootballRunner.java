package com.xworkz.toString.external;

import com.xworkz.toString.internal.Football;

    public class FootballRunner {
        public static void main(String[] args) {
            Football football1 = new Football("Nivia", "White/Black", "PU Leather", 999.0);
            Football football2 = new Football("Adidas", "Red/Blue", "Synthetic", 1499.0);

            System.out.println(football1);
            System.out.println(football2);
        }
    }

