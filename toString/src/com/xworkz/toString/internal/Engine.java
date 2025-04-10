package com.xworkz.toString.internal;

public class Engine {
    private String type;
    private int horsepower;
    private boolean isElectric;

    public Engine(String type, int horsepower, boolean isElectric) {
        this.type = type;
        this.horsepower = horsepower;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "Type='" + type + '\'' +
                ", Horsepower=" + horsepower +
                ", Electric=" + (isElectric ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 5050;
    }
}
