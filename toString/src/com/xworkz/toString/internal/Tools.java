package com.xworkz.toString.internal;

public class Tools {
    private String name;
    private String use;
    private boolean isElectric;

    public Tools(String name, String use, boolean isElectric) {
        this.name = name;
        this.use = use;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Tools{" +
                "Name='" + name + '\'' +
                ", Use='" + use + '\'' +
                ", Electric=" + (isElectric ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 70004;
    }
}
