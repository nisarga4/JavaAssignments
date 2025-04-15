package com.xworkz.singlelevel;
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Riding the bike.");
    }
}
