package com.xworkz.toString.internal;
    public class Engine {
        private String type;
        private int horsepower;
        private double displacement; // in liters
        private boolean isTurboCharged;

        public Engine(String type, int horsepower, double displacement, boolean isTurboCharged) {
            this.type = type;
            this.horsepower = horsepower;
            this.displacement = displacement;
            this.isTurboCharged = isTurboCharged;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "Type='" + type + '\'' +
                    ", Horsepower=" + horsepower +
                    ", Displacement=" + displacement + "L" +
                    ", TurboCharged=" + (isTurboCharged ? "Yes" : "No") +
                    '}';
        }
    }
