package com.xworkz.toString.internal;

public class Dosa {
    private String type;  // Type of Dosa (e.g., Masala, Plain)
    private double size;  // Size in inches
    private boolean crispy;  // Is the Dosa crispy or not

    public Dosa(String type, double size, boolean crispy) {
        this.type = type;
        this.size = size;
        this.crispy = crispy;
    }

    @Override
    public String toString() {
        return "Dosa{Type='" + type + "', Size=" + size + " inches, Crispy=" + (crispy ? "Yes" : "No") + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 123;  // Returning a fixed hash code for simplicity
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Dosa) {
                System.out.println("Ref is Dosa, will compare...");
                Dosa dosa1 = this;
                Dosa dosa2 = (Dosa) obj;
                if (dosa1.type.equals(dosa2.type) && dosa1.size == dosa2.size && dosa1.crispy == dosa2.crispy) {
                    System.out.println("Both Dosas are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
