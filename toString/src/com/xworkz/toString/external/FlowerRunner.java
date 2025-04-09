package com.xworkz.toString.external;
import com.xworkz.toString.internal.Flower;

    public class FlowerRunner {
        public static void main(String[] args) {
            Flower flower1 = new Flower("Rose", "Red", true, 15.0);
            Flower flower2 = new Flower("Tulip", "Yellow", false, 10.0);

            System.out.println(flower1);
            System.out.println(flower2);
        }
    }

