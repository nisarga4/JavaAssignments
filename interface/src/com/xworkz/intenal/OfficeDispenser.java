package com.xworkz.intenal;


import com.xworkz.interfacee.WaterDispenser;

public class OfficeDispenser implements WaterDispenser {
    public void dispenseCold() {
        System.out.println("Dispensing cold water.");
    }

    public void dispenseHot() {
        System.out.println("Dispensing hot water.");
    }

    public void stop() {
        System.out.println("Water dispensing stopped.");
    }
}
