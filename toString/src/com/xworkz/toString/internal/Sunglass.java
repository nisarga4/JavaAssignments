package com.xworkz.toString.internal;

public class Sunglass {
    private String brand;
    private boolean polarized;
    private double price;

    public Sunglass(String brand, boolean polarized, double price) {
        this.brand = brand;
        this.polarized = polarized;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sunglass{" +
                "Brand='" + brand + '\'' +
                ", Polarized=" + (polarized ? "Yes" : "No") +
                ", Price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 40040;
    }
}
