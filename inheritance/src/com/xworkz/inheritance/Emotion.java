package com.xworkz.inheritance;

    public class Emotion extends Heart {

        @Override
        public void beat() {
            super.beat();
            System.out.println("Running beat in Emotion");
        }

        @Override
        public void pumpBlood() {
            super.pumpBlood();
            System.out.println("Running pumpBlood in Emotion");
        }

        @Override
        public void react() {
            super.react();
            System.out.println("Running react in Emotion");
        }

        @Override
        public void feel() {
            super.feel();
            System.out.println("Running feel in Emotion");
        }

        @Override
        public void rest() {
            super.rest();
            System.out.println("Running rest in Emotion");
        }
    }