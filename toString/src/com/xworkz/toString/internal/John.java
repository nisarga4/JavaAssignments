package com.xworkz.toString.internal;

public class John {
    private int age;
    private String profession;
    private String city;

    public John(int age, String profession, String city) {
        this.age = age;
        this.profession = profession;
        this.city = city;
    }

    @Override
    public String toString() {
        return "John{" +
                "Age=" + age +
                ", Profession='" + profession + '\'' +
                ", City='" + city + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 80009;
    }
}
