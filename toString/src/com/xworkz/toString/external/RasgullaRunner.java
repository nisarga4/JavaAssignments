package com.xworkz.toString.external;

import com.xworkz.toString.internal.Rasgulla;

    public class RasgullaRunner {
        public static void main(String[] args) {
            Rasgulla rasgulla1 = new Rasgulla("West Bengal", true, 10, 120.0);
            Rasgulla rasgulla2 = new Rasgulla("Odisha", false, 6, 90.0);

            System.out.println(rasgulla1);
            System.out.println(rasgulla2);
        }
    }
