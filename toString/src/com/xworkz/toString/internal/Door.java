package com.xworkz.toString.internal;

public class Door {
    private String material;
    private double height;
    private boolean isAutomatic;

    public Door(String material, double height, boolean isAutomatic) {
        this.material = material;
        this.height = height;
        this.isAutomatic = isAutomatic;
    }

    @Override
    public String toString() {
        return "Door{" +
                "Material='" + material + '\'' +
                ", Height=" + height + "ft" +
                ", Automatic=" + (isAutomatic ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 90008;
    }
}
