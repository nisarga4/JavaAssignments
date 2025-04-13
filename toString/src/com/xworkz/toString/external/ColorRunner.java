package com.xworkz.toString.external;

import com.xworkz.toString.internal.Color;

public class ColorRunner {
    public static void main(String[] args) {
        Color color1 = new Color("Red", "#FF0000");
        System.out.println(color1);

        int hash = color1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(color1));

        Color color2 = new Color("Red", "#FF0000");
        Color color3 = new Color("Blue", "#0000FF");

        System.out.println("Checking same location: " + (color1 == color2));
        boolean same = color1.equals(color2);
        System.out.println("Color1 is same as Color2: " + same);

        System.out.println("Color1 is same as Color3: " + color1.equals(color3));
    }
}
