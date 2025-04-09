package com.xworkz.toString.internal;
    public class Water {
        private String source;
        private boolean isDrinkable;
        private double pHLevel;
        private String color;

        public Water(String source, boolean isDrinkable, double pHLevel, String color) {
            this.source = source;
            this.isDrinkable = isDrinkable;
            this.pHLevel = pHLevel;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Water{" +
                    "Source='" + source + '\'' +
                    ", Drinkable=" + (isDrinkable ? "Yes" : "No") +
                    ", pHLevel=" + pHLevel +
                    ", Color='" + color + '\'' +
                    '}';
        }
    }
