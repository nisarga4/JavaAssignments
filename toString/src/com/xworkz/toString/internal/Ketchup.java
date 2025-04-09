package com.xworkz.toString.internal;

    public class Ketchup {
        private String brand;
        private String flavor;
        private boolean isSpicy;
        private int quantityInMl;

        public Ketchup(String brand, String flavor, boolean isSpicy, int quantityInMl) {
            this.brand = brand;
            this.flavor = flavor;
            this.isSpicy = isSpicy;
            this.quantityInMl = quantityInMl;
        }

        @Override
        public String toString() {
            return "Ketchup{" +
                    "Brand='" + brand + '\'' +
                    ", Flavor='" + flavor + '\'' +
                    ", Spicy=" + (isSpicy ? "Yes" : "No") +
                    ", Quantity=" + quantityInMl + "ml" +
                    '}';
        }
    }
