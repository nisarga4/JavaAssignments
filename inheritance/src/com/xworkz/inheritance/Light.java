package com.xworkz.inheritance;


    public class Light extends Moon {

        @Override
        public void rise() {
            super.rise();
            System.out.println("Running rise in Light");
        }

        @Override
        public void set() {
            super.set();
            System.out.println("Running set in Light");
        }

        @Override
        public void reflectSunlight() {
            super.reflectSunlight();
            System.out.println("Running reflectSunlight in Light");
        }

        @Override
        public void changePhases() {
            super.changePhases();
            System.out.println("Running changePhases in Light");
        }

        @Override
        public void orbitEarth() {
            super.orbitEarth();
            System.out.println("Running orbitEarth in Light");
        }
    }
