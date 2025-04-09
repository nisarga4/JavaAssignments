package com.xworkz.toString.internal;
    public class Sun {
        private String type;
        private double diameter; // in kilometers
        private double temperature; // in Kelvin
        private boolean isVisible;

        public Sun(String type, double diameter, double temperature, boolean isVisible) {
            this.type = type;
            this.diameter = diameter;
            this.temperature = temperature;
            this.isVisible = isVisible;
        }

        @Override
        public String toString() {
            return "Sun{" +
                    "Type='" + type + '\'' +
                    ", Diameter=" + diameter + " km" +
                    ", Temperature=" + temperature + " K" +
                    ", IsVisible=" + (isVisible ? "Yes" : "No") +
                    '}';
        }
    }
