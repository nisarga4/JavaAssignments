package com.xworkz.toString.internal;

public class IceCube {
    private double size;
    private boolean isClear;
    private String shape;

    public IceCube(double size, boolean isClear, String shape) {
        this.size = size;
        this.isClear = isClear;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "IceCube{" +
                "Size=" + size + "cm" +
                ", Clear=" + (isClear ? "Yes" : "No") +
                ", Shape='" + shape + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 15015;
    }
}
