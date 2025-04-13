package com.xworkz.toString.internal;

public class Army {
    private String country;
    private int soldiers;
    private String type;

    public Army(String country, int soldiers, String type) {
        this.country = country;
        this.soldiers = soldiers;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Army{Country='" + country + "', Soldiers=" + soldiers + ", Type='" + type + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 301;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Army) {
                System.out.println("Ref is Army, will compare...");
                Army army1 = this;
                Army army2 = (Army) obj;
                if (army1.country.equals(army2.country) &&
                        army1.soldiers == army2.soldiers &&
                        army1.type.equals(army2.type)) {
                    System.out.println("Both armies are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
