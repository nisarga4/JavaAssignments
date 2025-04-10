package com.xworkz.toString.internal;
public class Wifi {
    private String brand;
    private double speed; // in Mbps
    private boolean isConnected;

    public Wifi(String brand, double speed, boolean isConnected) {
        this.brand = brand;
        this.speed = speed;
        this.isConnected = isConnected;
    }

    @Override
    public String toString() {
        return "Wifi{" +
                "Brand='" + brand + '\'' +
                ", Speed=" + speed + "Mbps" +
                ", Connected=" + (isConnected ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 70003;
    }
}
