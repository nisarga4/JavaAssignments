package com.xworkz.toString.external;

import com.xworkz.toString.internal.Rabbit;

    public class RabbitRunner {
        public static void main(String[] args) {
            Rabbit rabbit1 = new Rabbit("Snowy", "White", 2, 1.5);
            Rabbit rabbit2 = new Rabbit("Coco", "Brown", 3, 2.0);

            System.out.println(rabbit1);
            System.out.println(rabbit2);
        }
    }

