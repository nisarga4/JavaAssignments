package com.xworkz.runner;

import com.xworkz.intenal.SimpleCalculator;
import com.xworkz.interfacee.Calculator;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calc = new SimpleCalculator();
        calc.add();
        calc.subtract();
        calc.multiply();
    }
}
