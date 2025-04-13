package com.xworkz.toString.internal;

public class Krishna {
    private String avatar;
    private String weapon;
    private String color;

    public Krishna(String avatar, String weapon, String color) {
        this.avatar = avatar;
        this.weapon = weapon;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Krishna{Avatar='" + avatar + "', Weapon='" + weapon + "', Color='" + color + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 501;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Krishna) {
                Krishna k1 = this;
                Krishna k2 = (Krishna) obj;
                if (k1.avatar.equals(k2.avatar) && k1.weapon.equals(k2.weapon) && k1.color.equals(k2.color)) {
                    return true;
                }
            }
        }
        return false;
    }
}
