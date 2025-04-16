package com.xworkz.runner;

import com.xworkz.intenal.Car;
import com.xworkz.internal.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.accelerate();
        vehicle.stop();
    }
}
