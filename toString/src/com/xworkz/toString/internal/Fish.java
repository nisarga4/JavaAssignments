package com.xworkz.toString.internal;

public class Fish {

        private String name;
        private String color;
        private double weight; // in kg
        private boolean isFreshwater;

        public Fish(String name, String color, double weight, boolean isFreshwater) {
            this.name = name;
            this.color = color;
            this.weight = weight;
            this.isFreshwater = isFreshwater;
        }

        @Override
        public String toString() {
            return "Fish{" +
                    "Name='" + name + '\'' +
                    ", Color='" + color + '\'' +
                    ", Weight=" + weight + "kg" +
                    ", Freshwater=" + (isFreshwater ? "Yes" : "No") +
                    '}';
        }
    }
