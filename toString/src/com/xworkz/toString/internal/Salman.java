package com.xworkz.toString.internal;

public class Salman {
    private String name;
    private int age;
    private String profession;

    public Salman(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Salman{" +
                "Name='" + name + '\'' +
                ", Age=" + age +
                ", Profession='" + profession + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Salman) {
                Salman otherSalman = (Salman) obj;
                return this.name.equals(otherSalman.name) &&
                        this.age == otherSalman.age &&
                        this.profession.equals(otherSalman.profession);
            }
        }
        return false;
    }
}
