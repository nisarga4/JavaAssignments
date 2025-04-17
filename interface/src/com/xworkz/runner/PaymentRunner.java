package com.xworkz.runner;

import com.xworkz.intenal.UpiPayment;
import com.xworkz.interfacee.Payment;

public class PaymentRunner {
    public static void main(String[] args) {
        Payment payment = new UpiPayment();
        payment.initiate();
        payment.process();
        payment.confirm();
    }
}
