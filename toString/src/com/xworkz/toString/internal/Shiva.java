package com.xworkz.toString.internal;

public class Shiva {
    private String avatar;
    private String weapon;
    private String mount;

    public Shiva(String avatar, String weapon, String mount) {
        this.avatar = avatar;
        this.weapon = weapon;
        this.mount = mount;
    }

    @Override
    public String toString() {
        return "Shiva{" +
                "Avatar='" + avatar + '\'' +
                ", Weapon='" + weapon + '\'' +
                ", Mount='" + mount + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 35035;
    }
}
