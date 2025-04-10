package com.xworkz.toString.internal;

public class Salman {
    private String profession;
    private int age;
    private boolean isFamous;

    public Salman(String profession, int age, boolean isFamous) {
        this.profession = profession;
        this.age = age;
        this.isFamous = isFamous;
    }

    @Override
    public String toString() {
        return "Salman{" +
                "Profession='" + profession + '\'' +
                ", Age=" + age +
                ", Famous=" + (isFamous ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 60060;
    }
}
