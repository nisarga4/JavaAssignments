package com.xworkz.inheritance;


    public class Sparkle extends Star {

        @Override
        public void shine() {
            super.shine();
            System.out.println("Running shine in Sparkle");
        }

        @Override
        public void twinkle() {
            super.twinkle();
            System.out.println("Running twinkle in Sparkle");
        }

        @Override
        public void emitLight() {
            super.emitLight();
            System.out.println("Running emitLight in Sparkle");
        }

        @Override
        public void burn() {
            super.burn();
            System.out.println("Running burn in Sparkle");
        }

        @Override
        public void stayInGalaxy() {
            super.stayInGalaxy();
            System.out.println("Running stayInGalaxy in Sparkle");
        }
    }

