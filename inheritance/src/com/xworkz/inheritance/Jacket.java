package com.xworkz.inheritance;


    public class Jacket extends Jeans {

        @Override
        public void wear() {
            super.wear();
            System.out.println("Running wear in Jacket");
        }

        @Override
        public void wash() {
            super.wash();
            System.out.println("Running wash in Jacket");
        }

        @Override
        public void fold() {
            super.fold();
            System.out.println("Running fold in Jacket");
        }

        @Override
        public void iron() {
            super.iron();
            System.out.println("Running iron in Jacket");
        }

        @Override
        public void hang() {
            super.hang();
            System.out.println("Running hang in Jacket");
        }
    }
