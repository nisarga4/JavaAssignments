package com.xworkz.Casting;

    public class Circle extends Shape {

        @Override
        public void draw() {
            System.out.println("Drawing a circle...");
        }

        @Override
        public void resize() {
            System.out.println("Resizing the circle...");
        }

        @Override
        public void rotate() {
            System.out.println("Rotating the circle...");
        }

        @Override
        public void move() {
            System.out.println("Moving the circle...");
        }

        @Override
        public void color() {
            System.out.println("Coloring the circle...");
        }

        // Unique method
        public void calculateArea() {
            System.out.println("Calculating area of the circle...");
        }
    }