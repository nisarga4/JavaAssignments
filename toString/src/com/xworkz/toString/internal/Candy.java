package com.xworkz.toString.internal;

public class Candy {
    private String flavor;
    private String color;
    private double weight;

    public Candy(String flavor, String color, double weight) {
        this.flavor = flavor;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Candy{Flavor='" + flavor + "', Color='" + color + "', Weight=" + weight + "g}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 200;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Candy) {
                System.out.println("Ref is Candy, will compare...");
                Candy candy1 = this;
                Candy candy2 = (Candy) obj;
                if (candy1.flavor.equals(candy2.flavor) && candy1.color.equals(candy2.color) && candy1.weight == candy2.weight) {
                    System.out.println("Both Candies are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
