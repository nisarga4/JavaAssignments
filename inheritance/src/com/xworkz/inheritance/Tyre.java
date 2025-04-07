package com.xworkz.inheritance;

    public class Tyre extends Rubber {

        public void compress() {
            System.out.println("Tyre is compressing...");
        }

        @Override
        public void expand() {
            super.expand();
            System.out.println("Running expand in Tyre");
        }

        @Override
        public void bend() {
            super.bend();
            System.out.println("Running bend in Tyre");
        }

        @Override
        public void stretch() {
            super.stretch();
            System.out.println("Running stretch in Tyre");
        }

        @Override
        public void melt() {
            super.melt();
            System.out.println("Running melt in Tyre");
        }

        @Override
        public void bounce() {
            super.bounce();
            System.out.println("Running bounce in Tyre");
        }
    }

