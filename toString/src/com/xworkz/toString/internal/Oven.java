package com.xworkz.toString.internal;
    public class Oven {
        private String brand;
        private int capacity; // in liters
        private boolean isConvection;
        private double price;

        public Oven(String brand, int capacity, boolean isConvection, double price) {
            this.brand = brand;
            this.capacity = capacity;
            this.isConvection = isConvection;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Oven{" +
                    "Brand='" + brand + '\'' +
                    ", Capacity=" + capacity + "L" +
                    ", Convection=" + (isConvection ? "Yes" : "No") +
                    ", Price=₹" + price +
                    '}';
        }
    }