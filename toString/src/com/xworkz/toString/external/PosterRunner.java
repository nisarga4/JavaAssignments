package com.xworkz.toString.external;

import com.xworkz.toString.internal.Poster;

public class PosterRunner {
    public static void main(String[] args) {
        Poster p1 = new Poster("Motivational", "A3", true);
        Poster p2 = new Poster("Movie", "A2", false);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("HashCode1: " + p1.hashCode());
        System.out.println("HashCode2: " + p2.hashCode());
        System.out.println(new Poster("Nature", "A4", true).hashCode());
    }
}
