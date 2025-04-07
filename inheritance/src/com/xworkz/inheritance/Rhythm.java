package com.xworkz.inheritance;
    public class Rhythm extends Music {

        @Override
        public void play() {
            super.play();
            System.out.println("Running play in Rhythm");
        }

        @Override
        public void pause() {
            super.pause();
            System.out.println("Running pause in Rhythm");
        }

        @Override
        public void stop() {
            super.stop();
            System.out.println("Running stop in Rhythm");
        }

        @Override
        public void adjustVolume() {
            super.adjustVolume();
            System.out.println("Running adjustVolume in Rhythm");
        }

        @Override
        public void repeat() {
            super.repeat();
            System.out.println("Running repeat in Rhythm");
        }
    }
