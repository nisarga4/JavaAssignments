package com.xworkz.toString.internal;

public class Money {
    private double amount;
    private String currency;
    private String denomination;

    public Money(double amount, String currency, String denomination) {
        this.amount = amount;
        this.currency = currency;
        this.denomination = denomination;
    }

    @Override
    public String toString() {
        return "Money{Amount=" + amount + ", Currency='" + currency + "', Denomination='" + denomination + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 801;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Money) {
                Money money1 = this;
                Money money2 = (Money) obj;
                if (money1.amount == money2.amount && money1.currency.equals(money2.currency) && money1.denomination.equals(money2.denomination)) {
                    return true;
                }
            }
        }
        return false;
    }
}
