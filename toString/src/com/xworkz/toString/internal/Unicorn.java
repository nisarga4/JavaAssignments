package com.xworkz.toString.internal;
    public class Unicorn {
        private String name;
        private String color;
        private boolean hasMagic;
        private double hornLength; // in cm

        public Unicorn(String name, String color, boolean hasMagic, double hornLength) {
            this.name = name;
            this.color = color;
            this.hasMagic = hasMagic;
            this.hornLength = hornLength;
        }

        @Override
        public String toString() {
            return "Unicorn{" +
                    "Name='" + name + '\'' +
                    ", Color='" + color + '\'' +
                    ", Magical=" + (hasMagic ? "Yes" : "No") +
                    ", HornLength=" + hornLength + " cm" +
                    '}';
        }
    }
