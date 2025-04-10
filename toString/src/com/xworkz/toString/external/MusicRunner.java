package com.xworkz.toString.external;

import com.xworkz.toString.internal.Music;

public class MusicRunner {
    public static void main(String[] args) {
        Music m1 = new Music("Pop", "Taylor Swift", 4);
        Music m2 = new Music("Rock", "Queen", 5);

        System.out.println(m1);
        System.out.println(m2);

        System.out.println("HashCode1: " + m1.hashCode());
        System.out.println("HashCode2: " + m2.hashCode());
        System.out.println(new Music("Jazz", "Norah Jones", 6).hashCode());
    }
}
