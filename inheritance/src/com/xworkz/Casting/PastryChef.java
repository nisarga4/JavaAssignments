package com.xworkz.Casting;

    public class PastryChef extends Chef {

        @Override
        public void prepareDish() {
            System.out.println("Pastry Chef is preparing desserts...");
        }

        @Override
        public void cook() {
            System.out.println("Pastry Chef is baking cakes and pastries...");
        }

        @Override
        public void cleanKitchen() {
            System.out.println("Pastry Chef is cleaning the pastry section...");
        }

        @Override
        public void planMenu() {
            System.out.println("Pastry Chef is planning dessert menu...");
        }

        @Override
        public void tasteFood() {
            System.out.println("Pastry Chef is tasting sweet treats...");
        }

        public void decorateCake() {
            System.out.println("Pastry Chef is decorating a beautiful cake!");
        }
    }
