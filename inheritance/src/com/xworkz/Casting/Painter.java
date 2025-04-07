package com.xworkz.Casting;

    public class Painter extends Artist {

        @Override
        public void sketch() {
            System.out.println("Painter sketches outlines for painting...");
        }

        @Override
        public void paint() {
            System.out.println("Painter uses vibrant colors on canvas...");
        }

        @Override
        public void sculpt() {
            System.out.println("Painter rarely sculpts but understands the form...");
        }

        @Override
        public void design() {
            System.out.println("Painter designs beautiful compositions...");
        }

        @Override
        public void exhibit() {
            System.out.println("Painter exhibits work in galleries...");
        }

        public void mixColors() {
            System.out.println("Painter is mixing unique color palettes...");
        }
    }