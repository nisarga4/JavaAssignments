package com.xworkz.toString.internal;
    public class Bus {
        private String numberPlate;
        private String route;
        private int capacity;
        private boolean isAC;

        public Bus(String numberPlate, String route, int capacity, boolean isAC) {
            this.numberPlate = numberPlate;
            this.route = route;
            this.capacity = capacity;
            this.isAC = isAC;
        }

        @Override
        public String toString() {
            return "Bus{" +
                    "NumberPlate='" + numberPlate + '\'' +
                    ", Route='" + route + '\'' +
                    ", Capacity=" + capacity +
                    ", AC=" + (isAC ? "Yes" : "No") +
                    '}';
        }
    }
