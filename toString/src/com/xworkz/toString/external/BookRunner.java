package com.xworkz.toString.external;

import com.xworkz.toString.internal.Book;

public class BookRunner {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 299.0);
        System.out.println(book1);

        int hash = book1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(book1));

        Book book2 = new Book("The Alchemist", "Paulo Coelho", 299.0);
        Book book3 = new Book("The Power of Now", "Eckhart Tolle", 399.0);

        System.out.println("Checking same location: " + (book2 == book3));
        boolean same = book2.equals(book3);
        System.out.println("Book2 is same as Book3: " + same);
    }
}
