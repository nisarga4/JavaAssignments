package com.xworkz.inheritance;

    public class Speaker extends Microphone {

        @Override
        public void powerOn() {
            super.powerOn();
            System.out.println("Running powerOn in Speaker");
        }

        @Override
        public void powerOff() {
            super.powerOff();
            System.out.println("Running powerOff in Speaker");
        }

        @Override
        public void record() {
            super.record();
            System.out.println("Running record in Speaker");
        }

        @Override
        public void mute() {
            super.mute();
            System.out.println("Running mute in Speaker");
        }

        @Override
        public void unmute() {
            super.unmute();
            System.out.println("Running unmute in Speaker");
        }
    }
