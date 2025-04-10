package com.xworkz.toString.internal;

public class Earphone {
    private String brand;
    private boolean isWireless;
    private int batteryLife;

    public Earphone(String brand, boolean isWireless, int batteryLife) {
        this.brand = brand;
        this.isWireless = isWireless;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Earphone{" +
                "Brand='" + brand + '\'' +
                ", Wireless=" + (isWireless ? "Yes" : "No") +
                ", BatteryLife=" + batteryLife + "hrs" +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 80004;
    }
}
