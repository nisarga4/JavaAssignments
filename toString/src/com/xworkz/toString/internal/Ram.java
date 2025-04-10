package com.xworkz.toString.internal;

public class Ram {
    private String type;
    private int capacity;
    private int speed;

    public Ram(String type, int capacity, int speed) {
        this.type = type;
        this.capacity = capacity;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "Type='" + type + '\'' +
                ", Capacity=" + capacity + "GB" +
                ", Speed=" + speed + "MHz" +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 80005;
    }
}
