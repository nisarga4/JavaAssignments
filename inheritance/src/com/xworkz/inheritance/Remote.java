package com.xworkz.inheritance;

    public class Remote extends TV {

        @Override
        public void turnOn() {
            super.turnOn();
            System.out.println("Running turnOn in Remote");
        }

        @Override
        public void turnOff() {
            super.turnOff();
            System.out.println("Running turnOff in Remote");
        }

        @Override
        public void changeChannel() {
            super.changeChannel();
            System.out.println("Running changeChannel in Remote");
        }

        @Override
        public void increaseVolume() {
            super.increaseVolume();
            System.out.println("Running increaseVolume in Remote");
        }

        @Override
        public void decreaseVolume() {
            super.decreaseVolume();
            System.out.println("Running decreaseVolume in Remote");
        }
    }

