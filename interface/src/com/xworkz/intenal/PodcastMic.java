package com.xworkz.intenal;


import com.xworkz.interfacee.Mic;

public class PodcastMic implements Mic {
    public void turnOn() {
        System.out.println("Mic is now ON.");
    }

    public void record() {
        System.out.println("Recording audio...");
    }

    public void turnOff() {
        System.out.println("Mic is now OFF.");
    }
}
