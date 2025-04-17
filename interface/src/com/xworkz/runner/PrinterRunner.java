package com.xworkz.runner;


import com.xworkz.intenal.LaserPrinter;
import com.xworkz.interfacee.Printer;

public class PrinterRunner {
    public static void main(String[] args) {
        Printer printer = new LaserPrinter();
        printer.turnOn();
        printer.printDocument();
        printer.turnOff();
    }
}

