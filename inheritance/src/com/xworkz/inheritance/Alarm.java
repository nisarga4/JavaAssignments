package com.xworkz.inheritance;


    public class Alarm extends Clock {

        @Override
        public void showTime() {
            super.showTime();
            System.out.println("Running showTime in Alarm");
        }

        @Override
        public void tick() {
            super.tick();
            System.out.println("Running tick in Alarm");
        }

        @Override
        public void adjustTime() {
            super.adjustTime();
            System.out.println("Running adjustTime in Alarm");
        }

        @Override
        public void stop() {
            super.stop();
            System.out.println("Running stop in Alarm");
        }

        @Override
        public void start() {
            super.start();
            System.out.println("Running start in Alarm");
        }
    }
