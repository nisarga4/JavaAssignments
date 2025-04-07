package com.xworkz.inheritance;
    public class Atmosphere extends Planet {

        @Override
        public void rotate() {
            super.rotate();
            System.out.println("Running rotate in Atmosphere");
        }

        @Override
        public void revolve() {
            super.revolve();
            System.out.println("Running revolve in Atmosphere");
        }

        @Override
        public void supportLife() {
            super.supportLife();
            System.out.println("Running supportLife in Atmosphere");
        }

        @Override
        public void experienceSeasons() {
            super.experienceSeasons();
            System.out.println("Running experienceSeasons in Atmosphere");
        }

        @Override
        public void holdGravity() {
            super.holdGravity();
            System.out.println("Running holdGravity in Atmosphere");
        }
    }


