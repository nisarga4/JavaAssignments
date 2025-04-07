package com.xworkz.inheritance;

    public class Feather extends Bird {

        @Override
        public void fly() {
            super.fly();
            System.out.println("Running fly in Feather");
        }

        @Override
        public void chirp() {
            super.chirp();
            System.out.println("Running chirp in Feather");
        }

        @Override
        public void buildNest() {
            super.buildNest();
            System.out.println("Running buildNest in Feather");
        }

        @Override
        public void layEggs() {
            super.layEggs();
            System.out.println("Running layEggs in Feather");
        }

        @Override
        public void migrate() {
            super.migrate();
            System.out.println("Running migrate in Feather");
        }
    }

