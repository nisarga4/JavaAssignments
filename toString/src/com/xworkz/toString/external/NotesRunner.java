package com.xworkz.toString.external;

import com.xworkz.toString.internal.Notes;

public class NotesRunner {
    public static void main(String[] args) {
        Notes n1 = new Notes("Java", 80, true);
        Notes n2 = new Notes("Math", 120, false);

        System.out.println(n1);
        System.out.println(n2);

        System.out.println("HashCode1: " + n1.hashCode());
        System.out.println("HashCode2: " + n2.hashCode());
        System.out.println(new Notes("Physics", 100, true).hashCode());
    }
}
