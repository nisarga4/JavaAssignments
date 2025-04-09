package com.xworkz.toString.internal;
    public class Honey {
        private String brand;
        private String origin;
        private boolean isOrganic;
        private double price; // per 500g

        public Honey(String brand, String origin, boolean isOrganic, double price) {
            this.brand = brand;
            this.origin = origin;
            this.isOrganic = isOrganic;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Honey{" +
                    "Brand='" + brand + '\'' +
                    ", Origin='" + origin + '\'' +
                    ", Organic=" + (isOrganic ? "Yes" : "No") +
                    ", Price=₹" + price + " per 500g" +
                    '}';
        }
    }