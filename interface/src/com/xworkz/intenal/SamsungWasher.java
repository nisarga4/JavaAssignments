package com.xworkz.intenal;


import com.xworkz.interfacee.WashingMachine;

public class SamsungWasher implements WashingMachine {
    public void load() {
        System.out.println("Loading clothes...");
    }

    public void wash() {
        System.out.println("Washing clothes...");
    }

    public void dry() {
        System.out.println("Drying clothes...");
    }
}
