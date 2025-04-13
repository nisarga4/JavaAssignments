
package com.xworkz.toString.internal;

public class Color {
    private String name;
    private String hexCode;

    public Color(String name, String hexCode) {
        this.name = name;
        this.hexCode = hexCode;
    }

    @Override
    public String toString() {
        return "Color{Name='" + name + "', HexCode='" + hexCode + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 99;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Color) {
                System.out.println("Ref is Color, will compare...");
                Color color1 = this;
                Color color2 = (Color) obj;
                if (color1.name.equals(color2.name) && color1.hexCode.equals(color2.hexCode)) {
                    System.out.println("Both colors are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
