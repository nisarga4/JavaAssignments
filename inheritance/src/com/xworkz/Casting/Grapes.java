package com.xworkz.Casting;

    public class Grapes extends Fruit {

        @Override
        public void wash() {
            System.out.println("Rinsing grapes thoroughly...");
        }

        @Override
        public void cut() {
            System.out.println("No need to cut grapes...");
        }

        @Override
        public void serve() {
            System.out.println("Serving grapes in a bunch...");
        }

        @Override
        public void eat() {
            System.out.println("Eating the grapes one by one...");
        }

        public void makeJuice() {
            System.out.println("Making fresh grape juice...");
        }
    }

