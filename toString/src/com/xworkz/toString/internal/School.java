package com.xworkz.toString.internal;

    public class School {
        private String name;
        private String location;
        private int numberOfStudents;
        private boolean isPublic;

        public School(String name, String location, int numberOfStudents, boolean isPublic) {
            this.name = name;
            this.location = location;
            this.numberOfStudents = numberOfStudents;
            this.isPublic = isPublic;
        }

        @Override
        public String toString() {
            return "School{" +
                    "Name='" + name + '\'' +
                    ", Location='" + location + '\'' +
                    ", Students=" + numberOfStudents +
                    ", Public=" + (isPublic ? "Yes" : "No") +
                    '}';
        }
    }

