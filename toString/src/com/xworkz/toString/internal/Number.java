package com.xworkz.toString.internal;

public class Number {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Number{" +
                "Value=" + value +
                '}';
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Number) {
                Number otherNumber = (Number) obj;
                return this.value == otherNumber.value;
            }
        }
        return false;
    }
}
