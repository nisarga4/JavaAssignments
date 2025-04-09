package com.xworkz.toString.internal;
    public class Rasgulla {
        private String origin;
        private boolean isSpongy;
        private int quantity;
        private double price;

        public Rasgulla(String origin, boolean isSpongy, int quantity, double price) {
            this.origin = origin;
            this.isSpongy = isSpongy;
            this.quantity = quantity;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Rasgulla{" +
                    "Origin='" + origin + '\'' +
                    ", Spongy=" + (isSpongy ? "Yes" : "No") +
                    ", Quantity=" + quantity +
                    ", Price=₹" + price +
                    '}';
        }
    }
