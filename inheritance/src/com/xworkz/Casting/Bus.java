package com.xworkz.Casting;

    public class Bus extends Vehicle {

        @Override
        public void start() {
            System.out.println("Bus is starting with a roar...");
        }

        @Override
        public void stop() {
            System.out.println("Bus is coming to a halt...");
        }

        @Override
        public void accelerate() {
            System.out.println("Bus is picking up speed...");
        }

        @Override
        public void brake() {
            System.out.println("Bus is slowing down...");
        }

        @Override
        public void refuel() {
            System.out.println("Bus is getting diesel fuel...");
        }

        public void announceStop() {
            System.out.println("Bus announces the next stop...");
        }
    }

