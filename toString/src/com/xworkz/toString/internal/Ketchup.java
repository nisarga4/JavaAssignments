package com.xworkz.toString.internal;

public class Ketchup {
    private String brand;
    private int quantity;
    private boolean isTomatoBased;

    public Ketchup(String brand, int quantity, boolean isTomatoBased) {
        this.brand = brand;
        this.quantity = quantity;
        this.isTomatoBased = isTomatoBased;
    }

    @Override
    public String toString() {
        return "Ketchup{" +
                "Brand='" + brand + '\'' +
                ", Quantity=" + quantity + "ml" +
                ", TomatoBased=" + (isTomatoBased ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 17017;
    }
}
