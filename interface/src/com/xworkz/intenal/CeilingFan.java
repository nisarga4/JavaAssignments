package com.xworkz.intenal;


import com.xworkz.interfacee.Fan;

public class CeilingFan implements Fan {
    public void start() {
        System.out.println("Fan started.");
    }

    public void changeSpeed() {
        System.out.println("Speed changed to level 3.");
    }

    public void stop() {
        System.out.println("Fan stopped.");
    }
}

