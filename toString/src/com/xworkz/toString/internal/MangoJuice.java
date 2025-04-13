package com.xworkz.toString.internal;

public class MangoJuice {
    private String brand;
    private double quantity;
    private boolean isSweetened;

    public MangoJuice(String brand, double quantity, boolean isSweetened) {
        this.brand = brand;
        this.quantity = quantity;
        this.isSweetened = isSweetened;
    }

    @Override
    public String toString() {
        return "MangoJuice{Brand='" + brand + "', Quantity=" + quantity + "L, Sweetened=" + isSweetened + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 606;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof MangoJuice) {
                MangoJuice j1 = this;
                MangoJuice j2 = (MangoJuice) obj;
                if (j1.brand.equals(j2.brand) && j1.quantity == j2.quantity && j1.isSweetened == j2.isSweetened) {
                    return true;
                }
            }
        }
        return false;
    }
}
