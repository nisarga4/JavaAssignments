package com.xworkz.Casting;

    public class Heels extends Footwear {

        @Override
        public void wear() {
            System.out.println("Wearing stylish heels...");
        }

        @Override
        public void clean() {
            System.out.println("Cleaning heels with a soft cloth...");
        }

        @Override
        public void polish() {
            System.out.println("Polishing heels with care...");
        }

        public void walkOnRamp() {
            System.out.println("Walking confidently on the ramp in heels...");
        }
    }
