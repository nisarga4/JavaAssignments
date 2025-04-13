package com.xworkz.toString.internal;

public class Mango {
    private String variety;
    private double weight;
    private String origin;

    public Mango(String variety, double weight, String origin) {
        this.variety = variety;
        this.weight = weight;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Mango{Variety='" + variety + "', Weight=" + weight + "kg, Origin='" + origin + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 707;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Mango) {
                Mango m1 = this;
                Mango m2 = (Mango) obj;
                if (m1.variety.equals(m2.variety) && m1.weight == m2.weight && m1.origin.equals(m2.origin)) {
                    return true;
                }
            }
        }
        return false;
    }
}
