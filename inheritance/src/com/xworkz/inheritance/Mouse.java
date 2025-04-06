package com.xworkz.inheritance;


    public class Mouse extends Laptop {

        @Override
        public void powerOn() {
            super.powerOn();
            System.out.println("Running powerOn in Mouse");
        }

        @Override
        public void powerOff() {
            super.powerOff();
            System.out.println("Running powerOff in Mouse");
        }

        @Override
        public void runProgram() {
            super.runProgram();
            System.out.println("Running runProgram in Mouse");
        }

        @Override
        public void charge() {
            super.charge();
            System.out.println("Running charge in Mouse");
        }

        @Override
        public void shutdown() {
            super.shutdown();
            System.out.println("Running shutdown in Mouse");
        }
    }


