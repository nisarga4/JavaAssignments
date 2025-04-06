package com.xworkz.inheritance;

    public class Screen extends Phone {

        @Override
        public void call() {
            super.call();
            System.out.println("Running call in Screen");
        }

        @Override
        public void text() {
            super.text();
            System.out.println("Running text in Screen");
        }

        @Override
        public void browse() {
            super.browse();
            System.out.println("Running browse in Screen");
        }

        @Override
        public void takePhoto() {
            super.takePhoto();
            System.out.println("Running takePhoto in Screen");
        }

        @Override
        public void charge() {
            super.charge();
            System.out.println("Running charge in Screen");
        }
    }

