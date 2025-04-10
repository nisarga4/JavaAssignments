package com.xworkz.toString.internal;

public class Stick {
    private String material;
    private double length;
    private boolean isUsedForSupport;

    public Stick(String material, double length, boolean isUsedForSupport) {
        this.material = material;
        this.length = length;
        this.isUsedForSupport = isUsedForSupport;
    }

    @Override
    public String toString() {
        return "Stick{" +
                "Material='" + material + '\'' +
                ", Length=" + length + "cm" +
                ", UsedForSupport=" + (isUsedForSupport ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 90007;
    }
}
