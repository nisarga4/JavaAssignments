package com.xworkz.Casting;

    public class Microwave extends Appliance {

        @Override
        public void turnOn() {
            System.out.println("Microwave is turning on with beep...");
        }

        @Override
        public void turnOff() {
            System.out.println("Microwave is turning off...");
        }

        @Override
        public void operate() {
            System.out.println("Microwave is heating food...");
        }

        @Override
        public void clean() {
            System.out.println("Microwave interior is being wiped...");
        }

        @Override
        public void repair() {
            System.out.println("Microwave is being repaired by technician...");
        }

        public void setTimer() {
            System.out.println("Microwave timer is set to 2 minutes...");
        }
    }
