package com.xworkz.toString.internal;

public class Rasgulla {
    private String sweetnessLevel;
    private boolean chilled;
    private int quantity;

    public Rasgulla(String sweetnessLevel, boolean chilled, int quantity) {
        this.sweetnessLevel = sweetnessLevel;
        this.chilled = chilled;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Rasgulla{" +
                "SweetnessLevel='" + sweetnessLevel + '\'' +
                ", Chilled=" + (chilled ? "Yes" : "No") +
                ", Quantity=" + quantity +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 32032;
    }
}
