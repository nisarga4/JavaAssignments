package com.xworkz.toString.internal;

public class Dam {
        private String name;
        private String location;
        private double height; // in meters
        private int yearOfCompletion;

        public Dam(String name, String location, double height, int yearOfCompletion) {
            this.name = name;
            this.location = location;
            this.height = height;
            this.yearOfCompletion = yearOfCompletion;
        }

        @Override
        public String toString() {
            return "Dam{" +
                    "Name='" + name + '\'' +
                    ", Location='" + location + '\'' +
                    ", Height=" + height + "m" +
                    ", YearOfCompletion=" + yearOfCompletion +
                    '}';
        }
    }

