package com.xworkz.toString.internal;

public class Football {
    private String brand;
    private double size;
    private boolean isFIFAApproved;

    public Football(String brand, double size, boolean isFIFAApproved) {
        this.brand = brand;
        this.size = size;
        this.isFIFAApproved = isFIFAApproved;
    }

    @Override
    public String toString() {
        return "Football{" +
                "Brand='" + brand + '\'' +
                ", Size=" + size +
                ", FIFA Approved=" + (isFIFAApproved ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 9090;
    }
}
