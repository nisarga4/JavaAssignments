package com.xworkz.toString.internal;
    public class Candy {
        private String name;
        private String flavor;
        private boolean isSugarFree;
        private double price;

        public Candy(String name, String flavor, boolean isSugarFree, double price) {
            this.name = name;
            this.flavor = flavor;
            this.isSugarFree = isSugarFree;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Candy{" +
                    "Name='" + name + '\'' +
                    ", Flavor='" + flavor + '\'' +
                    ", SugarFree=" + (isSugarFree ? "Yes" : "No") +
                    ", Price=₹" + price +
                    '}';
        }
    }
