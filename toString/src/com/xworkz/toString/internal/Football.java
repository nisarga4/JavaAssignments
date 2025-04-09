package com.xworkz.toString.internal;

    public class Football {
        private String brand;
        private String color;
        private String material;
        private double price;

        public Football(String brand, String color, String material, double price) {
            this.brand = brand;
            this.color = color;
            this.material = material;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Football{" +
                    "Brand='" + brand + '\'' +
                    ", Color='" + color + '\'' +
                    ", Material='" + material + '\'' +
                    ", Price=₹" + price +
                    '}';
        }
    }

