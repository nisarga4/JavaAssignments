package com.xworkz.toString.internal;
    public class Wall {
        private String material;
        private double height; // in meters
        private double width;  // in meters
        private String color;

        public Wall(String material, double height, double width, String color) {
            this.material = material;
            this.height = height;
            this.width = width;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Wall{" +
                    "Material='" + material + '\'' +
                    ", Height=" + height + "m" +
                    ", Width=" + width + "m" +
                    ", Color='" + color + '\'' +
                    '}';
        }
    }