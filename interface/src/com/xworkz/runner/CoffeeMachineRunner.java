package com.xworkz.runner;


import com.xworkz.intenal.EspressoMachine;
import com.xworkz.interfacee.CoffeeMachine;

public class CoffeeMachineRunner {
    public static void main(String[] args) {
        CoffeeMachine coffee = new EspressoMachine();
        coffee.start();
        coffee.brew();
        coffee.stop();
    }
}
