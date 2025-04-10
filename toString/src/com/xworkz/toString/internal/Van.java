package com.xworkz.toString.internal;

public class Van {
    private String brand;
    private int capacity;
    private boolean isCommercial;

    public Van(String brand, int capacity, boolean isCommercial) {
        this.brand = brand;
        this.capacity = capacity;
        this.isCommercial = isCommercial;
    }

    @Override
    public String toString() {
        return "Van{" +
                "Brand='" + brand + '\'' +
                ", Capacity=" + capacity +
                ", Commercial=" + (isCommercial ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 80003;
    }
}
