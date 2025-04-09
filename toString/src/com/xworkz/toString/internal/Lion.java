package com.xworkz.toString.internal;


    public class Lion {
        private String name;
        private int age;
        private String gender;
        private String origin;

        public Lion(String name, int age, String gender, String origin) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.origin = origin;
        }

        @Override
        public String toString() {
            return "Lion{" +
                    "Name='" + name + '\'' +
                    ", Age=" + age +
                    ", Gender='" + gender + '\'' +
                    ", Origin='" + origin + '\'' +
                    '}';
        }
    }