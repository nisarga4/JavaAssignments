package com.xworkz.inheritance;
    public class Style extends Art {

        @Override
        public void create() {
            super.create();
            System.out.println("Running create in Style");
        }

        @Override
        public void display() {
            super.display();
            System.out.println("Running display in Style");
        }

        @Override
        public void inspire() {
            super.inspire();
            System.out.println("Running inspire in Style");
        }

        @Override
        public void express() {
            super.express();
            System.out.println("Running express in Style");
        }

        @Override
        public void preserve() {
            super.preserve();
            System.out.println("Running preserve in Style");
        }
    }
