package com.xworkz.toString.internal;

public class Temple {
    private String name;
    private String location;
    private boolean historic;

    public Temple(String name, String location, boolean historic) {
        this.name = name;
        this.location = location;
        this.historic = historic;
    }

    @Override
    public String toString() {
        return "Temple{" +
                "Name='" + name + '\'' +
                ", Location='" + location + '\'' +
                ", Historic=" + (historic ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 41041;
    }
}
