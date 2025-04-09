package com.xworkz.toString.external;

import com.xworkz.toString.internal.Egg;

    public class EggRunner {
        public static void main(String[] args) {
            Egg egg1 = new Egg("Chicken", "White", 60.0, 6.5);
            Egg egg2 = new Egg("Duck", "Brown", 70.0, 9.0);

            System.out.println(egg1);
            System.out.println(egg2);
        }
    }
