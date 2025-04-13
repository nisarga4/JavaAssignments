package com.xworkz.toString.internal;

public class Drumstick {
    private String type;  // Type of Drumstick (e.g., Chicken, Mutton)
    private double weight;  // Weight of the Drumstick in grams
    private boolean spicy;  // Whether the Drumstick is spicy or not

    public Drumstick(String type, double weight, boolean spicy) {
        this.type = type;
        this.weight = weight;
        this.spicy = spicy;
    }

    @Override
    public String toString() {
        return "Drumstick{Type='" + type + "', Weight=" + weight + "g, Spicy=" + (spicy ? "Yes" : "No") + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 456;  // Returning a fixed hash code for simplicity
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Drumstick) {
                System.out.println("Ref is Drumstick, will compare...");
                Drumstick drumstick1 = this;
                Drumstick drumstick2 = (Drumstick) obj;
                if (drumstick1.type.equals(drumstick2.type) && drumstick1.weight == drumstick2.weight && drumstick1.spicy == drumstick2.spicy) {
                    System.out.println("Both Drumsticks are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
