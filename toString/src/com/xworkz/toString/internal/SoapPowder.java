package com.xworkz.toString.internal;

public class SoapPowder {
    private String brand;
    private double weight;
    private boolean fragrance;

    public SoapPowder(String brand, double weight, boolean fragrance) {
        this.brand = brand;
        this.weight = weight;
        this.fragrance = fragrance;
    }

    @Override
    public String toString() {
        return "SoapPowder{" +
                "Brand='" + brand + '\'' +
                ", Weight=" + weight + "kg" +
                ", Fragrance=" + (fragrance ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 37037;
    }
}
