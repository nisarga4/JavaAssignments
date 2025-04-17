package com.xworkz.runner;


import com.xworkz.intenal.DellLaptop;
import com.xworkz.interfacee.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new DellLaptop();
        laptop.boot();
        laptop.runProgram();
        laptop.shutDown();
    }
}
