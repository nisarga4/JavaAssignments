package com.xworkz.hybridlevel;

class Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

interface Electric {
    void charge();
}

class ElectricCar extends Car implements Electric {
    public void charge() {
        System.out.println("Electric car is charging.");
    }
}
