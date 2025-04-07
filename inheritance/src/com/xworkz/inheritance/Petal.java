package com.xworkz.inheritance;
    public class Petal extends Flower {

        @Override
        public void bloom() {
            super.bloom();
            System.out.println("Running bloom in Petal");
        }

        @Override
        public void smell() {
            super.smell();
            System.out.println("Running smell in Petal");
        }

        @Override
        public void attractBees() {
            super.attractBees();
            System.out.println("Running attractBees in Petal");
        }

        @Override
        public void absorbSunlight() {
            super.absorbSunlight();
            System.out.println("Running absorbSunlight in Petal");
        }

        @Override
        public void grow() {
            super.grow();
            System.out.println("Running grow in Petal");
        }
    }
