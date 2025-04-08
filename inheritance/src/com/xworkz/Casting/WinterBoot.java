package com.xworkz.Casting;

    public class WinterBoot extends Boot {

        @Override
        public void wear() {
            System.out.println("Wearing winter boots to stay warm...");
        }

        @Override
        public void clean() {
            System.out.println("Cleaning snow off winter boots...");
        }

        @Override
        public void polish() {
            System.out.println("Applying waterproof polish on winter boots...");
        }

        public void useInSnow() {
            System.out.println("Walking through snow in winter boots...");
        }
    }
