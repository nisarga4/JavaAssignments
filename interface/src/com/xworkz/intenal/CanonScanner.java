package com.xworkz.intenal;

import com.xworkz.interfacee.Scanner;

public class CanonScanner implements Scanner {
    public void openLid() {
        System.out.println("Lid opened.");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }

    public void closeLid() {
        System.out.println("Lid closed.");
    }
}
