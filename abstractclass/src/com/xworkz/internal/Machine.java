package com.xworkz.internal;

    public abstract class Machine {

        String model;
        String brand;
        int year;
        double weight;

        public Machine(String model, String brand, int year, double weight) {
            this.model = model;
            this.brand = brand;
            this.year = year;
            this.weight = weight;
        }

        public Machine(String model, String brand, int year) {
            this.model = model;
            this.brand = brand;
            this.year = year;
            this.weight = 0.0;
        }

        public Machine(String model, String brand) {
            this.model = model;
            this.brand = brand;
            this.year = 2023;
            this.weight = 0.0;
        }

        public abstract void specs();

        public void displayWeight() {
            System.out.println("Weight: " + weight);
        }
    }

