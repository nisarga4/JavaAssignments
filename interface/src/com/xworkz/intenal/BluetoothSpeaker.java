package com.xworkz.intenal;
import com.xworkz.interfacee.Speaker;
public class BluetoothSpeaker implements Speaker {
    public void connect() {
        System.out.println("Bluetooth speaker connected.");
    }

    public void playSound() {
        System.out.println("Playing sound...");
    }

    public void disconnect() {
        System.out.println("Bluetooth speaker disconnected.");
    }

    @Override
    public void increaseVolume() {

    }

    @Override
    public void decreaseVolume() {

    }

    @Override
    public void mute() {

    }
}

