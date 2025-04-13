package com.xworkz.toString.internal;

public class Panipuri {
    private String flavor;
    private int quantity;
    private String size;

    public Panipuri(String flavor, int quantity, String size) {
        this.flavor = flavor;
        this.quantity = quantity;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Panipuri{" +
                "Flavor='" + flavor + '\'' +
                ", Quantity=" + quantity +
                ", Size='" + size + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Panipuri) {
                Panipuri otherPanipuri = (Panipuri) obj;
                return this.flavor.equals(otherPanipuri.flavor) &&
                        this.quantity == otherPanipuri.quantity &&
                        this.size.equals(otherPanipuri.size);
            }
        }
        return false;
    }
}
