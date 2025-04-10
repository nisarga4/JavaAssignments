package com.xworkz.toString.internal;

public class Cover {
    private String material;
    private String size;
    private boolean waterproof;

    public Cover(String material, String size, boolean waterproof) {
        this.material = material;
        this.size = size;
        this.waterproof = waterproof;
    }

    @Override
    public String toString() {
        return "Cover{" +
                "Material='" + material + '\'' +
                ", Size='" + size + '\'' +
                ", Waterproof=" + (waterproof ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 60202;
    }
}
