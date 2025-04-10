package com.xworkz.toString.internal;

public class Bulb {
    private String type;
    private int wattage;
    private boolean isLED;

    public Bulb(String type, int wattage, boolean isLED) {
        this.type = type;
        this.wattage = wattage;
        this.isLED = isLED;
    }

    @Override
    public String toString() {
        return "Bulb{" +
                "Type='" + type + '\'' +
                ", Wattage=" + wattage + "W" +
                ", LED=" + (isLED ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 90009;
    }
}
