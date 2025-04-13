package com.xworkz.toString.internal;

public class Unicorn {
    private String name;
    private String color;
    private int age;

    public Unicorn(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Unicorn{Name='" + name + "', Color='" + color + "', Age=" + age + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 200;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Unicorn) {
                Unicorn unicorn1 = this;
                Unicorn unicorn2 = (Unicorn) obj;
                if (unicorn1.name.equals(unicorn2.name) && unicorn1.color.equals(unicorn2.color) && unicorn1.age == unicorn2.age) {
                    return true;
                }
            }
        }
        return false;
    }
}
