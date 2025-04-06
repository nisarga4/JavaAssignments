package com.xworkz.inheritance;

    public class Nail extends Hammer {

        @Override
        public void hit() {
            super.hit();
            System.out.println("Running hit in Nail");
        }

        @Override
        public void lift() {
            super.lift();
            System.out.println("Running lift in Nail");
        }

        @Override
        public void drop() {
            super.drop();
            System.out.println("Running drop in Nail");
        }

        @Override
        public void clean() {
            super.clean();
            System.out.println("Running clean in Nail");
        }

        @Override
        public void store() {
            super.store();
            System.out.println("Running store in Nail");
        }
    }


