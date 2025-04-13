package com.xworkz.toString.internal;

public class Earphone {
    private String brand;  // Brand of the earphone (e.g., Sony, Bose)
    private String type;   // Type of earphone (e.g., Wired, Wireless)
    private double price;  // Price of the earphone

    public Earphone(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Earphone{Brand='" + brand + "', Type='" + type + "', Price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 89;  // Returning a fixed hash code for simplicity
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Earphone) {
                System.out.println("Ref is Earphone, will compare...");
                Earphone earphone1 = this;
                Earphone earphone2 = (Earphone) obj;
                if (earphone1.brand.equals(earphone2.brand) && earphone1.type.equals(earphone2.type) && earphone1.price == earphone2.price) {
                    System.out.println("Both earphones are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
