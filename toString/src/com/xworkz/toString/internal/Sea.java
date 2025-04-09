package com.xworkz.toString.internal;


    public class Sea {
        private String name;
        private String location;
        private double area; //
        private int averageDepth;

        public Sea(String name, String location, double area, int averageDepth) {
            this.name = name;
            this.location = location;
            this.area = area;
            this.averageDepth = averageDepth;
        }

        @Override
        public String toString() {
            return "Sea{" +
                    "Name='" + name + '\'' +
                    ", Location='" + location + '\'' +
                    ", Area=" + area + " sq.km" +
                    ", AverageDepth=" + averageDepth + " m" +
                    '}';
        }
    }
