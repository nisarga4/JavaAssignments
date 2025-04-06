package com.xworkz.inheritance;


    public class Keychain extends Wallet {

        @Override
        public void open() {
            super.open();
            System.out.println("Running open in Keychain");
        }

        @Override
        public void close() {
            super.close();
            System.out.println("Running close in Keychain");
        }

        @Override
        public void addCard() {
            super.addCard();
            System.out.println("Running addCard in Keychain");
        }

        @Override
        public void removeCard() {
            super.removeCard();
            System.out.println("Running removeCard in Keychain");
        }

        @Override
        public void checkMoney() {
            super.checkMoney();
            System.out.println("Running checkMoney in Keychain");
        }
    }
