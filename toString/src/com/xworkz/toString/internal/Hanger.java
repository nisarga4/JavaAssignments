package com.xworkz.toString.internal;

public class Hanger {
    private String material;
    private String type;
    private boolean isAdjustable;

    public Hanger(String material, String type, boolean isAdjustable) {
        this.material = material;
        this.type = type;
        this.isAdjustable = isAdjustable;
    }

    @Override
    public String toString() {
        return "Hanger{" +
                "Material='" + material + '\'' +
                ", Type='" + type + '\'' +
                ", Adjustable=" + (isAdjustable ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 11011;
    }
}
