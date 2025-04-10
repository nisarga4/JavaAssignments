package com.xworkz.toString.internal;

public class Poision {
    private String type;
    private double quantity;
    private boolean isLethal;

    public Poision(String type, double quantity, boolean isLethal) {
        this.type = type;
        this.quantity = quantity;
        this.isLethal = isLethal;
    }

    @Override
    public String toString() {
        return "Poision{" +
                "Type='" + type + '\'' +
                ", Quantity=" + quantity + "ml" +
                ", Lethal=" + (isLethal ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 90004;
    }
}
