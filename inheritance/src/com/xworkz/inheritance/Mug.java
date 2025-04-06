package com.xworkz.inheritance;


    public class Mug extends Coffee {

        @Override
        public void brew() {
            super.brew();
            System.out.println("Running brew in Mug");
        }

        @Override
        public void pour() {
            super.pour();
            System.out.println("Running pour in Mug");
        }

        @Override
        public void stir() {
            super.stir();
            System.out.println("Running stir in Mug");
        }

        @Override
        public void serve() {
            super.serve();
            System.out.println("Running serve in Mug");
        }

        @Override
        public void drink() {
            super.drink();
            System.out.println("Running drink in Mug");
        }
    }

