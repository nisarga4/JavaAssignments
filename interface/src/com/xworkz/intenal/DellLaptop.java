package com.xworkz.intenal;


import com.xworkz.interfacee.Laptop;

public class DellLaptop implements Laptop {
    public void boot() {
        System.out.println("Laptop booting...");
    }

    public void runProgram() {
        System.out.println("Running IntelliJ IDEA.");
    }

    public void shutDown() {
        System.out.println("Laptop shutting down.");
    }
}
