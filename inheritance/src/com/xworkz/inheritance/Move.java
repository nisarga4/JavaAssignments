package com.xworkz.inheritance;

    public class Move extends Dance {

        @Override
        public void start() {
            super.start();
            System.out.println("Running start in Move");
        }

        @Override
        public void perform() {
            super.perform();
            System.out.println("Running perform in Move");
        }

        @Override
        public void practice() {
            super.practice();
            System.out.println("Running practice in Move");
        }

        @Override
        public void express() {
            super.express();
            System.out.println("Running express in Move");
        }

        @Override
        public void end() {
            super.end();
            System.out.println("Running end in Move");
        }
    }
