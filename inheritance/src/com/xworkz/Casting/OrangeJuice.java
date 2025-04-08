package com.xworkz.Casting;

    public class OrangeJuice extends Juice {

        @Override
        public void extract() {
            System.out.println("Extracting juice from fresh oranges...");
        }

        @Override
        public void filter() {
            System.out.println("Filtering orange pulp carefully...");
        }

        @Override
        public void addSugar() {
            System.out.println("Adding little sugar (optional)...");
        }

        @Override
        public void chill() {
            System.out.println("Chilling orange juice to perfection...");
        }

        @Override
        public void serve() {
            System.out.println("Serving orange juice with a slice of orange...");
        }

        public void addVitaminC() {
            System.out.println("Boosting with extra Vitamin C!");
        }
    }
