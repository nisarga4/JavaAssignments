package com.xworkz.toString.internal;

public class Nature {
    private String type;
    private boolean isProtected;
    private String location;

    public Nature(String type, boolean isProtected, String location) {
        this.type = type;
        this.isProtected = isProtected;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Nature{" +
                "Type='" + type + '\'' +
                ", Protected=" + (isProtected ? "Yes" : "No") +
                ", Location='" + location + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 25025;
    }
}
