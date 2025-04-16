package com.xworkz.intenal;

import com.xworkz.internal.Vehicle;

public class Car implements Vehicle {
    public void start() {
        System.out.println("Car starting...");
    }

    public void accelerate() {
        System.out.println("Car accelerating...");
    }

    public void stop() {
        System.out.println("Car stopping...");
    }
}
