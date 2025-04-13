package com.xworkz.toString.internal;

public class Hanger {
    private String material;
    private String color;
    private double length;

    public Hanger(String material, String color, double length) {
        this.material = material;
        this.color = color;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Hanger{Material='" + material + "', Color='" + color + "', Length=" + length + "cm}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 200;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Hanger) {
                Hanger hanger1 = this;
                Hanger hanger2 = (Hanger) obj;
                if (hanger1.material.equals(hanger2.material) && hanger1.color.equals(hanger2.color) && hanger1.length == hanger2.length) {
                    return true;
                }
            }
        }
        return false;
    }
}
