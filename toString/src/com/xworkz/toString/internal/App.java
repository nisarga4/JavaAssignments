package com.xworkz.toString.internal;
    public class App {
        private String name;
        private String developer;
        private double version;
        private boolean isFree;

        public App(String name, String developer, double version, boolean isFree) {
            this.name = name;
            this.developer = developer;
            this.version = version;
            this.isFree = isFree;
        }

        @Override
        public String toString() {
            return "App{" +
                    "Name='" + name + '\'' +
                    ", Developer='" + developer + '\'' +
                    ", Version=" + version +
                    ", IsFree=" + (isFree ? "Yes" : "No") +
                    '}';
        }
    }