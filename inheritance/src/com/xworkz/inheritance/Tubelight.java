package com.xworkz.inheritance;


    public class Tubelight extends Lamp {

        @Override
        public void turnOn() {
            super.turnOn();
            System.out.println("Running turnOn in TubeLight");
        }

        @Override
        public void turnOff() {
            super.turnOff();
            System.out.println("Running turnOff in TubeLight");
        }

        @Override
        public void checkBulb() {
            super.checkBulb();
            System.out.println("Running checkBulb in TubeLight");
        }

        @Override
        public void clean() {
            super.clean();
            System.out.println("Running clean in TubeLight");
        }

        @Override
        public void moveToAnotherPlace() {
            super.moveToAnotherPlace();
            System.out.println("Running moveToAnotherPlace in TubeLight");
        }
    }


