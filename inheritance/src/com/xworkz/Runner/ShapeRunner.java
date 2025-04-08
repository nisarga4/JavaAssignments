package com.xworkz.Runner;

import com.xworkz.Casting.Circle;
import com.xworkz.Casting.Shape;
import com.xworkz.Casting.ShapeHandler;

public class ShapeRunner {
        public static void main(String[] args) {
            Shape shape = new Circle(); // Upcasting
            ShapeHandler handler = new ShapeHandler();
            handler.handleShape(shape); // Pass parent type
        }
    }
