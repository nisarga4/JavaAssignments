package com.xworkz.runner;


import com.xworkz.intenal.SamsungWasher;
import com.xworkz.interfacee.WashingMachine;

public class WashingMachineRunner {
    public static void main(String[] args) {
        WashingMachine wm = new SamsungWasher();
        wm.load();
        wm.wash();
        wm.dry();
    }
}
