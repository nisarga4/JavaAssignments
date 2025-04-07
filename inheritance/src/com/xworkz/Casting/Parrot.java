package com.xworkz.Casting;

    public class Parrot extends Bird {

        @Override
        public void fly() {
            System.out.println("Parrot is flying in circles...");
        }

        @Override
        public void sing() {
            System.out.println("Parrot is mimicking sounds...");
        }

        @Override
        public void buildNest() {
            System.out.println("Parrot is nesting in the hollow tree...");
        }

        @Override
        public void eat() {
            System.out.println("Parrot is eating fruits...");
        }

        @Override
        public void sleep() {
            System.out.println("Parrot sleeps with its head tucked...");
        }

        // Unique method
        public void talk() {
            System.out.println("Parrot is talking!");
        }
    }
