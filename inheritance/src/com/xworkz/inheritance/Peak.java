package com.xworkz.inheritance;

    public class Peak extends Mountain {

        @Override
        public void rise() {
            super.rise();
            System.out.println("Running rise in Peak");
        }

        @Override
        public void attractTourists() {
            super.attractTourists();
            System.out.println("Running attractTourists in Peak");
        }

        @Override
        public void holdSnow() {
            super.holdSnow();
            System.out.println("Running holdSnow in Peak");
        }

        @Override
        public void supportWildlife() {
            super.supportWildlife();
            System.out.println("Running supportWildlife in Peak");
        }

        @Override
        public void provideView() {
            super.provideView();
            System.out.println("Running provideView in Peak");
        }
    }
