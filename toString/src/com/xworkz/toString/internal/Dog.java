package com.xworkz.toString.internal;


    public class Dog {
        private String name;
        private String breed;
        private int age;
        private boolean isTrained;

        public Dog(String name, String breed, int age, boolean isTrained) {
            this.name = name;
            this.breed = breed;
            this.age = age;
            this.isTrained = isTrained;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "Name='" + name + '\'' +
                    ", Breed='" + breed + '\'' +
                    ", Age=" + age + " years" +
                    ", Trained=" + (isTrained ? "Yes" : "No") +
                    '}';
        }
    }

