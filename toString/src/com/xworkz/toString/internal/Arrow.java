package com.xworkz.toString.internal;

public class Arrow {
    private String material;
    private double length;
    private boolean isSharp;

    public Arrow(String material, double length, boolean isSharp) {
        this.material = material;
        this.length = length;
        this.isSharp = isSharp;
    }

    @Override
    public String toString() {
        return "Arrow{" +
                "Material='" + material + '\'' +
                ", Length=" + length + "cm" +
                ", Sharp=" + (isSharp ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 80007;
    }
}
