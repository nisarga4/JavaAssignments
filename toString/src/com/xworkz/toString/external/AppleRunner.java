package com.xworkz.toString.external;
import com.xworkz.toString.internal.Apple;

    public class AppleRunner {
        public static void main(String[] args) {
            Apple apple1 = new Apple("Fuji", "Red", 180.0, 25.0);
            Apple apple2 = new Apple("Granny Smith", "Green", 200.0, 28.0);

            System.out.println(apple1);
            System.out.println(apple2);
        }
    }

