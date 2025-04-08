package com.xworkz.Casting;

    public class Banana extends Fruit {

        @Override
        public void peel() {
            System.out.println("Peeling the banana skin...");
        }

        @Override
        public void cut() {
            System.out.println("Cutting banana into slices...");
        }

        @Override
        public void serve() {
            System.out.println("Serving banana in a bowl...");
        }

        @Override
        public void eat() {
            System.out.println("Eating the banana...");
        }

        public void makeSmoothie() {
            System.out.println("Making banana smoothie...");
        }
    }
