package com.xworkz.toString.internal;

public class Battery {
    private String brand;
    private int capacity;
    private boolean isRechargeable;

    public Battery(String brand, int capacity, boolean isRechargeable) {
        this.brand = brand;
        this.capacity = capacity;
        this.isRechargeable = isRechargeable;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "Brand='" + brand + '\'' +
                ", Capacity=" + capacity + "mAh" +
                ", Rechargeable=" + (isRechargeable ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 90011;
    }
}
