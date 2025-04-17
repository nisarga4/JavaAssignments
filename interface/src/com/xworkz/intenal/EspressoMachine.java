package com.xworkz.intenal;


import com.xworkz.interfacee.CoffeeMachine;

public class EspressoMachine implements CoffeeMachine {
    public void start() {
        System.out.println("Espresso machine started.");
    }

    public void brew() {
        System.out.println("Brewing coffee...");
    }

    public void stop() {
        System.out.println("Espresso machine stopped.");
    }
}
