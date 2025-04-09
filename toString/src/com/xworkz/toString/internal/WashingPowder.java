package com.xworkz.toString.internal;
    public class WashingPowder {
        private String brand;
        private int quantityInGrams;
        private String fragrance;
        private boolean isEcoFriendly;

        public WashingPowder(String brand, int quantityInGrams, String fragrance, boolean isEcoFriendly) {
            this.brand = brand;
            this.quantityInGrams = quantityInGrams;
            this.fragrance = fragrance;
            this.isEcoFriendly = isEcoFriendly;
        }

        @Override
        public String toString() {
            return "WashingPowder{" +
                    "Brand='" + brand + '\'' +
                    ", Quantity=" + quantityInGrams + "g" +
                    ", Fragrance='" + fragrance + '\'' +
                    ", EcoFriendly=" + (isEcoFriendly ? "Yes" : "No") +
                    '}';
        }
    }
