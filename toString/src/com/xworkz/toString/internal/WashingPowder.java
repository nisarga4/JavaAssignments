package com.xworkz.toString.internal;

public class WashingPowder {
    private String brand;
    private double quantity;
    private boolean forSensitiveSkin;

    public WashingPowder(String brand, double quantity, boolean forSensitiveSkin) {
        this.brand = brand;
        this.quantity = quantity;
        this.forSensitiveSkin = forSensitiveSkin;
    }

    @Override
    public String toString() {
        return "WashingPowder{" +
                "Brand='" + brand + '\'' +
                ", Quantity=" + quantity + "kg" +
                ", ForSensitiveSkin=" + (forSensitiveSkin ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 46046;
    }
}
