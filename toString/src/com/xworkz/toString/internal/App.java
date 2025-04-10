package com.xworkz.toString.internal;

public class App {
    private String name;
    private double version;
    private String developer;

    public App(String name, double version, String developer) {
        this.name = name;
        this.version = version;
        this.developer = developer;
    }

    @Override
    public String toString() {
        return "App{" +
                "Name='" + name + '\'' +
                ", Version=" + version +
                ", Developer='" + developer + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 333;
    }
}
