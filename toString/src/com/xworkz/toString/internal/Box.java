package com.xworkz.toString.internal;

public class Box {
    private String color;
    private double length;
    private double width;

    public Box(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Box{Color='" + color + "', Length=" + length + "cm, Width=" + width + "cm}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 89;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Box) {
                System.out.println("Ref is Box, will compare...");
                Box box1 = this;
                Box box2 = (Box) obj;
                if (box1.color.equals(box2.color) &&
                        box1.length == box2.length &&
                        box1.width == box2.width) {
                    System.out.println("Both boxes are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
