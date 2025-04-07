package com.xworkz.inheritance;

    public class Thought extends Mind {

        @Override
        public void think() {
            super.think();
            System.out.println("Running think in Thought");
        }

        @Override
        public void imagine() {
            super.imagine();
            System.out.println("Running imagine in Thought");
        }

        @Override
        public void remember() {
            super.remember();
            System.out.println("Running remember in Thought");
        }

        @Override
        public void focus() {
            super.focus();
            System.out.println("Running focus in Thought");
        }

        @Override
        public void relax() {
            super.relax();
            System.out.println("Running relax in Thought");
        }
    }