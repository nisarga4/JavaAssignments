package com.xworkz.inheritance;


    public class Chair extends Desk {

        @Override
        public void openDrawer() {
            super.openDrawer();
            System.out.println("Running openDrawer in Chair");
        }

        @Override
        public void closeDrawer() {
            super.closeDrawer();
            System.out.println("Running closeDrawer in Chair");
        }

        @Override
        public void cleanSurface() {
            super.cleanSurface();
            System.out.println("Running cleanSurface in Chair");
        }

        @Override
        public void organizeItems() {
            super.organizeItems();
            System.out.println("Running organizeItems in Chair");
        }

        @Override
        public void lockDesk() {
            super.lockDesk();
            System.out.println("Running lockDesk in Chair");
        }
    }

