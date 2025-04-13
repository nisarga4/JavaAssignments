package com.xworkz.toString.internal;

public class Ketchup {
    private String brand;
    private int quantity;
    private String flavor;

    public Ketchup(String brand, int quantity, String flavor) {
        this.brand = brand;
        this.quantity = quantity;
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Ketchup{Brand='" + brand + "', Quantity=" + quantity + "ml, Flavor='" + flavor + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 303;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Ketchup) {
                Ketchup ketchup1 = this;
                Ketchup ketchup2 = (Ketchup) obj;
                if (ketchup1.brand.equals(ketchup2.brand) && ketchup1.quantity == ketchup2.quantity && ketchup1.flavor.equals(ketchup2.flavor)) {
                    return true;
                }
            }
        }
        return false;
    }
}
