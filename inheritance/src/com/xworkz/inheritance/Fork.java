package com.xworkz.inheritance;


    public class Fork extends Knife {

        @Override
        public void cut() {
            super.cut();
            System.out.println("Running cut in Fork");
        }

        @Override
        public void sharpen() {
            super.sharpen();
            System.out.println("Running sharpen in Fork");
        }

        @Override
        public void clean() {
            super.clean();
            System.out.println("Running clean in Fork");
        }

        @Override
        public void store() {
            super.store();
            System.out.println("Running store in Fork");
        }

        @Override
        public void inspectBlade() {
            super.inspectBlade();
            System.out.println("Running inspectBlade in Fork");
        }
    }


