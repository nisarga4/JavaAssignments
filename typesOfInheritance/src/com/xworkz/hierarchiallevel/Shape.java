package com.xworkz.hierarchiallevel;
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of circle.");
    }
}

class Square extends Shape {
    void area() {
        System.out.println("Area of square.");
    }
}

class Triangle extends Shape {
    void area() {
        System.out.println("Area of triangle.");
    }
}

