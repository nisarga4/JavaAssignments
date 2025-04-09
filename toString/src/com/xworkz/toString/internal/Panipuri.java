package com.xworkz.toString.internal;

    public class Panipuri {
        private String waterFlavor;
        private boolean isSpicy;
        private int quantity;
        private double price;

        public Panipuri(String waterFlavor, boolean isSpicy, int quantity, double price) {
            this.waterFlavor = waterFlavor;
            this.isSpicy = isSpicy;
            this.quantity = quantity;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Panipuri{" +
                    "WaterFlavor='" + waterFlavor + '\'' +
                    ", Spicy=" + (isSpicy ? "Yes" : "No") +
                    ", Quantity=" + quantity +
                    ", Price=₹" + price +
                    '}';
        }
    }
