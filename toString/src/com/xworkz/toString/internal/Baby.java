package com.xworkz.toString.internal;

public class Baby {
    private String name;
    private int ageInMonths;
    private String favoriteToy;

    public Baby(String name, int ageInMonths, String favoriteToy) {
        this.name = name;
        this.ageInMonths = ageInMonths;
        this.favoriteToy = favoriteToy;
    }

    @Override
    public String toString() {
        return "Baby{Name='" + name + "', AgeInMonths=" + ageInMonths + ", FavoriteToy='" + favoriteToy + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 313;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Baby) {
                System.out.println("Ref is Baby, will compare...");
                Baby baby1 = this;
                Baby baby2 = (Baby) obj;
                if (baby1.name.equals(baby2.name) &&
                        baby1.ageInMonths == baby2.ageInMonths &&
                        baby1.favoriteToy.equals(baby2.favoriteToy)) {
                    System.out.println("Both babies are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
