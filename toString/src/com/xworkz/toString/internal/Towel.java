package com.xworkz.toString.internal;
    public class Towel {
        private String brand;
        private String color;
        private String material;
        private double length; // in cm

        public Towel(String brand, String color, String material, double length) {
            this.brand = brand;
            this.color = color;
            this.material = material;
            this.length = length;
        }

        @Override
        public String toString() {
            return "Towel{" +
                    "Brand='" + brand + '\'' +
                    ", Color='" + color + '\'' +
                    ", Material='" + material + '\'' +
                    ", Length=" + length + "cm" +
                    '}';
        }
    }
