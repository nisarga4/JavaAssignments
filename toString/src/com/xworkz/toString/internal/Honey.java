package com.xworkz.toString.internal;

public class Honey {
    private String type;
    private double quantity;
    private boolean isOrganic;

    public Honey(String type, double quantity, boolean isOrganic) {
        this.type = type;
        this.quantity = quantity;
        this.isOrganic = isOrganic;
    }

    @Override
    public String toString() {
        return "Honey{" +
                "Type='" + type + '\'' +
                ", Quantity=" + quantity + "ml" +
                ", Organic=" + (isOrganic ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 13013;
    }
}
