package com.xworkz.toString.internal;

public class Fire {
    private String type;
    private double temperature;
    private String source;

    public Fire(String type, double temperature, String source) {
        this.type = type;
        this.temperature = temperature;
        this.source = source;
    }

    @Override
    public String toString() {
        return "Fire{Type='" + type + "', Temperature=" + temperature + "°C, Source='" + source + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 231;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Fire) {
                Fire fire1 = this;
                Fire fire2 = (Fire) obj;
                if (fire1.type.equals(fire2.type) && fire1.temperature == fire2.temperature && fire1.source.equals(fire2.source)) {
                    return true;
                }
            }
        }
        return false;
    }
}
