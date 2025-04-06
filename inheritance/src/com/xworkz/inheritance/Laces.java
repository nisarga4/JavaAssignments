package com.xworkz.inheritance;

    public class Laces extends Shoe {

        @Override
        public void wear() {
            super.wear();
            System.out.println("Running wear in Laces");
        }

        @Override
        public void remove() {
            super.remove();
            System.out.println("Running remove in Laces");
        }

        @Override
        public void clean() {
            super.clean();
            System.out.println("Running clean in Laces");
        }

        @Override
        public void polish() {
            super.polish();
            System.out.println("Running polish in Laces");
        }

        @Override
        public void store() {
            super.store();
            System.out.println("Running store in Laces");
        }
    }


