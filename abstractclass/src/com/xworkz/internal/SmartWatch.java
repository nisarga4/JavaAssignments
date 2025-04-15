package com.xworkz.internal;


    public class SmartWatch extends Gadget {

        @Override
        void operate() {
            System.out.println("Operating the smartwatch.");
        }

        @Override
        public void charge() {
            super.charge();
        }
    }
