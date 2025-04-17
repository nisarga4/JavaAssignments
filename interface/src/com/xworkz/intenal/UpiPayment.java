package com.xworkz.intenal;


import com.xworkz.interfacee.Payment;

public class UpiPayment implements Payment {
    public void initiate() {
        System.out.println("UPI payment initiated.");
    }

    public void process() {
        System.out.println("Processing UPI payment...");
    }

    public void confirm() {
        System.out.println("UPI payment confirmed.");
    }
}
