package com.xworkz.toString.internal;

public class Bed {
    private String type;
    private String material;
    private double size; // in feet

    public Bed(String type, String material, double size) {
        this.type = type;
        this.material = material;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "Type='" + type + '\'' +
                ", Material='" + material + '\'' +
                ", Size=" + size + "ft" +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 777;
    }
}
