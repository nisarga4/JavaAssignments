package com.xworkz.toString.internal;

public class Long {
    private String type;
    private double length;
    private String material;

    public Long(String type, double length, String material) {
        this.type = type;
        this.length = length;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Long{Type='" + type + "', Length=" + length + ", Material='" + material + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 111;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Long) {
                Long l1 = this;
                Long l2 = (Long) obj;
                if (l1.type.equals(l2.type) && l1.length == l2.length && l1.material.equals(l2.material)) {
                    return true;
                }
            }
        }
        return false;
    }
}
