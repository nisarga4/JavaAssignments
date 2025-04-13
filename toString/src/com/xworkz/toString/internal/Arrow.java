package com.xworkz.toString.internal;

public class Arrow {
    private String material;
    private int length;
    private String usage;

    public Arrow(String material, int length, String usage) {
        this.material = material;
        this.length = length;
        this.usage = usage;
    }

    @Override
    public String toString() {
        return "Arrow{Material='" + material + "', Length=" + length + ", Usage='" + usage + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 444;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Arrow) {
                System.out.println("Ref is Arrow, will compare...");
                Arrow arrow1 = this;
                Arrow arrow2 = (Arrow) obj;
                if (arrow1.material.equals(arrow2.material) &&
                        arrow1.length == arrow2.length &&
                        arrow1.usage.equals(arrow2.usage)) {
                    System.out.println("Both arrows are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
