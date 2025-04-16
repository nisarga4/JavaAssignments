package com.xworkz.intenal;

import com.xworkz.internal.TV;

public class SmartTV implements TV {
    public void switchOn() {
        System.out.println("Smart TV switched on.");
    }

    public void changeChannel() {
        System.out.println("Changing TV channel...");
    }

    public void switchOff() {
        System.out.println("Smart TV switched off.");
    }
}
