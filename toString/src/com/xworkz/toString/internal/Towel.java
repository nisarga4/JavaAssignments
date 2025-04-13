package com.xworkz.toString.internal;

public class Towel {
    private String color;
    private double size;  // Size in meters
    private String fabricType;

    public Towel(String color, double size, String fabricType) {
        this.color = color;
        this.size = size;
        this.fabricType = fabricType;
    }

    @Override
    public String toString() {
        return "Towel{Color='" + color + "', Size=" + size + " meters, Fabric Type='" + fabricType + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 120;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Towel) {
                Towel towel1 = this;
                Towel towel2 = (Towel) obj;
                if (towel1.color.equals(towel2.color) && towel1.size == towel2.size && towel1.fabricType.equals(towel2.fabricType)) {
                    return true;
                }
            }
        }
        return false;
    }
}
