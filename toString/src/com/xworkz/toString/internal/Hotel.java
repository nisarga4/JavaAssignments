package com.xworkz.toString.internal;

    public class Hotel {
        private String name;
        private String location;
        private int stars;
        private boolean hasWiFi;

        public Hotel(String name, String location, int stars, boolean hasWiFi) {
            this.name = name;
            this.location = location;
            this.stars = stars;
            this.hasWiFi = hasWiFi;
        }

        @Override
        public String toString() {
            return "HoHotelRunnertel{" +
                    "Name='" + name + '\'' +
                    ", Location='" + location + '\'' +
                    ", Stars=" + stars +
                    ", WiFi=" + (hasWiFi ? "Available" : "Not Available") +
                    '}';
        }
    }
