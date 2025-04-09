package com.xworkz.toString.external;
import com.xworkz.toString.internal.Ketchup;

    public class KetchupRunner {
        public static void main(String[] args) {
            Ketchup ketchup1 = new Ketchup("Heinz", "Tomato", false, 500);
            Ketchup ketchup2 = new Ketchup("Maggi", "Chili Tomato", true, 200);

            System.out.println(ketchup1);
            System.out.println(ketchup2);
        }
    }
