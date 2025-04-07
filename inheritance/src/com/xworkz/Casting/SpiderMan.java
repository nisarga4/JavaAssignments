package com.xworkz.Casting;

    public class SpiderMan extends Hero {

        @Override
        public void savePeople() {
            System.out.println("SpiderMan is swinging through the city to save people!");
        }

        @Override
        public void fightCrime() {
            System.out.println("SpiderMan is fighting villains like Green Goblin!");
        }

        @Override
        public void patrolCity() {
            System.out.println("SpiderMan patrols Manhattan from rooftops.");
        }

        @Override
        public void usePower() {
            System.out.println("SpiderMan is using his spider-sense and web-shooters.");
        }

        @Override
        public void hideIdentity() {
            System.out.println("SpiderMan keeps his identity as Peter Parker secret.");
        }

        // Unique method
        public void swing() {
            System.out.println("SpiderMan is swinging between buildings!");
        }
    }
