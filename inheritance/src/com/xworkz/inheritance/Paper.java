package com.xworkz.inheritance;


    public class Paper extends Pen {

        @Override
        public void write() {
            super.write();
            System.out.println("Running write in Paper");
        }

        @Override
        public void openCap() {
            super.openCap();
            System.out.println("Running openCap in Paper");
        }

        @Override
        public void closeCap() {
            super.closeCap();
            System.out.println("Running closeCap in Paper");
        }

        @Override
        public void refillInk() {
            super.refillInk();
            System.out.println("Running refillInk in Paper");
        }

        @Override
        public void store() {
            super.store();
            System.out.println("Running store in Paper");
        }
    }


