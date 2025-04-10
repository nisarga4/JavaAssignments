package com.xworkz.toString.internal;

public class Dam {
    private String name;
    private String location;
    private double capacity; // in TMC (Thousand Million Cubic feet)

    public Dam(String name, String location, double capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Dam{" +
                "Name='" + name + '\'' +
                ", Location='" + location + '\'' +
                ", Capacity=" + capacity + " TMC" +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 2468;
    }
}
