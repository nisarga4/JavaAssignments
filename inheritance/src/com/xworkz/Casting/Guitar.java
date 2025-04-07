package com.xworkz.Casting;

    public class Guitar extends Instrument {
        @Override
        public void play() {
            System.out.println("Guitar is strumming chords...");
        }

        @Override
        public void tune() {
            System.out.println("Guitar strings are being tuned...");
        }

        @Override
        public void clean() {
            System.out.println("Guitar is being polished...");
        }

        @Override
        public void repair() {
            System.out.println("Guitar is being repaired at the shop...");
        }

        @Override
        public void store() {
            System.out.println("Guitar is stored in a hard case...");
        }

        public void changeStrings() {
            System.out.println("Guitar strings are being changed...");
        }
    }

