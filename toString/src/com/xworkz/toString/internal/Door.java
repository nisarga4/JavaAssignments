package com.xworkz.toString.internal;

public class Door {
    private String material;
    private double size;  // Size in meters
    private String color;

    public Door(String material, double size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Door{Material='" + material + "', Size=" + size + " meters, Color='" + color + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 101;  // Returning a fixed hash code for simplicity
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Door) {
                System.out.println("Ref is Door, will compare...");
                Door door1 = this;
                Door door2 = (Door) obj;
                if (door1.material.equals(door2.material) && door1.size == door2.size && door1.color.equals(door2.color)) {
                    System.out.println("Both doors are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
