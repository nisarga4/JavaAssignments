package com.xworkz.toString.internal;

public class Makeup {
    private String brand;
    private String productType;
    private double price;

    public Makeup(String brand, String productType, double price) {
        this.brand = brand;
        this.productType = productType;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Makeup{Brand='" + brand + "', ProductType='" + productType + "', Price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 303;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Makeup) {
                Makeup m1 = this;
                Makeup m2 = (Makeup) obj;
                if (m1.brand.equals(m2.brand) && m1.productType.equals(m2.productType) && m1.price == m2.price) {
                    return true;
                }
            }
        }
        return false;
    }
}
