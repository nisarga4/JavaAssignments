package com.xworkz.toString.internal;

public class Smartwatch {
    private String brand;
    private double price;
    private String features;

    public Smartwatch(String brand, double price, String features) {
        this.brand = brand;
        this.price = price;
        this.features = features;
    }

    @Override
    public String toString() {
        return "Smartwatch{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", features='" + features + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashCode: " + super.hashCode());
        return 123;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Smartwatch) {
                System.out.println("Ref is Smartwatch, comparing...");
                Smartwatch watch1 = this;
                Smartwatch watch2 = (Smartwatch) obj;
                if (watch1.brand.equals(watch2.brand) && watch1.price == watch2.price && watch1.features.equals(watch2.features)) {
                    System.out.println("Both Smartwatches are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
