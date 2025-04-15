package com.xworkz.hierarchiallevel;
class Account {
    void open() {
        System.out.println("Opening an account.");
    }
}

class SavingAccount extends Account {
    void save() {
        System.out.println("Saving money.");
    }
}

class CurrentAccount extends Account {
    void businessTransaction() {
        System.out.println("Business transactions.");
    }
}

class LoanAccount extends Account {
    void loanDetails() {
        System.out.println("Loan account details.");
    }
}

