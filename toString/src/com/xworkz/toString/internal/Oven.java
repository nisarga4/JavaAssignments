package com.xworkz.toString.internal;

public class Oven {
    private String brand;
    private double capacity;
    private String type;

    public Oven(String brand, double capacity, String type) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "Brand='" + brand + '\'' +
                ", Capacity=" + capacity + "L" +
                ", Type='" + type + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Oven) {
                Oven otherOven = (Oven) obj;
                return this.brand.equals(otherOven.brand) &&
                        this.capacity == otherOven.capacity &&
                        this.type.equals(otherOven.type);
            }
        }
        return false;
    }
}
