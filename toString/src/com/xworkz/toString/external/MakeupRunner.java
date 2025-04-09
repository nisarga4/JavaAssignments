package com.xworkz.toString.external;

import com.xworkz.toString.internal.Makeup;

    public class MakeupRunner {
        public static void main(String[] args) {
            Makeup item1 = new Makeup("Lipstick", "Maybelline", "Crimson Red", true);
            Makeup item2 = new Makeup("Foundation", "L'Oréal", "Beige", false);

            System.out.println(item1);
            System.out.println(item2);
        }
    }
