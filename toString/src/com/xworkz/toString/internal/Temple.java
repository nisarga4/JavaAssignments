package com.xworkz.toString.internal;
    public class Temple {
        private String name;
        private String location;
        private boolean isFamous;
        private int establishedYear;

        public Temple(String name, String location, boolean isFamous, int establishedYear) {
            this.name = name;
            this.location = location;
            this.isFamous = isFamous;
            this.establishedYear = establishedYear;
        }

        @Override
        public String toString() {
            return "Temple{" +
                    "Name='" + name + '\'' +
                    ", Location='" + location + '\'' +
                    ", Famous=" + (isFamous ? "Yes" : "No") +
                    ", EstablishedYear=" + establishedYear +
                    '}';
        }
    }