package com.xworkz.hierarchiallevel;
class Device {
    void boot() {
        System.out.println("Device is booting.");
    }
}

class Laptop extends Device {
    void code() {
        System.out.println("Coding on laptop.");
    }
}

class Tablet extends Device {
    void draw() {
        System.out.println("Drawing on tablet.");
    }
}

class Phone extends Device {
    void call() {
        System.out.println("Calling from phone.");
    }
}
