package com.xworkz.runner;


import com.xworkz.intenal.LGSmartMicrowave;
import com.xworkz.interfacee.Microwave;

public class MicrowaveRunner {
    public static void main(String[] args) {
        Microwave microwave = new LGSmartMicrowave();
        microwave.powerOn();
        microwave.heat();
        microwave.powerOff();
    }
}
