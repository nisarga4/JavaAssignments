package com.xworkz.toString.internal;

public class Pocket {
    private String type;
    private boolean hasZipper;
    private String material;

    public Pocket(String type, boolean hasZipper, String material) {
        this.type = type;
        this.hasZipper = hasZipper;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Pocket{" +
                "Type='" + type + '\'' +
                ", Zipper=" + (hasZipper ? "Yes" : "No") +
                ", Material='" + material + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 90012;
    }
}
