package com.xworkz.toString.internal;

public class Pocket {
    private String material;
    private double size;
    private boolean isSewn;

    public Pocket(String material, double size, boolean isSewn) {
        this.material = material;
        this.size = size;
        this.isSewn = isSewn;
    }

    @Override
    public String toString() {
        return "Pocket{" +
                "Material='" + material + '\'' +
                ", Size=" + size + " cm" +
                ", Is Sewn=" + isSewn +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Pocket) {
                Pocket otherPocket = (Pocket) obj;
                return this.material.equals(otherPocket.material) &&
                        this.size == otherPocket.size &&
                        this.isSewn == otherPocket.isSewn;
            }
        }
        return false;
    }
}
