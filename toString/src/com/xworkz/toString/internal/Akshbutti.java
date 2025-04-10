package com.xworkz.toString.internal;

public class Akshbutti {
    private String material;
    private double height; // in cm
    private boolean isDecorated;
    private String usedOnOccasion;

    public Akshbutti(String material, double height, boolean isDecorated, String usedOnOccasion) {
        this.material = material;
        this.height = height;
        this.isDecorated = isDecorated;
        this.usedOnOccasion = usedOnOccasion;
    }

    @Override
    public String toString() {
        return "Akshbutti{" +
                "Material='" + material + '\'' +
                ", Height=" + height + "cm" +
                ", Decorated=" + (isDecorated ? "Yes" : "No") +
                ", UsedOnOccasion='" + usedOnOccasion + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 111;
    }
}
