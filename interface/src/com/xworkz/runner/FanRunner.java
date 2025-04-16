package com.xworkz.runner;

import com.xworkz.intenal.CeilingFan;
import com.xworkz.internal.Fan;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new CeilingFan();
        fan.turnOn();
        fan.rotate();
        fan.turnOff();
    }
}
