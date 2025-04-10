package com.xworkz.toString.external;

import com.xworkz.toString.internal.Color;

public class ColorRunner {
    public static void main(String[] args) {
        Color color1 = new Color("Red", "#FF0000", true);
        Color color2 = new Color("Cyan", "#00FFFF", false);

        System.out.println(color1);
        System.out.println(color2);

        int code1 = color1.hashCode();
        System.out.println("Code1: " + code1);

        int code2 = color2.hashCode();
        System.out.println("Code2: " + code2);

        System.out.println(new Color("Blue", "#0000FF", true).hashCode());
    }
}
