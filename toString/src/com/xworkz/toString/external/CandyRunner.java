package com.xworkz.toString.external;
import com.xworkz.toString.internal.Candy;

    public class CandyRunner {
        public static void main(String[] args) {
            Candy candy1 = new Candy("Mango Bite", "Mango", false, 1.0);
            Candy candy2 = new Candy("Chocoblast", "Chocolate", true, 2.5);

            System.out.println(candy1);
            System.out.println(candy2);
        }
    }
