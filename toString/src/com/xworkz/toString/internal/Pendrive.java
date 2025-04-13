package com.xworkz.toString.internal;

public class Pendrive {
    private String brand;
    private int capacity;  // in GB
    private String color;

    public Pendrive(String brand, int capacity, String color) {
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "Brand='" + brand + '\'' +
                ", Capacity=" + capacity + "GB" +
                ", Color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Pendrive) {
                Pendrive otherPendrive = (Pendrive) obj;
                return this.brand.equals(otherPendrive.brand) &&
                        this.capacity == otherPendrive.capacity &&
                        this.color.equals(otherPendrive.color);
            }
        }
        return false;
    }
}
