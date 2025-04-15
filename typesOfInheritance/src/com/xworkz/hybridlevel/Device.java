package com.xworkz.hybridlevel;

class Device {
    void powerOn() {
        System.out.println("Device powered on.");
    }
}

class SmartDevice extends Device {
    void boot() {
        System.out.println("Smart device booted.");
    }
}

interface Connectable {
    void connectToNetwork();
}

class SmartPhone extends SmartDevice implements Connectable {
    public void connectToNetwork() {
        System.out.println("SmartPhone connected to network.");
    }
}
