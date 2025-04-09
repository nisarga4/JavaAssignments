package com.xworkz.toString.external;
import com.xworkz.toString.internal.Honey;

    public class HoneyRunner {
        public static void main(String[] args) {
            Honey honey1 = new Honey("Dabur", "Himalayas", true, 199.0);
            Honey honey2 = new Honey("Patanjali", "Forest", false, 150.0);

            System.out.println(honey1);
            System.out.println(honey2);
        }
    }
