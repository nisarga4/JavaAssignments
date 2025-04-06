package com.xworkz.isRelation;


import com.xworkz.inheritance.Switch;
import com.xworkz.inheritance.Fan;

    public class FanRunner {
        public static void main(String[] args) {
            Switch fanSwitch = new Switch();
            fanSwitch.turnOn();
            fanSwitch.turnOff();
            fanSwitch.increaseSpeed();
            fanSwitch.decreaseSpeed();
            fanSwitch.rotate();

            System.out.println("--------------------------------------");

            Fan fan = new Switch(); // Polymorphic reference
            fan.turnOn();
            fan.turnOff();
            fan.increaseSpeed();
            fan.decreaseSpeed();
            fan.rotate();
        }
    }

