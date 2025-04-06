package com.xworkz.inheritance;


    public class Helmet extends Bicycle {

        @Override
        public void ride() {
            super.ride();
            System.out.println("Running ride in Helmet");
        }

        @Override
        public void brake() {
            super.brake();
            System.out.println("Running brake in Helmet");
        }

        @Override
        public void pedal() {
            super.pedal();
            System.out.println("Running pedal in Helmet");
        }

        @Override
        public void adjustSeat() {
            super.adjustSeat();
            System.out.println("Running adjustSeat in Helmet");
        }

        @Override
        public void park() {
            super.park();
            System.out.println("Running park in Helmet");
        }
    }


