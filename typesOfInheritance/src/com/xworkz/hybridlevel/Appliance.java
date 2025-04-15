package com.xworkz.hybridlevel;

class Appliance {
    void turnOn() {
        System.out.println("Appliance turned on.");
    }
}

class WashingMachine extends Appliance {
    void washClothes() {
        System.out.println("Washing clothes...");
    }
}

interface SmartControl {
    void schedule();
}

class SmartWasher extends WashingMachine implements SmartControl {
    public void schedule() {
        System.out.println("Washing scheduled via app.");
    }
}
