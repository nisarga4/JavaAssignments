package com.xworkz.toString.internal;

public class Tree {
    private String name;
    private int height;
    private boolean hasFruits;

    public Tree(String name, int height, boolean hasFruits) {
        this.name = name;
        this.height = height;
        this.hasFruits = hasFruits;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "Name='" + name + '\'' +
                ", Height=" + height + "ft" +
                ", HasFruits=" + (hasFruits ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 80008;
    }
}
