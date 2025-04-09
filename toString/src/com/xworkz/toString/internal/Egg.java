package com.xworkz.toString.internal;

public class Egg {

        private String type;
        private String color;
        private double weight; // in grams
        private double price;

        public Egg(String type, String color, double weight, double price) {
            this.type = type;
            this.color = color;
            this.weight = weight;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Egg{" +
                    "Type='" + type + '\'' +
                    ", Color='" + color + '\'' +
                    ", Weight=" + weight + "g" +
                    ", Price=₹" + price +
                    '}';
        }
    }

