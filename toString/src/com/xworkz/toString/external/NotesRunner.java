package com.xworkz.toString.external;

import com.xworkz.toString.internal.Notes;

public class NotesRunner {
    public static void main(String[] args) {
        Notes notes1 = new Notes("Mathematics", 100, "English");
        System.out.println(notes1);

        int hash = notes1.hashCode();
        System.out.println("Hash Code: " + hash);

        Notes notes2 = new Notes("Mathematics", 100, "English");
        Notes notes3 = new Notes("Physics", 120, "English");

        System.out.println("Checking same location: " + (notes1 == notes2));
        boolean same = notes1.equals(notes2);
        System.out.println("Notes1 is same as Notes2: " + same);

        boolean different = notes1.equals(notes3);
        System.out.println("Notes1 is same as Notes3: " + different);
    }
}
