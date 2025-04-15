package com.xworkz.singlelevel;
class Computer {
    void process() {
        System.out.println("Computer is processing data.");
    }
}

class Laptop extends Computer {
    void carry() {
        System.out.println("Laptop is portable.");
    }
}

