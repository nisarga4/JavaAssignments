package com.xworkz.toString.internal;

public class Angle {
    private double degree;
    private String type;
    private String color;

    public Angle(double degree, String type, String color) {
        this.degree = degree;
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Angle{" +
                "degree=" + degree +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashCode: " + super.hashCode());
        return 21; // Custom hash code
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Angle) {
                System.out.println("Ref is instance of Angle");
                Angle angle1 = this;
                Angle angle2 = (Angle) obj;

                // Compare the properties of the Angle objects
                if (angle1.degree == angle2.degree && angle1.type.equals(angle2.type) && angle1.color.equals(angle2.color)) {
                    System.out.println("Both angles are the same");
                    return true;
                }
            }
        }
        return false;
    }
}
