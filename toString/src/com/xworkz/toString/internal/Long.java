package com.xworkz.toString.internal;

public class Long {
    private String description;
    private double measurement;
    private boolean isFlexible;

    public Long(String description, double measurement, boolean isFlexible) {
        this.description = description;
        this.measurement = measurement;
        this.isFlexible = isFlexible;
    }

    @Override
    public String toString() {
        return "Long{" +
                "Description='" + description + '\'' +
                ", Measurement=" + measurement + "cm" +
                ", Flexible=" + (isFlexible ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 90013;
    }
}
