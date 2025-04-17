package com.xworkz.runner;


import com.xworkz.intenal.SplitAC;
import com.xworkz.interfacee.AirConditioner;

public class AirConditionerRunner {
    public static void main(String[] args) {
        AirConditioner ac = new SplitAC();
        ac.turnOn();
        ac.setMode();
        ac.turnOff();
    }
}
