package com.xworkz.toString.internal;

public class Dosa {
    private String type;
    private boolean isCrispy;
    private double price;

    public Dosa(String type, boolean isCrispy, double price) {
        this.type = type;
        this.isCrispy = isCrispy;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dosa{" +
                "Type='" + type + '\'' +
                ", Crispy=" + (isCrispy ? "Yes" : "No") +
                ", Price=₹" + price +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 9090;
    }
}
