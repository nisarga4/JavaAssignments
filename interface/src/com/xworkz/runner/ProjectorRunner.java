package com.xworkz.runner;

import com.xworkz.intenal.EpsonProjector;
import com.xworkz.interfacee.Projector;

public class ProjectorRunner {
    public static void main(String[] args) {
        Projector projector = new EpsonProjector();
        projector.powerOn();
        projector.display();
        projector.powerOff();
    }
}
