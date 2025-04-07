package com.xworkz.Casting;

    public class Laptop extends Device {
        @Override
        public void start() {
            System.out.println("Laptop is booting up...");
        }

        @Override
        public void stop() {
            System.out.println("Laptop is shutting down...");
        }

        @Override
        public void charge() {
            System.out.println("Laptop is charging via USB-C...");
        }

        @Override
        public void restart() {
            System.out.println("Laptop is restarting with updates...");
        }

        @Override
        public void update() {
            System.out.println("Laptop is installing the latest OS patch...");
        }

        public void runIDE() {
            System.out.println("Laptop is running IntelliJ IDEA...");
        }
    }
