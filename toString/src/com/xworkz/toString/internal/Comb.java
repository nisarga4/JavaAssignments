package com.xworkz.toString.internal;

public class Comb {
    private String material;
    private int length;
    private String color;

    public Comb(String material, int length, String color) {
        this.material = material;
        this.length = length;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Comb{Material='" + material + "', Length=" + length + "cm, Color='" + color + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 123;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Comb) {
                System.out.println("Ref is Comb, will compare...");
                Comb comb1 = this;
                Comb comb2 = (Comb) obj;
                if (comb1.material.equals(comb2.material) && comb1.length == comb2.length && comb1.color.equals(comb2.color)) {
                    System.out.println("Both Combs are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
