package com.xworkz.Casting;

    public class Columbus extends Explorer {

        @Override
        public void explore() {
            System.out.println("Columbus is exploring the Atlantic Ocean...");
        }

        @Override
        public void navigate() {
            System.out.println("Columbus is navigating with a compass and stars...");
        }

        @Override
        public void recordJourney() {
            System.out.println("Columbus is documenting the New World journey...");
        }

        @Override
        public void gatherResources() {
            System.out.println("Columbus is collecting spices and goods...");
        }

        @Override
        public void meetLocals() {
            System.out.println("Columbus is encountering native tribes...");
        }

        public void discoverAmerica() {
            System.out.println("Columbus discovers America in 1492!");
        }
    }
