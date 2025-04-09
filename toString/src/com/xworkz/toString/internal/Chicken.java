package com.xworkz.toString.internal;
    public class Chicken {
        private String breed;
        private int age; // in months
        private boolean isForMeat;
        private String color;

        public Chicken(String breed, int age, boolean isForMeat, String color) {
            this.breed = breed;
            this.age = age;
            this.isForMeat = isForMeat;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Chicken{" +
                    "Breed='" + breed + '\'' +
                    ", Age=" + age + " months" +
                    ", ForMeat=" + (isForMeat ? "Yes" : "No") +
                    ", Color='" + color + '\'' +
                    '}';
        }
    }
