package com.xworkz.inheritance;
    public class Level extends Game {

        @Override
        public void start() {
            super.start();
            System.out.println("Running start in Level");
        }

        @Override
        public void play() {
            super.play();
            System.out.println("Running play in Level");
        }

        @Override
        public void pause() {
            super.pause();
            System.out.println("Running pause in Level");
        }

        @Override
        public void save() {
            super.save();
            System.out.println("Running save in Level");
        }

        @Override
        public void end() {
            super.end();
            System.out.println("Running end in Level");
        }
    }
