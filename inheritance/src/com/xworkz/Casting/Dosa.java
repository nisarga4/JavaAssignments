package com.xworkz.Casting;

    public class Dosa extends Idli {

        @Override
        public void steam() {
            System.out.println("No steaming needed for dosa!");
        }

        @Override
        public void serveWithChutney() {
            System.out.println("Serving dosa with tomato chutney...");
        }

        @Override
        public void serveWithSambar() {
            System.out.println("Serving crispy dosa with tangy sambar...");
        }

        @Override
        public void prepareBatter() {
            System.out.println("Preparing dosa batter with extra fermentation...");
        }

        @Override
        public void enjoy() {
            System.out.println("Enjoying crispy dosa!");
        }

        public void foldDosa() {
            System.out.println("Folding dosa perfectly for plating...");
        }
    }

