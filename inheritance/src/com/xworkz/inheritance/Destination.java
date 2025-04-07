package com.xworkz.inheritance;
    public class Destination extends Journey {

        @Override
        public void begin() {
            super.begin();
            System.out.println("Running begin in Destination");
        }

        @Override
        public void travel() {
            super.travel();
            System.out.println("Running travel in Destination");
        }

        @Override
        public void explore() {
            super.explore();
            System.out.println("Running explore in Destination");
        }

        @Override
        public void faceChallenges() {
            super.faceChallenges();
            System.out.println("Running faceChallenges in Destination");
        }

        @Override
        public void conclude() {
            super.conclude();
            System.out.println("Running conclude in Destination");
        }
    }
