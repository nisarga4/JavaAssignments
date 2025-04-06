package com.xworkz.inheritance;

    public class Bat extends Baseball {

        @Override
        public void pitch() {
            super.pitch();
            System.out.println("Running pitch in Bat");
        }

        @Override
        public void catchBall() {
            super.catchBall();
            System.out.println("Running catchBall in Bat");
        }

        @Override
        public void throwBall() {
            super.throwBall();
            System.out.println("Running throwBall in Bat");
        }

        @Override
        public void warmUp() {
            super.warmUp();
            System.out.println("Running warmUp in Bat");
        }

        @Override
        public void play() {
            super.play();
            System.out.println("Running play in Bat");
        }
    }

