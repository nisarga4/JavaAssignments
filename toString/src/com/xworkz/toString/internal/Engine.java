package com.xworkz.toString.internal;

public class Engine {
    private String type;
    private int horsepower;
    private double weight;

    public Engine(String type, int horsepower, double weight) {
        this.type = type;
        this.horsepower = horsepower;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Engine{Type='" + type + "', Horsepower=" + horsepower + " HP, Weight=" + weight + " kg}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 987;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Engine) {
                Engine engine1 = this;
                Engine engine2 = (Engine) obj;
                if (engine1.type.equals(engine2.type) && engine1.horsepower == engine2.horsepower && engine1.weight == engine2.weight) {
                    return true;
                }
            }
        }
        return false;
    }
}
