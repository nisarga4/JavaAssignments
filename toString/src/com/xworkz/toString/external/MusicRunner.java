package com.xworkz.toString.external;

import com.xworkz.toString.internal.Music;

public class MusicRunner {
    public static void main(String[] args) {
        Music music1 = new Music("Shape of You", "Ed Sheeran", 233);
        System.out.println(music1);

        int hash = music1.hashCode();
        System.out.println("Hash Code: " + hash);

        Music music2 = new Music("Shape of You", "Ed Sheeran", 233);
        Music music3 = new Music("Blinding Lights", "The Weeknd", 200);

        System.out.println("Checking same location: " + (music1 == music2));
        boolean same = music1.equals(music2);
        System.out.println("Music1 is same as Music2: " + same);

        boolean different = music1.equals(music3);
        System.out.println("Music1 is same as Music3: " + different);
    }
}
