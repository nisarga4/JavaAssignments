package com.xworkz.inheritance;


    public class Lens extends Camera {

        @Override
        public void powerOn() {
            super.powerOn();
            System.out.println("Running powerOn in Lens");
        }

        @Override
        public void capturePhoto() {
            super.capturePhoto();
            System.out.println("Running capturePhoto in Lens");
        }

        @Override
        public void recordVideo() {
            super.recordVideo();
            System.out.println("Running recordVideo in Lens");
        }

        @Override
        public void zoomIn() {
            super.zoomIn();
            System.out.println("Running zoomIn in Lens");
        }

        @Override
        public void powerOff() {
            super.powerOff();
            System.out.println("Running powerOff in Lens");
        }
    }

