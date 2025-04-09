package com.xworkz.toString.internal;
    public class Eagle {
        private String species;
        private double wingspan; // in meters
        private String habitat;
        private boolean isEndangered;

        public Eagle(String species, double wingspan, String habitat, boolean isEndangered) {
            this.species = species;
            this.wingspan = wingspan;
            this.habitat = habitat;
            this.isEndangered = isEndangered;
        }

        @Override
        public String toString() {
            return "Eagle{" +
                    "Species='" + species + '\'' +
                    ", Wingspan=" + wingspan + " m" +
                    ", Habitat='" + habitat + '\'' +
                    ", Endangered=" + (isEndangered ? "Yes" : "No") +
                    '}';
        }
    }
