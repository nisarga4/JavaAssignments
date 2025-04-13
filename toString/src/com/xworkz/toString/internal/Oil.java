package com.xworkz.toString.internal;

public class Oil {
    private String brand;
    private String type;
    private double quantity;

    public Oil(String brand, String type, double quantity) {
        this.brand = brand;
        this.type = type;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Oil{" +
                "Brand='" + brand + '\'' +
                ", Type='" + type + '\'' +
                ", Quantity=" + quantity + "L" +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Oil) {
                Oil otherOil = (Oil) obj;
                return this.brand.equals(otherOil.brand) &&
                        this.type.equals(otherOil.type) &&
                        this.quantity == otherOil.quantity;
            }
        }
        return false;
    }
}
