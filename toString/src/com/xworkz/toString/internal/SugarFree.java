package com.xworkz.toString.internal;

    public class SugarFree {
        private String brand;
        private String type;
        private int quantity; // number of tablets or grams
        private boolean suitableForDiabetics;

        public SugarFree(String brand, String type, int quantity, boolean suitableForDiabetics) {
            this.brand = brand;
            this.type = type;
            this.quantity = quantity;
            this.suitableForDiabetics = suitableForDiabetics;
        }

        @Override
        public String toString() {
            return "SugarFree{" +
                    "Brand='" + brand + '\'' +
                    ", Type='" + type + '\'' +
                    ", Quantity=" + quantity +
                    ", SuitableForDiabetics=" + (suitableForDiabetics ? "Yes" : "No") +
                    '}';
        }
    }