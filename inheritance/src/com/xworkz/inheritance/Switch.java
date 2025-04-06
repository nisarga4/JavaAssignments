package com.xworkz.inheritance;

    public class Switch extends Fan {

        @Override
        public void turnOn() {
            super.turnOn();
            System.out.println("Running turnOn in Switch");
        }

        @Override
        public void turnOff() {
            super.turnOff();
            System.out.println("Running turnOff in Switch");
        }

        @Override
        public void increaseSpeed() {
            super.increaseSpeed();
            System.out.println("Running increaseSpeed in Switch");
        }

        @Override
        public void decreaseSpeed() {
            super.decreaseSpeed();
            System.out.println("Running decreaseSpeed in Switch");
        }

        @Override
        public void rotate() {
            super.rotate();
            System.out.println("Running rotate in Switch");
        }
    }

