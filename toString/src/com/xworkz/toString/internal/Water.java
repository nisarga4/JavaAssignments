package com.xworkz.toString.internal;

public class Water {
    private String source;
    private double quantity; // in liters
    private String quality;

    public Water(String source, double quantity, String quality) {
        this.source = source;
        this.quantity = quantity;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Water{Source='" + source + "', Quantity=" + quantity + "L, Quality='" + quality + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 987;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Water) {
                Water water1 = this;
                Water water2 = (Water) obj;
                if (water1.source.equals(water2.source) && water1.quantity == water2.quantity && water1.quality.equals(water2.quality)) {
                    return true;
                }
            }
        }
        return false;
    }
}
