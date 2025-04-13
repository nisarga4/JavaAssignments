package com.xworkz.toString.internal;

public class WashingPowder {
    private String brand;
    private double weight;
    private String fragrance;

    public WashingPowder(String brand, double weight, String fragrance) {
        this.brand = brand;
        this.weight = weight;
        this.fragrance = fragrance;
    }

    @Override
    public String toString() {
        return "WashingPowder{Brand='" + brand + "', Weight=" + weight + " kg, Fragrance='" + fragrance + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 455;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof WashingPowder) {
                WashingPowder powder1 = this;
                WashingPowder powder2 = (WashingPowder) obj;
                if (powder1.brand.equals(powder2.brand) && powder1.weight == powder2.weight && powder1.fragrance.equals(powder2.fragrance)) {
                    return true;
                }
            }
        }
        return false;
    }
}
