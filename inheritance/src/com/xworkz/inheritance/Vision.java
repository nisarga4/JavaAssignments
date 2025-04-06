package com.xworkz.inheritance;
    public class Vision extends Eye {

        @Override
        public void see() {
            super.see();
            System.out.println("Running see in Vision");
        }

        @Override
        public void blink() {
            super.blink();
            System.out.println("Running blink in Vision");
        }

        @Override
        public void focus() {
            super.focus();
            System.out.println("Running focus in Vision");
        }

        @Override
        public void senseLight() {
            super.senseLight();
            System.out.println("Running senseLight in Vision");
        }

        @Override
        public void tearUp() {
            super.tearUp();
            System.out.println("Running tearUp in Vision");
        }
    }

