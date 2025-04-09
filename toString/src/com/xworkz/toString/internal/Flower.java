package com.xworkz.toString.internal;

    public class Flower {
        private String name;
        private String color;
        private boolean isFragrant;
        private double pricePerStem; // in rupees

        public Flower(String name, String color, boolean isFragrant, double pricePerStem) {
            this.name = name;
            this.color = color;
            this.isFragrant = isFragrant;
            this.pricePerStem = pricePerStem;
        }

        @Override
        public String toString() {
            return "Flower{" +
                    "Name='" + name + '\'' +
                    ", Color='" + color + '\'' +
                    ", IsFragrant=" + (isFragrant ? "Yes" : "No") +
                    ", PricePerStem=₹" + pricePerStem +
                    '}';
        }
    }
