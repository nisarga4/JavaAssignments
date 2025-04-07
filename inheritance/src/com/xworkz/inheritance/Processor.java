package com.xworkz.inheritance;

    public class Processor extends Computer {

        @Override
        public void start() {
            super.start();
            System.out.println("Running start in Processor");
        }

        @Override
        public void shutdown() {
            super.shutdown();
            System.out.println("Running shutdown in Processor");
        }

        @Override
        public void compute() {
            super.compute();
            System.out.println("Running compute in Processor");
        }

        @Override
        public void connectToInternet() {
            super.connectToInternet();
            System.out.println("Running connectToInternet in Processor");
        }

        @Override
        public void storeData() {
            super.storeData();
            System.out.println("Running storeData in Processor");
        }
    }