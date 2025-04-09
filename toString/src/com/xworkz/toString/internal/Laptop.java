package com.xworkz.toString.internal;

public class Laptop {
        private String brand;
        private String processor;
        private int ram; // in GB
        private double price;

        public Laptop(String brand, String processor, int ram, double price) {
            this.brand = brand;
            this.processor = processor;
            this.ram = ram;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Laptop{" +
                    "Brand='" + brand + '\'' +
                    ", Processor='" + processor + '\'' +
                    ", RAM=" + ram + "GB" +
                    ", Price=₹" + price +
                    '}';
        }
    }
