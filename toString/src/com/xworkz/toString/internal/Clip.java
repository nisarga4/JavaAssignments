package com.xworkz.toString.internal;

public class Clip {
    private String material;
    private String color;
    private boolean reusable;

    public Clip(String material, String color, boolean reusable) {
        this.material = material;
        this.color = color;
        this.reusable = reusable;
    }

    @Override
    public String toString() {
        return "Clip{" +
                "Material='" + material + '\'' +
                ", Color='" + color + '\'' +
                ", Reusable=" + (reusable ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 54054;
    }
}
