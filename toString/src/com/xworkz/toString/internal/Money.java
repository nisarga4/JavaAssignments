package com.xworkz.toString.internal;

public class Money {
    private String currency;
    private double amount;
    private boolean isDigital;

    public Money(String currency, double amount, boolean isDigital) {
        this.currency = currency;
        this.amount = amount;
        this.isDigital = isDigital;
    }

    @Override
    public String toString() {
        return "Money{" +
                "Currency='" + currency + '\'' +
                ", Amount=" + amount +
                ", Digital=" + (isDigital ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 23023;
    }
}
