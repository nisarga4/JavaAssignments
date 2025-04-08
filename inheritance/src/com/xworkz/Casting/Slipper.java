package com.xworkz.Casting;

    public class Slipper extends Footwear {

        @Override
        public void wear() {
            System.out.println("Wearing comfortable slippers...");
        }

        @Override
        public void clean() {
            System.out.println("Washing the slippers with water...");
        }

        public void goForWalk() {
            System.out.println("Going for a walk wearing slippers...");
        }
    }

