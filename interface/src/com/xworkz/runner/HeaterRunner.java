package com.xworkz.runner;

import com.xworkz.intenal.RoomHeater;
import com.xworkz.interfacee.Heater;

public class HeaterRunner {
    public static void main(String[] args) {
        Heater heater = new RoomHeater();
        heater.turnOn();
        heater.setTemperature();
        heater.turnOff();
    }
}
