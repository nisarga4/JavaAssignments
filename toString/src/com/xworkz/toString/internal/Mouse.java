package com.xworkz.toString.internal;

public class Mouse {
    private String brand;
    private boolean wireless;
    private int dpi;

    public Mouse(String brand, boolean wireless, int dpi) {
        this.brand = brand;
        this.wireless = wireless;
        this.dpi = dpi;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "Brand='" + brand + '\'' +
                ", Wireless=" + (wireless ? "Yes" : "No") +
                ", DPI=" + dpi +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 53053;
    }
}
