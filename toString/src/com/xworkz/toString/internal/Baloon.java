package com.xworkz.toString.internal;

public class Baloon {
    private String color;
    private int size;
    private String shape;

    public Baloon(String color, int size, String shape) {
        this.color = color;
        this.size = size;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Baloon{Color='" + color + "', Size=" + size + ", Shape='" + shape + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 909;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Baloon) {
                System.out.println("Ref is Baloon, will compare...");
                Baloon baloon1 = this;
                Baloon baloon2 = (Baloon) obj;
                if (baloon1.color.equals(baloon2.color) &&
                        baloon1.size == baloon2.size &&
                        baloon1.shape.equals(baloon2.shape)) {
                    System.out.println("Both baloons are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
