package com.xworkz.toString.internal;

public class Wall {
    private String material;
    private double height; // in meters
    private double width;  // in meters

    public Wall(String material, double height, double width) {
        this.material = material;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Wall{Material='" + material + "', Height=" + height + "m, Width=" + width + "m}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 123;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Wall) {
                Wall wall1 = this;
                Wall wall2 = (Wall) obj;
                if (wall1.material.equals(wall2.material) && wall1.height == wall2.height && wall1.width == wall2.width) {
                    return true;
                }
            }
        }
        return false;
    }
}
