package com.xworkz.toString.internal;

public class Clip {
    private String type;
    private String color;
    private double size;

    public Clip(String type, String color, double size) {
        this.type = type;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clip{Type='" + type + "', Color='" + color + "', Size=" + size + "cm}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 87;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Clip) {
                System.out.println("Ref is Clip, will compare...");
                Clip clip1 = this;
                Clip clip2 = (Clip) obj;
                if (clip1.type.equals(clip2.type) && clip1.color.equals(clip2.color) && clip1.size == clip2.size) {
                    System.out.println("Both clips are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
