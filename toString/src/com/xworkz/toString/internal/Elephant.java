package com.xworkz.toString.internal;
    public class Elephant {
        private String name;
        private int age;
        private double weight; // in kg
        private String origin;

        public Elephant(String name, int age, double weight, String origin) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.origin = origin;
        }

        @Override
        public String toString() {
            return "Elephant{" +
                    "Name='" + name + '\'' +
                    ", Age=" + age + " years" +
                    ", Weight=" + weight + " kg" +
                    ", Origin='" + origin + '\'' +
                    '}';
        }
    }
