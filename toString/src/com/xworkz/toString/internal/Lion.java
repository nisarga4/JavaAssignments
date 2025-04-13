package com.xworkz.toString.internal;

public class Lion {
    private String name;
    private int age;
    private String habitat;

    public Lion(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Lion{Name='" + name + "', Age=" + age + ", Habitat='" + habitat + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 777;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Lion) {
                Lion l1 = this;
                Lion l2 = (Lion) obj;
                if (l1.name.equals(l2.name) && l1.age == l2.age && l1.habitat.equals(l2.habitat)) {
                    return true;
                }
            }
        }
        return false;
    }
}
