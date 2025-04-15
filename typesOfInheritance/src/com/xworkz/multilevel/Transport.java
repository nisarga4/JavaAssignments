package com.xworkz.multilevel;

class Transport {
    void move() {
        System.out.println("Transport is moving.");
    }
}

class LandTransport extends Transport {
    void wheels() {
        System.out.println("Land transport has wheels.");
    }
}

class Car extends LandTransport {
    void drive() {
        System.out.println("Car is being driven.");
    }
}

