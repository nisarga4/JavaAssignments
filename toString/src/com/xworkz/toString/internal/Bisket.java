package com.xworkz.toString.internal;

public class Bisket {
    private String flavor;
    private int quantity;
    private double price;

    public Bisket(String flavor, int quantity, double price) {
        this.flavor = flavor;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bisket{Flavor='" + flavor + "', Quantity=" + quantity + ", Price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 555;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Bisket) {
                System.out.println("Ref is Bisket, will compare...");
                Bisket bisket1 = this;
                Bisket bisket2 = (Bisket) obj;
                if (bisket1.flavor.equals(bisket2.flavor) &&
                        bisket1.quantity == bisket2.quantity &&
                        bisket1.price == bisket2.price) {
                    System.out.println("Both Biskets are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
