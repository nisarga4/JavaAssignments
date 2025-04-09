package com.xworkz.toString.internal;
    public class Frog {
        private String species;
        private String color;
        private boolean isPoisonous;
        private double weight; // in grams

        public Frog(String species, String color, boolean isPoisonous, double weight) {
            this.species = species;
            this.color = color;
            this.isPoisonous = isPoisonous;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Frog{" +
                    "Species='" + species + '\'' +
                    ", Color='" + color + '\'' +
                    ", Poisonous=" + (isPoisonous ? "Yes" : "No") +
                    ", Weight=" + weight + "g" +
                    '}';
        }
    }

