package com.xworkz.toString.external;

import com.xworkz.toString.internal.Book;

    public class BookRunner {
        public static void main(String[] args) {
            Book book1 = new Book("Atomic Habits", "James Clear", "Self-help", 449.00);
            Book book2 = new Book("1984", "George Orwell", "Dystopian", 299.99);

            System.out.println(book1);
            System.out.println(book2);
        }
    }

