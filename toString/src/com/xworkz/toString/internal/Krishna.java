package com.xworkz.toString.internal;

public class Krishna {
    private String avatar;
    private String weapon;
    private String location;

    public Krishna(String avatar, String weapon, String location) {
        this.avatar = avatar;
        this.weapon = weapon;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Krishna{" +
                "Avatar='" + avatar + '\'' +
                ", Weapon='" + weapon + '\'' +
                ", Location='" + location + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 18018;
    }
}
