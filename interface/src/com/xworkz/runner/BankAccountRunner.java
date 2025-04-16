package com.xworkz.runner;

import com.xworkz.interfacee.SavingsAccount;
import com.xworkz.internal.BankAccount;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount();
        account.deposit();
        account.withdraw();
        account.checkBalance();
    }
}
