package com.xworkz.toString.internal;

    public class Bed {
        private String size;
        private String material;
        private boolean hasStorage;
        private double price;

        public Bed(String size, String material, boolean hasStorage, double price) {
            this.size = size;
            this.material = material;
            this.hasStorage = hasStorage;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Bed{" +
                    "Size='" + size + '\'' +
                    ", Material='" + material + '\'' +
                    ", HasStorage=" + (hasStorage ? "Yes" : "No") +
                    ", Price=₹" + price +
                    '}';
        }
    }
