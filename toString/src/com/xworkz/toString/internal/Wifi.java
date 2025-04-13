package com.xworkz.toString.internal;

public class Wifi {
    private String brand;
    private String type;
    private double speed;

    public Wifi(String brand, String type, double speed) {
        this.brand = brand;
        this.type = type;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Wifi{Brand='" + brand + "', Type='" + type + "', Speed=" + speed + " Mbps}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 672;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Wifi) {
                Wifi wifi1 = this;
                Wifi wifi2 = (Wifi) obj;
                if (wifi1.brand.equals(wifi2.brand) && wifi1.type.equals(wifi2.type) && wifi1.speed == wifi2.speed) {
                    return true;
                }
            }
        }
        return false;
    }
}
