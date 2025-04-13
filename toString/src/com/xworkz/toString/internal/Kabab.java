package com.xworkz.toString.internal;

public class Kabab {
    private String type;
    private int quantity;
    private String spiceLevel;

    public Kabab(String type, int quantity, String spiceLevel) {
        this.type = type;
        this.quantity = quantity;
        this.spiceLevel = spiceLevel;
    }

    @Override
    public String toString() {
        return "Kabab{Type='" + type + "', Quantity=" + quantity + ", SpiceLevel='" + spiceLevel + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 777;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Kabab) {
                Kabab kabab1 = this;
                Kabab kabab2 = (Kabab) obj;
                if (kabab1.type.equals(kabab2.type) && kabab1.quantity == kabab2.quantity && kabab1.spiceLevel.equals(kabab2.spiceLevel)) {
                    return true;
                }
            }
        }
        return false;
    }
}
