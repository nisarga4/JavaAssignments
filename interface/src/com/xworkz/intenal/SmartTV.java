package com.xworkz.intenal;

import com.xworkz.interfacee.Television;

public class SmartTV implements Television {
    public void powerOn() {
        System.out.println("TV powered on.");
    }

    public void changeChannel() {
        System.out.println("Channel changed to National Geographic.");
    }

    public void powerOff() {
        System.out.println("TV powered off.");
    }
}
