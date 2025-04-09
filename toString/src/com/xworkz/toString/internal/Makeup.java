package com.xworkz.toString.internal;
    public class Makeup {
        private String productType;
        private String brand;
        private String shade;
        private boolean waterproof;

        public Makeup(String productType, String brand, String shade, boolean waterproof) {
            this.productType = productType;
            this.brand = brand;
            this.shade = shade;
            this.waterproof = waterproof;
        }

        @Override
        public String toString() {
            return "Makeup{" +
                    "ProductType='" + productType + '\'' +
                    ", Brand='" + brand + '\'' +
                    ", Shade='" + shade + '\'' +
                    ", Waterproof=" + (waterproof ? "Yes" : "No") +
                    '}';
        }
    }
