package com.xworkz.hierarchiallevel;
class Vehicle {
    void move() {
        System.out.println("Vehicle is moving.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding.");
    }
}

class Truck extends Vehicle {
    void load() {
        System.out.println("Truck is loading goods.");
    }
}

