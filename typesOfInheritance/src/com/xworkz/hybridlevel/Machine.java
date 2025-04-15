package com.xworkz.hybridlevel;
class Machine {
    void operate() {
        System.out.println("Machine operating.");
    }
}

class Printer extends Machine {
    void print() {
        System.out.println("Printing document...");
    }
}

interface Wireless {
    void connectWifi();
}

class SmartPrinter extends Printer implements Wireless {
    public void connectWifi() {
        System.out.println("Connected to WiFi.");
    }
}
