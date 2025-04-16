package com.xworkz.intenal;

import com.xworkz.interfacee.Heater;

public class RoomHeater implements Heater {
    public void turnOn() {
        System.out.println("Heater turned on.");
    }

    public void setTemperature() {
        System.out.println("Temperature set to 25°C.");
    }

    public void turnOff() {
        System.out.println("Heater turned off.");
    }
}
