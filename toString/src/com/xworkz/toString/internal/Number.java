package com.xworkz.toString.internal;

public class Number {
    private int value;
    private boolean isEven;
    private String type;

    public Number(int value, boolean isEven, String type) {
        this.value = value;
        this.isEven = isEven;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Number{" +
                "Value=" + value +
                ", Even=" + (isEven ? "Yes" : "No") +
                ", Type='" + type + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 70002;
    }
}
