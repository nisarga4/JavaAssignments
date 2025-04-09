package com.xworkz.toString.external;
import com.xworkz.toString.internal.Chicken;

    public class ChickenRunner {
        public static void main(String[] args) {
            Chicken chicken1 = new Chicken("Broiler", 5, true, "White");
            Chicken chicken2 = new Chicken("Desi", 8, false, "Brown");

            System.out.println(chicken1);
            System.out.println(chicken2);
        }
    }
