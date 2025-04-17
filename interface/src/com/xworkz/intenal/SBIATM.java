package com.xworkz.intenal;

import com.xworkz.interfacee.ATM;

public class SBIATM implements ATM {
    public void insertCard() {
        System.out.println("Card inserted in SBI ATM.");
    }

    public void enterPin() {
        System.out.println("PIN entered.");
    }

    public void withdrawCash() {
        System.out.println("Cash withdrawn from SBI ATM.");
    }
}
