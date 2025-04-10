package com.xworkz.toString.internal;

public class Wall {
    private String color;
    private double height;
    private boolean hasWallpaper;

    public Wall(String color, double height, boolean hasWallpaper) {
        this.color = color;
        this.height = height;
        this.hasWallpaper = hasWallpaper;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "Color='" + color + '\'' +
                ", Height=" + height + "ft" +
                ", HasWallpaper=" + (hasWallpaper ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 45045;
    }
}
