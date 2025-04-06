package com.xworkz.inheritance;


    public class Rain extends Cloud {

        @Override
        public void floatInSky() {
            super.floatInSky();
            System.out.println("Running floatInSky in Rain");
        }

        @Override
        public void gatherMoisture() {
            super.gatherMoisture();
            System.out.println("Running gatherMoisture in Rain");
        }

        @Override
        public void reflectSunlight() {
            super.reflectSunlight();
            System.out.println("Running reflectSunlight in Rain");
        }

        @Override
        public void formShapes() {
            super.formShapes();
            System.out.println("Running formShapes in Rain");
        }

        @Override
        public void changeColor() {
            super.changeColor();
            System.out.println("Running changeColor in Rain");
        }
    }