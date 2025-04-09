package com.xworkz.toString.external;

import com.xworkz.toString.internal.Baby;

    public class BabyRunner {
        public static void main(String[] args) {
            Baby baby1 = new Baby("Aarav", 10, 8.5, true);
            Baby baby2 = new Baby("Mia", 5, 6.2, false);

            System.out.println(baby1);
            System.out.println(baby2);
        }
    }
