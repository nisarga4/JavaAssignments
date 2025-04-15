package com.xworkz.multilevel;

class Device {
    void power() {
        System.out.println("Device is powered.");
    }
}

class MediaDevice extends Device {
    void output() {
        System.out.println("Media device gives output.");
    }
}

class Television extends MediaDevice {
    void showChannels() {
        System.out.println("Television shows channels.");
    }
}

