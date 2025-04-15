package com.xworkz.multilevel;
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Polygon extends Shape {
    void sides() {
        System.out.println("Polygon has multiple sides.");
    }
}

class Triangle extends Polygon {
    void triangleType() {
        System.out.println("This is a triangle.");
    }
}
