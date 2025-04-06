package com.xworkz.inheritance;

    public class Leaf extends Tree {

        @Override
        public void grow() {
            super.grow();
            System.out.println("Running grow in Leaf");
        }

        @Override
        public void photosynthesize() {
            super.photosynthesize();
            System.out.println("Running photosynthesize in Leaf");
        }

        @Override
        public void shedLeaves() {
            super.shedLeaves();
            System.out.println("Running shedLeaves in Leaf");
        }

        @Override
        public void provideShade() {
            super.provideShade();
            System.out.println("Running provideShade in Leaf");
        }

        @Override
        public void absorbWater() {
            super.absorbWater();
            System.out.println("Running absorbWater in Leaf");
        }
    }
