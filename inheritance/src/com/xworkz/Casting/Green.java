package com.xworkz.Casting;
    public class Green extends Color {

        @Override
        public void mix() {
            System.out.println("Mixing green with other tones...");
        }

        @Override
        public void apply() {
            System.out.println("Applying green color...");
        }

        public void blendWithNature() {
            System.out.println("Green blends beautifully with nature.");
        }
    }