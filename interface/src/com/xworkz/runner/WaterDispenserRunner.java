package com.xworkz.runner;


import com.xworkz.intenal.OfficeDispenser;
import com.xworkz.interfacee.WaterDispenser;

public class WaterDispenserRunner {
    public static void main(String[] args) {
        WaterDispenser dispenser = new OfficeDispenser();
        dispenser.dispenseCold();
        dispenser.dispenseHot();
        dispenser.stop();
    }
}
