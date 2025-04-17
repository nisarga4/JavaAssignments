package com.xworkz.intenal;


import com.xworkz.interfacee.Drone;

public class DeliveryDrone implements Drone {
    public void takeOff() {
        System.out.println("Drone taking off...");
    }

    public void fly() {
        System.out.println("Drone in flight.");
    }

    public void land() {
        System.out.println("Drone landing...");
    }
}
