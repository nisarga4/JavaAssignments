package com.xworkz.toString.internal;

public class Sun {
    private String name;
    private double temperature;
    private String type;

    public Sun(String name, double temperature, String type) {
        this.name = name;
        this.temperature = temperature;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Sun{" +
                "name='" + name + '\'' +
                ", temperature=" + temperature + "°C" +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashCode: " + super.hashCode());
        return 65;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Sun) {
                System.out.println("Ref is Sun, comparing...");
                Sun sun1 = this;
                Sun sun2 = (Sun) obj;
                if (sun1.name.equals(sun2.name) && sun1.temperature == sun2.temperature && sun1.type.equals(sun2.type)) {
                    System.out.println("Both suns are the same");
                    return true;
                }
            }
        }
        return false;
    }
}
