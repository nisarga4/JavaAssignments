package com.xworkz.inheritance;


    public class Cap extends Bottle {

        @Override
        public void open() {
            super.open();
            System.out.println("Running open in Cap");
        }

        @Override
        public void close() {
            super.close();
            System.out.println("Running close in Cap");
        }

        @Override
        public void fill() {
            super.fill();
            System.out.println("Running fill in Cap");
        }

        @Override
        public void empty() {
            super.empty();
            System.out.println("Running empty in Cap");
        }

        @Override
        public void shake() {
            super.shake();
            System.out.println("Running shake in Cap");
        }
    }


