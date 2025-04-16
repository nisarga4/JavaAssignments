package com.xworkz.runner;

import com.xworkz.interfacee.LaserPrinter;
import com.xworkz.internal.Printer;

public class PrinterRunner {
    public static void main(String[] args) {
        Printer printer = new LaserPrinter();
        printer.turnOn();
        printer.printDocument();
        printer.turnOff();
    }
}
