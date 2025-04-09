package com.xworkz.toString.internal;

public class Apple {

        private String variety;
        private String color;
        private double weight; // in grams
        private double price;  // in rupees

        public Apple(String variety, String color, double weight, double price) {
            this.variety = variety;
            this.color = color;
            this.weight = weight;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "Variety='" + variety + '\'' +
                    ", Color='" + color + '\'' +
                    ", Weight=" + weight + "g" +
                    ", Price=₹" + price +
                    '}';
        }
    }
