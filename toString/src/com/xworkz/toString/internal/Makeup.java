package com.xworkz.toString.internal;

public class Makeup {
    private String product;
    private String brand;
    private double price;

    public Makeup(String product, String brand, double price) {
        this.product = product;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Makeup{" +
                "Product='" + product + '\'' +
                ", Brand='" + brand + '\'' +
                ", Price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 21021;
    }
}
