package com.xworkz.intenal;


import com.xworkz.interfacee.Calculator;

public class SimpleCalculator implements Calculator {
    public void add() {
        System.out.println("Addition done.");
    }

    public void subtract() {
        System.out.println("Subtraction done.");
    }

    public void multiply() {
        System.out.println("Multiplication done.");
    }
}
