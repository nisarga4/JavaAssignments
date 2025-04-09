package com.xworkz.toString.internal;
    public class SoapPowder {
        private String brand;
        private double weight; // in kg
        private boolean isFragrant;
        private double price;

        public SoapPowder(String brand, double weight, boolean isFragrant, double price) {
            this.brand = brand;
            this.weight = weight;
            this.isFragrant = isFragrant;
            this.price = price;
        }

        @Override
        public String toString() {
            return "SoapPowder{" +
                    "Brand='" + brand + '\'' +
                    ", Weight=" + weight + "kg" +
                    ", Fragrant=" + (isFragrant ? "Yes" : "No") +
                    ", Price=₹" + price +
                    '}';
        }
    }
