package com.xworkz.runner;


import com.xworkz.intenal.CanonScanner;
import com.xworkz.interfacee.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {
        Scanner scanner = new CanonScanner();
        scanner.openLid();
        scanner.scan();
        scanner.closeLid();
    }
}
