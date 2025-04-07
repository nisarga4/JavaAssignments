package com.xworkz.inheritance;
    public class MRFTyre extends Tyre {

        public void radial() {
            System.out.println("MRF Tyre radial support...");
        }

        @Override
        public void compress() {
            super.compress();
            System.out.println("Running compress in MRFTyre");
        }

        @Override
        public void expand() {
            super.expand();
            System.out.println("Running expand in MRFTyre");
        }

        @Override
        public void bend() {
            super.bend();
            System.out.println("Running bend in MRFTyre");
        }

        @Override
        public void stretch() {
            super.stretch();
            System.out.println("Running stretch in MRFTyre");
        }

        @Override
        public void melt() {
            super.melt();
            System.out.println("Running melt in MRFTyre");
        }

        @Override
        public void bounce() {
            super.bounce();
            System.out.println("Running bounce in MRFTyre");
        }
    }

