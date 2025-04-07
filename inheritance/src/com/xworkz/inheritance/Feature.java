package com.xworkz.inheritance;
    public class Feature extends App {

        @Override
        public void launch() {
            super.launch();
            System.out.println("Running launch in Feature");
        }

        @Override
        public void update() {
            super.update();
            System.out.println("Running update in Feature");
        }

        @Override
        public void install() {
            super.install();
            System.out.println("Running install in Feature");
        }

        @Override
        public void rate() {
            super.rate();
            System.out.println("Running rate in Feature");
        }

        @Override
        public void uninstall() {
            super.uninstall();
            System.out.println("Running uninstall in Feature");
        }
    }
