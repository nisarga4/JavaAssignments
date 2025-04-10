package com.xworkz.toString.internal;

public class Sun {
    private String type;
    private double temperature;
    private boolean visible;

    public Sun(String type, double temperature, boolean visible) {
        this.type = type;
        this.temperature = temperature;
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "Sun{" +
                "Type='" + type + '\'' +
                ", Temperature=" + temperature + "K" +
                ", Visible=" + (visible ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 39039;
    }
}
