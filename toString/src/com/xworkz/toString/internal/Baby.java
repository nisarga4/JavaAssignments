package com.xworkz.toString.internal;

    public class Baby {
        private String name;
        private int ageInMonths;
        private double weight; // in kg
        private boolean isCrawling;

        public Baby(String name, int ageInMonths, double weight, boolean isCrawling) {
            this.name = name;
            this.ageInMonths = ageInMonths;
            this.weight = weight;
            this.isCrawling = isCrawling;
        }

        @Override
        public String toString() {
            return "Baby{" +
                    "Name='" + name + '\'' +
                    ", Age=" + ageInMonths + " months" +
                    ", Weight=" + weight + " kg" +
                    ", IsCrawling=" + (isCrawling ? "Yes" : "No") +
                    '}';
        }
    }
