package com.xworkz.runner;


import com.xworkz.intenal.PodcastMic;
import com.xworkz.interfacee.Mic;

public class MicRunner {
    public static void main(String[] args) {
        Mic mic = new PodcastMic();
        mic.turnOn();
        mic.record();
        mic.turnOff();
    }
}
