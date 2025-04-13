package com.xworkz.toString.internal;

public class Chain {
    private String material;
    private double length;
    private String color;

    public Chain(String material, double length, String color) {
        this.material = material;
        this.length = length;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Chain{Material='" + material + "', Length=" + length + "cm, Color='" + color + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 150;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Chain) {
                System.out.println("Ref is Chain, will compare...");
                Chain chain1 = this;
                Chain chain2 = (Chain) obj;
                if (chain1.material.equals(chain2.material) && chain1.length == chain2.length && chain1.color.equals(chain2.color)) {
                    System.out.println("Both Chains are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
