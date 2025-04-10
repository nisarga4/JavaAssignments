package com.xworkz.toString.internal;

public class Color {
    private String name;
    private String hexCode;
    private boolean isPrimary;

    public Color(String name, String hexCode, boolean isPrimary) {
        this.name = name;
        this.hexCode = hexCode;
        this.isPrimary = isPrimary;
    }

    @Override
    public String toString() {
        return "Color{" +
                "Name='" + name + '\'' +
                ", HexCode='" + hexCode + '\'' +
                ", Primary=" + (isPrimary ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 5678;
    }
}
