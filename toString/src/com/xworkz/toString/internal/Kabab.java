package com.xworkz.toString.internal;

public class Kabab {
    private String type;
    private int quantity;
    private boolean isSpicy;

    public Kabab(String type, int quantity, boolean isSpicy) {
        this.type = type;
        this.quantity = quantity;
        this.isSpicy = isSpicy;
    }

    @Override
    public String toString() {
        return "Kabab{" +
                "Type='" + type + '\'' +
                ", Quantity=" + quantity +
                ", Spicy=" + (isSpicy ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 16016;
    }
}
