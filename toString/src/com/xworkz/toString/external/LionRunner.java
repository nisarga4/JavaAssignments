package com.xworkz.toString.external;
import com.xworkz.toString.internal.Lion;

    public class LionRunner {
        public static void main(String[] args) {
            Lion lion1 = new Lion("Simba", 5, "Male", "Africa");
            Lion lion2 = new Lion("Nala", 4, "Female", "India");

            System.out.println(lion1);
            System.out.println(lion2);
        }
    }
