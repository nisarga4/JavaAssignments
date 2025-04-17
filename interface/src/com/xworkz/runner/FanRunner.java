package com.xworkz.runner;


import com.xworkz.intenal.CeilingFan;
import com.xworkz.interfacee.Fan;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new CeilingFan();
        fan.start();
        fan.changeSpeed();
        fan.stop();
    }
}
