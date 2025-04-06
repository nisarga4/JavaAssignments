package com.xworkz.inheritance;

    public class Tire extends Car {

        @Override
        public void start() {
            super.start();
            System.out.println("Running start in Tire");
        }

        @Override
        public void stop() {
            super.stop();
            System.out.println("Running stop in Tire");
        }

        @Override
        public void refuel() {
            super.refuel();
            System.out.println("Running refuel in Tire");
        }

        @Override
        public void service() {
            super.service();
            System.out.println("Running service in Tire");
        }

        @Override
        public void park() {
            super.park();
            System.out.println("Running park in Tire");
        }
    }


