package com.xworkz.toString.internal;
    public class Rabbit {
        private String name;
        private String color;
        private int age;
        private double weight; // in kg

        public Rabbit(String name, String color, int age, double weight) {
            this.name = name;
            this.color = color;
            this.age = age;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Rabbit{" +
                    "Name='" + name + '\'' +
                    ", Color='" + color + '\'' +
                    ", Age=" + age + " years" +
                    ", Weight=" + weight + " kg" +
                    '}';
        }
    }
