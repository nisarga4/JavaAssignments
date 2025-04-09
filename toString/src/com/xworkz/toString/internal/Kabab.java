package com.xworkz.toString.internal;
    public class Kabab {
        private String type;
        private String origin;
        private boolean isSpicy;
        private double price;

        public Kabab(String type, String origin, boolean isSpicy, double price) {
            this.type = type;
            this.origin = origin;
            this.isSpicy = isSpicy;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Kabab{" +
                    "Type='" + type + '\'' +
                    ", Origin='" + origin + '\'' +
                    ", Spicy=" + (isSpicy ? "Yes" : "No") +
                    ", Price=₹" + price +
                    '}';
        }
    }
