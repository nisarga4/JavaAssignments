package com.xworkz.toString.internal;
    public class MangoJuice {
        private String brand;
        private int quantityInMl;
        private boolean isSugarFree;
        private double price;

        public MangoJuice(String brand, int quantityInMl, boolean isSugarFree, double price) {
            this.brand = brand;
            this.quantityInMl = quantityInMl;
            this.isSugarFree = isSugarFree;
            this.price = price;
        }

        @Override
        public String toString() {
            return "MangoJuice{" +
                    "Brand='" + brand + '\'' +
                    ", Quantity=" + quantityInMl + "ml" +
                    ", SugarFree=" + (isSugarFree ? "Yes" : "No") +
                    ", Price=₹" + price +
                    '}';
        }
    }
