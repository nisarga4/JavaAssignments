package com.xworkz.toString.internal;
public class Smartwatch {

        private String brand;
        private String model;
        private boolean hasGPS;
        private double price;

        public Smartwatch(String brand, String model, boolean hasGPS, double price) {
            this.brand = brand;
            this.model = model;
            this.hasGPS = hasGPS;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Smartwatch{Brand='" + brand + "', Model='" + model + "', GPS=" + (hasGPS ? "Yes" : "No") + ", Price=₹" + price + "}";
        }
    }
