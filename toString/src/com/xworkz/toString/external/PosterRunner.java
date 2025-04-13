package com.xworkz.toString.external;

import com.xworkz.toString.internal.Poster;

public class PosterRunner {
    public static void main(String[] args) {
        Poster poster1 = new Poster("Starry Night", "Vincent van Gogh", 1889);
        System.out.println(poster1);

        int hash = poster1.hashCode();
        System.out.println("Hash Code: " + hash);

        Poster poster2 = new Poster("Starry Night", "Vincent van Gogh", 1889);
        Poster poster3 = new Poster("Mona Lisa", "Leonardo da Vinci", 1503);

        System.out.println("Checking same location: " + (poster1 == poster2));
        boolean same = poster1.equals(poster2);
        System.out.println("Poster1 is same as Poster2: " + same);

        boolean different = poster1.equals(poster3);
        System.out.println("Poster1 is same as Poster3: " + different);
    }
}
