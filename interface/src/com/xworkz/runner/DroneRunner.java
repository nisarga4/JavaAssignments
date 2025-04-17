package com.xworkz.runner;


import com.xworkz.intenal.DeliveryDrone;
import com.xworkz.interfacee.Drone;

public class DroneRunner {
    public static void main(String[] args) {
        Drone drone = new DeliveryDrone();
        drone.takeOff();
        drone.fly();
        drone.land();
    }
}
