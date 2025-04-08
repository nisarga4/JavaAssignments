package com.xworkz.Casting;

    public class SunHat extends Hat {

        @Override
        public void wear() {
            System.out.println("Wearing a sunhat to block sunlight...");
        }

        @Override
        public void clean() {
            System.out.println("Dusting off the sunhat...");
        }

        @Override
        public void store() {
            System.out.println("Storing the sunhat in a summer drawer...");
        }

        public void blockSunlight() {
            System.out.println("Sunhat is effectively blocking the sun.");
        }
    }
