package com.xworkz.toString.internal;

public class Vehicle {

        protected String brand;
        protected String model;
        protected int year;

        public Vehicle(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        @Override
        public String toString() {
            return "Vehicle{" +
                    "Brand='" + brand + '\'' +
                    ", Model='" + model + '\'' +
                    ", Year=" + year +
                    '}';
        }
    }

