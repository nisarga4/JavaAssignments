package com.xworkz.toString.internal;

public class Cover {
    private String material;
    private String color;
    private String size;

    public Cover(String material, String color, String size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Cover{Material='" + material + "', Color='" + color + "', Size='" + size + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 456;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Cover) {
                System.out.println("Ref is Cover, will compare...");
                Cover cover1 = this;
                Cover cover2 = (Cover) obj;
                if (cover1.material.equals(cover2.material) && cover1.color.equals(cover2.color) && cover1.size.equals(cover2.size)) {
                    System.out.println("Both Covers are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
