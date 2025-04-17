package com.xworkz.runner;


import com.xworkz.interfacee.ATM;

public class ATMRunner {
    public static void main(String[] args) {
        ATM atm = new SBIATM();
        atm.insertCard();
        atm.enterPin();
        atm.withdrawCash();
    }
}
