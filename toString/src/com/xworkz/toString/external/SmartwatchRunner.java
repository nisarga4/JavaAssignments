package com.xworkz.toString.external;

import com.xworkz.toString.internal.Smartwatch;

public class SmartwatchRunner {
        public static void main(String[] args) {
            Smartwatch watch1 = new Smartwatch("Apple", "Watch Series 9", true, 41999.99);
            Smartwatch watch2 = new Smartwatch("Noise", "ColorFit Pro 3", false, 2999.00);

            System.out.println(watch1);
            System.out.println(watch2);
        }
    }
