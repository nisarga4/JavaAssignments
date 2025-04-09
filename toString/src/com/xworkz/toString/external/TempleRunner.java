package com.xworkz.toString.external;

import com.xworkz.toString.internal.Temple;

    public class TempleRunner {
        public static void main(String[] args) {
            Temple temple1 = new Temple("Tirupati Balaji", "Andhra Pradesh", true, 1130);
            Temple temple2 = new Temple("Mahakaleshwar", "Ujjain", true, 600);

            System.out.println(temple1);
            System.out.println(temple2);
        }
    }
