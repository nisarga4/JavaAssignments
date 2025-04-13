package com.xworkz.toString.internal;

public class Stick {
    private String material;
    private double length;
    private String color;

    public Stick(String material, double length, String color) {
        this.material = material;
        this.length = length;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Stick{" +
                "material='" + material + '\'' +
                ", length=" + length + " cm" +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashCode: " + super.hashCode());
        return 101;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Stick) {
                System.out.println("Ref is Stick, comparing...");
                Stick stick1 = this;
                Stick stick2 = (Stick) obj;
                if (stick1.material.equals(stick2.material) && stick1.length == stick2.length && stick1.color.equals(stick2.color)) {
                    System.out.println("Both Sticks are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
