package com.xworkz.toString.internal;

public class Angle {
    private String type;
    private double degree;
    private boolean isAcute;

    public Angle(String type, double degree, boolean isAcute) {
        this.type = type;
        this.degree = degree;
        this.isAcute = isAcute;
    }

    @Override
    public String toString() {
        return "Angle{" +
                "Type='" + type + '\'' +
                ", Degree=" + degree +
                ", Acute=" + (isAcute ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 49049;
    }
}
