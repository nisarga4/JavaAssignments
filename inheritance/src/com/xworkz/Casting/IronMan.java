package com.xworkz.Casting;

    public class IronMan extends Superhero {

        @Override
        public void fight() {
            System.out.println("IronMan is blasting enemies with repulsors...");
        }

        @Override
        public void fly() {
            System.out.println("IronMan is flying with his jet suit...");
        }

        @Override
        public void savePeople() {
            System.out.println("IronMan is saving people using advanced tech...");
        }

        @Override
        public void train() {
            System.out.println("IronMan is training in the lab with AI...");
        }

        @Override
        public void hideIdentity() {
            System.out.println("IronMan doesn't hide his identity...");
        }

        public void upgradeSuit() {
            System.out.println("IronMan is upgrading his suit with nanotech...");
        }
    }

