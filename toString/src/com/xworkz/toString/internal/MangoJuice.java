package com.xworkz.toString.internal;

public class MangoJuice {
    private String brand;
    private int volume;
    private boolean withPulp;

    public MangoJuice(String brand, int volume, boolean withPulp) {
        this.brand = brand;
        this.volume = volume;
        this.withPulp = withPulp;
    }

    @Override
    public String toString() {
        return "MangoJuice{" +
                "Brand='" + brand + '\'' +
                ", Volume=" + volume + "ml" +
                ", WithPulp=" + (withPulp ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 22022;
    }
}
