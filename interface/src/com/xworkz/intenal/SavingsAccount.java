package com.xworkz.intenal;

import com.xworkz.interfacee.BankAccount;

public class SavingsAccount implements BankAccount {
    public void deposit() {
        System.out.println("Depositing to savings account.");
    }

    public void withdraw() {
        System.out.println("Withdrawing from savings account.");
    }

    public void checkBalance() {
        System.out.println("Checking savings account balance.");
    }
}


