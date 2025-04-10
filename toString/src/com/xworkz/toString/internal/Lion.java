package com.xworkz.toString.internal;

public class Lion {
    private String type;
    private int age;
    private String origin;

    public Lion(String type, int age, String origin) {
        this.type = type;
        this.age = age;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "Type='" + type + '\'' +
                ", Age=" + age +
                ", Origin='" + origin + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 20020;
    }
}
