package com.xworkz.toString.internal;

public class Ant {
        private String species;
        private String color;
        private double size; // in millimeters
        private boolean isQueen;

        public Ant(String species, String color, double size, boolean isQueen) {
            this.species = species;
            this.color = color;
            this.size = size;
            this.isQueen = isQueen;
        }

        @Override
        public String toString() {
            return "Ant{" +
                    "Species='" + species + '\'' +
                    ", Color='" + color + '\'' +
                    ", Size=" + size + " mm" +
                    ", IsQueen=" + (isQueen ? "Yes" : "No") +
                    '}';
        }
    }
