package com.xworkz.runner;


import com.xworkz.intenal.BluetoothSpeaker;
import com.xworkz.interfacee.Speaker;

public class SpeakerRunner {
    public static void main(String[] args) {
        Speaker speaker = new BluetoothSpeaker();
        speaker.connect();
        speaker.playSound();
        speaker.disconnect();
    }
}
