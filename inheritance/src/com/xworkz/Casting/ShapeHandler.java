package com.xworkz.Casting;

    public class ShapeHandler {

        public void handleShape(Shape shape) {
            shape.draw();
            shape.resize();
            shape.rotate();
            shape.move();
            shape.color();

            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                circle.calculateArea(); // Call unique method
            }
        }
    }