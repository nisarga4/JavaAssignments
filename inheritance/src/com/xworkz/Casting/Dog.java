package com.xworkz.Casting;

    public class Dog extends Animal {

        @Override
        public void eat() {
            System.out.println("Dog is eating bones...");
        }

        @Override
        public void sleep() {
            System.out.println("Dog is sleeping in the kennel...");
        }

        @Override
        public void move() {
            System.out.println("Dog is running...");
        }

        @Override
        public void makeSound() {
            System.out.println("Dog is barking...");
        }

        @Override
        public void breathe() {
            System.out.println("Dog is breathing through its nose...");
        }

        // Unique method in Dog class
        public void wagTail() {
            System.out.println("Dog is wagging its tail...");
        }
    }

