package com.xworkz.runner;


import com.xworkz.intenal.SmartDevice;

public class SmartDeviceRunner {
    public static void main(String[] args) {
        SmartDevice device = new SmartDevice();

        device.print();
        device.capture();
        device.increaseVolume();
        device.makeEspresso();
        device.turnOn();
    }
}
