package com.xworkz.toString.internal;
    public class Sunglass {
        private String brand;
        private String frameType;
        private boolean isPolarized;
        private double price;

        public Sunglass(String brand, String frameType, boolean isPolarized, double price) {
            this.brand = brand;
            this.frameType = frameType;
            this.isPolarized = isPolarized;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Sunglass{" +
                    "Brand='" + brand + '\'' +
                    ", FrameType='" + frameType + '\'' +
                    ", Polarized=" + (isPolarized ? "Yes" : "No") +
                    ", Price=₹" + price +
                    '}';
        }
    }
