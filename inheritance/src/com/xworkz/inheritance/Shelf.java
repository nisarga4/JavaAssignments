package com.xworkz.inheritance;


    public class Shelf extends Book {

        @Override
        public void open() {
            super.open();
            System.out.println("Running open in Shelf");
        }

        @Override
        public void read() {
            super.read();
            System.out.println("Running read in Shelf");
        }

        @Override
        public void bookmark() {
            super.bookmark();
            System.out.println("Running bookmark in Shelf");
        }

        @Override
        public void close() {
            super.close();
            System.out.println("Running close in Shelf");
        }

        @Override
        public void store() {
            super.store();
            System.out.println("Running store in Shelf");
        }
    }

