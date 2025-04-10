package com.xworkz.toString.external;

import com.xworkz.toString.internal.Book;

public class BookRunner {
    public static void main(String[] args) {
        Book book1 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 250.0);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 300.0);

        System.out.println(book1);
        System.out.println(book2);

        int code1 = book1.hashCode();
        System.out.println("Code1: " + code1);

        int code2 = book2.hashCode();
        System.out.println("Code2: " + code2);

        System.out.println(new Book("1984", "George Orwell", 199.0).hashCode());
    }
}
