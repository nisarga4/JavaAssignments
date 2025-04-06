package com.xworkz.inheritance;

    public class Curtain extends Window {

        @Override
        public void open() {
            super.open();
            System.out.println("Running open in Curtain");
        }

        @Override
        public void close() {
            super.close();
            System.out.println("Running close in Curtain");
        }

        @Override
        public void lock() {
            super.lock();
            System.out.println("Running lock in Curtain");
        }

        @Override
        public void unlock() {
            super.unlock();
            System.out.println("Running unlock in Curtain");
        }

        @Override
        public void clean() {
            super.clean();
            System.out.println("Running clean in Curtain");
        }
    }

