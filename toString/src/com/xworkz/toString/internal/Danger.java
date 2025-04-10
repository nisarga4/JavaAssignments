package com.xworkz.toString.internal;

public class Danger {
    private String type;
    private int level;
    private boolean isAvoidable;

    public Danger(String type, int level, boolean isAvoidable) {
        this.type = type;
        this.level = level;
        this.isAvoidable = isAvoidable;
    }

    @Override
    public String toString() {
        return "Danger{" +
                "Type='" + type + '\'' +
                ", Level=" + level +
                ", Avoidable=" + (isAvoidable ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 80002;
    }
}
