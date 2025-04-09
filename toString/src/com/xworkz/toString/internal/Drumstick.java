package com.xworkz.toString.internal;
    public class Drumstick {
        private String type;
        private double length; // in cm
        private boolean isOrganic;
        private double pricePerKg;

        public Drumstick(String type, double length, boolean isOrganic, double pricePerKg) {
            this.type = type;
            this.length = length;
            this.isOrganic = isOrganic;
            this.pricePerKg = pricePerKg;
        }

        @Override
        public String toString() {
            return "Drumstick{" +
                    "Type='" + type + '\'' +
                    ", Length=" + length + " cm" +
                    ", Organic=" + (isOrganic ? "Yes" : "No") +
                    ", PricePerKg=₹" + pricePerKg +
                    '}';
        }
    }
